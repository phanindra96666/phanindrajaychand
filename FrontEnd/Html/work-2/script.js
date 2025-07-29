function validationForm() {
    let x = document.forms["myForm"]["uname"].value.trim(); 
    let y = document.forms["myForm"]["password"].value;
    if (x === "" || y === "") {
        alert("Enter name and password");
        return false;
    }
    return true;
}