import java.util.Scanner;

class Bank {
    String bankName;
    double balance;
    int pin;

    public Bank(String bankName, double balance, int pin) {
        this.bankName = bankName;
        this.balance = balance;
        this.pin = pin;
    }
}

class Paytm extends Bank {
    private String upiId;

    public Paytm(String bankName, double balance, int pin, String upiId) {
        super(bankName, balance, pin);
        this.upiId = upiId;
    }

    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println(bankName + " " + balance + " " + upiId);
    }
}

class PhonePay extends Bank {
    private String upiId;

    public PhonePay(String bankName, double balance, int pin, String upiId) {
        super(bankName, balance, pin);
        this.upiId = upiId;
    }

    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println(bankName + " " + balance + " " + upiId);
    }
}

class GooglePay extends Bank {
    private String upiId;

    public GooglePay(String bankName, double balance, int pin, String upiId) {
        super(bankName, balance, pin);
        this.upiId = upiId;
    }

    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println(bankName + " " + balance + " " + upiId);
    }
}

class J010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Paytm paytm = new Paytm("SBI", 10000, 1234, "user@paytm");
        PhonePay phonePay = new PhonePay("HDFC", 8000, 4321, "user@phonepe");
        GooglePay googlePay = new GooglePay("ICICI", 12000, 1111, "user@okgoogle");

        int choice = scanner.nextInt();
        double amount = scanner.nextDouble();

        switch (choice) {
            case 1:
                paytm.pay(amount);
                paytm.display();
                break;
            case 2:
                phonePay.pay(amount);
                phonePay.display();
                break;
            case 3:
                googlePay.pay(amount);
                googlePay.display();
                break;
        }
        scanner.close();
    }
}
