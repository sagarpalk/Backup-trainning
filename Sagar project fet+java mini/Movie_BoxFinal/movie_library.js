

$.ajax({
  url: 'http://localhost:3000/movieData',
  dataType: 'json',
  success: function (data) {
    for (var i = 0; i < data.length; i++) {
      var row = $(
        '<div class="col-sm-4 filts ' + data[i].Genre + ' ">' +
        '<div class="card">' +
        '<img src="' + data[i].profile + '"alt="Card ">' +
        '<div class="card-body">' +
        '<h4 class="text-danger">' + data[i].title + '</h4>' +
        // '<button type="button" class="btn btn-outline-primary "><i class="fa fa-play" style="font-size:30px;color:rgb(18, 224, 197)"></i>' + data[i].video+'</button>'+
        '<a href="./moviepage2.html" target="_blank"><button type="button" id="videoBtn" class="btn btn-outline-primary "><i class="fa fa-play" style="font-size:25px;color:rgb(18, 224, 197)"></i></button></a>' +
        // '<button id="like" type="button" class="btn btn-outline-info "><i class="fa fa-heart" style="font-size:25px;color:red"></i></button>' +
        ' <p id="likediv">' + data[i].like + ' Likes </p>' +
        '<button id="test"  type="button" class="btn btn-outline-warning ">'+ data[i].id+'</button>' +
       
      
        '<br>' +
        '<small>' + data[i].Genre + '</small>' +
        '<small>' + data[i].id + '</small>' +
        '<p class="text-right"> Rating : ' + data[i].rating + '</p>' +
        '</div>' +
        '</div >' +
        '</div>');
      $('#myCards').append(row);


      //searching
      $("#myInput").on("keyup", function () {
        var value = $(this).val().toLowerCase();
        $("#myCards .filts").filter(function () {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });

      //kids movies
      $("#kids").click(function () {
        $(".filts").css("display", "none");
        $(".kids").show();
        $("#kids").mouseleave(function () {
          $("#kids").css("color", "red");
        });
      });

      //popular movies
      $("#popular").click(function () {
        $(".filts").css("display", "none");
        $(".Popular").show();
        $("#popular").mouseleave(function () {
          $("#popular").css("color", "greeen");
        });
      });

      //top rated movies
      $("#popular").click(function () {
        $(".filts").css("display", "none");
        $(".Popular").show();
        $("#popular").mouseleave(function () {
          $("#popular").css("color", "red");
        });
      });

      //language based- hindi
      $("#hindi").click(function () {
        $(".filts").css("display", "none");
        $(".Hindi").show();
        $("#hindi").mouseleave(function () {
          $("#hindi").css("color", "pink");
        });
      });

      //marathi movies
      $("#marathi").click(function () {
        $(".filts").css("display", "none");
        $(".Marathi").show();
        $("#marathi").mouseleave(function () {
          $("#marathi").css("background-color", "red");
        });
      });

      //thriller movies
      $("#thriller").click(function () {
        $(".filts").css("display", "none");
        $(".Thriller").show();
        $("#thriller").mouseleave(function () {
          $("#thriller").css("color", "red");
        });
      });
      //action movies
      $("#action").click(function () {
        $(".filts").css("display", "none");
        $(".Action").show();
        $("#action").mouseleave(function () {
          $("#action").css("color", "orange");
        });
      });

      //romantic movies
      $("#romantic").click(function () {
        $(".filts").css("display", "none");
        $(".Romantic").show();
        $("#romantic").mouseleave(function () {
          $("#romantic").css("color", "blue");
        });
      });

      //to show all movies together
      $("#allmovies").click(function () {
        $(".filts").show();
        $("#allmovies").mouseleave(function () {
          $("#allmovies").css("color", "Black");
        });
      });
      // for the moviepage
      var movieid = document.querySelectorAll('#videoBtn')
      for (let i = 0; i < movieid.length; i++) {
        movieid[i].addEventListener('click', () => {
          var temp = i
          console.log(temp)
          localStorage.setItem("sampleid", i + 1);
        })
      }
    }

  },
  error: function (jqXHR, textStatus, errorThrown) {
    alert('Error: ' + textStatus + ' - ' + errorThrown);
  }

});








