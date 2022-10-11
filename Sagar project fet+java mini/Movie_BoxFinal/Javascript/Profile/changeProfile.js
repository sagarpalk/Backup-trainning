let currentUserData= JSON.parse(localStorage.getItem("currusr"));

document.getElementById("email").value=currentUserData.email
function changePasswordAndSubscription(){
    let newPassword=document.getElementById("newpaswword").value
    var subselect = document.getElementById("subtype").value;
    let oldPassword=document.getElementById("oldPassword").value
   // var sub = subselect.value;
    console.log(newPassword)
    let updateData={
        "id":currentUserData.id,
        "email":currentUserData.email,
        "password":newPassword,
        "subscription":subselect
       
    }
    console.log("formold : "+oldPassword)
    console.log("local Storage :"+currentUserData.password)
    if(currentUserData.password==oldPassword){
        $.ajax({
            url: "http://localhost:3000/user/"+currentUserData.id,
            type: 'PUT',
            data:updateData,
            success: function (res, status) {
   
                console.log(res,status)
   
   
   
            }
        });
    }
    else
    {
        alert("enter correct old password")
    }
   
   
 
 
}