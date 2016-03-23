/**
 * 
 */
$(document).ready(function () {
    $('.close').on('click', closeWindow)
   
});
function closeWindow() {
	
    var x = confirm('Exit Dominion');
    if(x) window.close();
  }