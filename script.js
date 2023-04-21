function setError(id, error) {
    element = document.getElementById(id);
    element.getElementsByClassName('formError')[0].innerHTML = error;
}
function clearErrors()
{
    error=document.getElementsByClassName('formError');
    for(let item of error)
    {
        item.innerHTML="";
    }
}
function validateForm() {
    clearErrors();
    var returnVal = true;
    // Name:
    var name = document.forms['myForm']["fname"].value;
    if (name.length < 5) {
        setError("name", "*Length of name is too short");
        returnVal = false;
    }
    if (name.length == 0) {
        setError("name", "Enter your name");
        returnVal = false;
    }

    // Email:
    var email = document.forms['myForm']["femail"].value;
    if(email.length==0)
    {
        setError("email","*Enter valid E-mail ID")
        returnVal=false;
    }

    //Phone:
    var phone = document.forms['myForm']["fphone"].value;
    var phoneRegex = /^([0-9]){10}$/;

    if(!phoneRegex.test(phone))
    {
        setError("phone","*Enter Valid Phone Number");
        returnVal=false;
    }

    //Password:
    var password = document.forms['myForm']["fpass"].value;
    var pregex = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,16}$/;
    if(pregex.test(password) == false)
    {
    setError("pass","*Password should be atleast 6 character long, have maximum length of 16 and must contain mix of characters, digit, special characters");
        returnVal=false;
    }

    // Confirm Password:
    var cpassword = document.forms['myForm']["fcpass"].value;
    if(cpassword!=password)
    {
        setError("cpass","*Password & Confirm Password not matching");
        returnVal=false;
    }
    if(cpassword.length==0)
    {
        setError("cpass","*Please enter confirm password");
        returnVal=false;
    }

    // Gender:
    var genderElement = document.getElementsByName("Gender");
    if(!genderElement[0].checked && !genderElement[1].checked)
    {
        setError("gender","*Please Choose your gender");
        returnVal=false;
    }
    return returnVal;
}