   $(function() {
       $(".card")
           .mouseover(function() {
               $url = this.src;

               $('body').children('img').attr('src', $url);
           })
           .mouseout(function() {
               $('body').children('img').attr('src', 'images/back.jpg');
           });
   });