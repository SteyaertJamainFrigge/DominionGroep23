/**
 * 
 */
$(document).ready(function () {
    
    
});
var audio = new Audio('assets/music/MedievalMusic.mp3'); 
; 
audio.play();
audio.volume = 0.07; 
audio.loop = true; 

if(document.getElementById(music).checked == true ){
	audio.play();	
} else {
	audio.pause(); 
}






