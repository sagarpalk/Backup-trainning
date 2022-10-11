function loginHandler()
{
    var email=document.getElementById("InputEmail").value;
    var pass=document.getElementById("InputPassword").value;
    console.log(email+" "+ pass);
    fetch("http://localhost:3000/user")
     .then(function (response){
         return response.json();
     })
    .then(function(obj)
    {
        var usrdetail={
            "email":email,
            "password":pass,
           
        }
        obj.forEach(element => {
           if(element.email===email)
           {
               if(element.password===pass)
               {
                var localdata={
                    "email":email,
                    "password":pass,
                    "id":element.id,
                    "subscription":element.subscription,
                    "movidata":element.movidata
                   
       
                }
                   localStorage.setItem("currusr",JSON.stringify(localdata));
                   localStorage.setItem("code","12345")
               
                   window.location.href = "../../movie_libarary.html";
                   document.getElementById("not-valid").style.visibility="hidden";
               }
               else{
                   document.getElementById("pass-valid").style.visibility="visible";
               }
           }
           else{
            document.getElementById("not-valid").style.visibility="visible";
           }
        });
    })
    }
       