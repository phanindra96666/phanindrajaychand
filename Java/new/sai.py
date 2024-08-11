import numpy as np
import soundfile as sf
import tensorflow as tf
from tensorflow_tts.inference import AutoConfig, TFAutoModel, AutoProcessor
from IPython.display import Audio

# Load the processor, model configuration, and model for Tacotron2 and WaveNet
processor = AutoProcessor.from_pretrained("tensorspeech/tts-tacotron2-ljspeech-en")
tacotron2_config = AutoConfig.from_pretrained("tensorspeech/tts-tacotron2-ljspeech-en")
tacotron2 = TFAutoModel.from_pretrained("tensorspeech/tts-tacotron2-ljspeech-en", config=tacotron2_config)

wavenet_config = AutoConfig.from_pretrained("tensorspeech/tts-wavenet-ljspeech-en")
wavenet = TFAutoModel.from_pretrained("tensorspeech/tts-wavenet-ljspeech-en", config=wavenet_config)

def synthesize(text):
    # Preprocess the input text
    input_ids = processor.text_to_sequence(text)

    # Tacotron2 inference (text-to-mel spectrogram)
    mel_outputs, _, _, _ = tacotron2.inference(
        tf.constant([input_ids], dtype=tf.int32)
    )

    # WaveNet inference (mel spectrogram to audio waveform)
    audio = wavenet.inference(mel_outputs)[0, :, 0]

    # Save the audio to a file
    sf.write('output.wav', audio.numpy(), samplerate=22050)

    return audio.numpy()

# Example usage
text = "Hello, this is a test of the WaveNet text-to-speech synthesis."
audio = synthesize(text)

# Play the audio
Audio(audio, rate=22050)