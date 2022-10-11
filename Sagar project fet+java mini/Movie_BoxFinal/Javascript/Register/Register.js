function registerHandler() {
    var email = document.getElementById("InputEmail").value;
    var pass = document.getElementById("InputPassword").value;
    var cpass = document.getElementById("confirmPassword").value;
    var subselect = document.getElementById("subtype");
    var sub = subselect.value;
 

       
    // console.log(email + "" + pass + "" + sub);
  // debugger
    if (validateMail(email)) {
       document.getElementById("InputEmail").classList.add('changeBorder');
         if (validatePassword(pass)) {
           if (pass === cpass) {
                document.getElementById("InputPassword").classList.add('changeBorder');
                 document.getElementById("confirmPassword").classList.add('changeBorder');
                 var objectData = {
                    "email": email,
                    "password": pass,
                    "subscription": sub
                }
                $.ajax({
                    type: "POST",
                    url: "http://localhost:3000/user",
                    data: objectData,
                    dataType: "json"
                });
           }
       else {
          document.getElementById("InputPassword").classList.add('errorInputText');
          document.getElementById("confirmPassword").classList.add('errorInputText');
   }
     }
        else {
          document.getElementById("InputPassword").classList.add('errorInputText');
           document.getElementById("confirmPassword").classList.add('errorInputText');
       }
 }
     else {
    document.getElementById("InputEmail").classList.add('errorInputText');
}

 }
function validateMail(email) {
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (email.match(mailformat)) {
        return true;
    }
    else {
        return false;
    }
}
function validatePassword(pass) {
    var mailformat = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;
    if (pass.match(mailformat)) {
        return true;
    }
    else {
        return false;
    }
}
// json-server --watch ./Data/Login/User.json
