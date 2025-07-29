function validationForm() {
    let x = document.forms["myForm"]["uname"].value.trim(); 
    let y = document.forms["myForm"]["password"].value;

    if (x === "" || y === "") {
        alert("Please enter both username and password.");
        return false;
    }

    if (y.length < 2 || y.length > 8) {
        alert("Password must be between 2 and 8 characters long.");
        return false;
    }

    return true;
}
