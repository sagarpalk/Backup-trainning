
    //onclick = "functionA(); functionB();"

    const key = localStorage.getItem("sampleid")
    const API_url = 'http://localhost:3000/movieData/' + [key];

    async function getMovieDetails() {
        const response = await fetch(API_url);
        const data = await response.json();
        let Data = JSON.stringify(data);
        //  $("#driver").click(function (event) {
        $('#M_title').html('<h1>' + data.title + '</h1> <p>A perfect place for movie lovers...</p>');
        $('#M_profile').html('<img src="' + data.profile + '"  alt="Sandwich" style="width:80%">');
        $('#M_data').html(
            '<span><h4 class="txt"> ' + data.title + ',</h4></span><span><h5 class="txt">| ' + data.Genre + ',</h5></span>' +
            '<p  class=""> Released on  ' + data.Release + '<p>' +
            '<button type="button" class="btn btn-warning">Rating: ' + data.rating +
            '</button>' +
            '<button type="button" class="btn btn-danger">likes:' + data.like +
            '</button><hr><hr>' +
            
            '<p  > Released on  ' + data.intro + '<p><hr>' +
                '<div class="container  text-center">'+
            // '<a  target="_blank"><button type="button" id="historyBtn" class="btn btn-primary mybtn">Play</button></a>' +
           '<path d="m8 2.748-.717-.737C5.6.281 2.514.878 1.4 3.053c-.523 1.023-.641 2.5.314 4.385.92 1.815 2.834 3.989 6.286 6.357 3.452-2.368 5.365-4.542 6.286-6.357.955-1.886.838-3.362.314-4.385C13.486.878 10.4.28 8.717 2.01L8 2.748zM8 15C-7.333 4.868 3.279-3.04 7.824 1.143c.06.055.119.112.176.171a3.12 3.12 0 0 1 .176-.17C12.72-3.042 23.333 4.867 8 15z"/>'+
           '</svg></button>'+
           '<video style="height: 400px; width: 500px;" controls src = "'+data.video+'" ></video>' +
           '<a href="./movie_libarary.html" target="_blank"><button type="button" id="" class="btn btn-success mybtn">To Main Menu</button></a>' +

         
           '</div>'

             

        );
       
       
    }
    getMovieDetails();
 
    
   
    
         
            

