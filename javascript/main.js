/* To Play and Pass the video in a button*/
var $btn = $(".play-pass");
var video = $(".videofile").get(0);

$btn.on('click', function(){
	if (video.paused){
	video.play();
	}
	else{
		video.pause();
	}	
});

/* To Play the video automatically when mouser pointer over 
the video and pause when it is moved out*/
var $hover = $(".videofile");

$hover.on('mouseenter', function(){
	$hover.get(0).play();
});

$hover.on('mouseout', function(){
	$hover.get(0).pause();
});