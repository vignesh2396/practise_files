var video = document.getElementsByTagName("video")[0];
	video.controls = false;
	var play_pause = document.getElementById('Play_Pause');
	video.addEventListener('play',function(){
		play_pause.title = 'pause';
		play_pause.innerHTML = 'pause[0]';
	},false);
	video.addEventListener('pause',function(){
		play_pause.title = 'play';
		play_pause.innerHTML = 'play>>';
	},false);


	video.addEventListener('ended', function() { this.pause(); }, false);

	function togglePlay_Pause() {
		if (video.paused || video.ended) {
			if (video.ended) video.currentTime = 0;
				video.play();
		}
		else{
			video.pause();
		}
	}

	function StopVideo() {
		video.pause();
		video.currentTime = 0;
	}

	function AlterVolume(direction) {
		var volume = Math.floor(video.volume * 10) / 10;
		video.muted = false;
		if (direction == "-") {
			if (volume <= 0.1) video.volume = 0;
			else video.volume -= 0.1;
		}
		else {
			if (volume >= 0.9) video.volume = 1;
			else video.volume += 0.1;
		}
	}

	function ToggleMute_UnMute(){
		var mute = document.getElementById('mute')
		if(video.muted){
			mute.innerHTML = 'mute';
			video.muted = false;
		}
		else{
			mute.innerHTML = 'unmute';
			video.muted = true;
		}

	}

	function ManipulatePlaySpeed(direction){
		if (video.playbackRate != undefined) {
			if(direction == "-") video.playbackRate -=1;
			else video.playbackRate +=1;			
		}
		else{
			if (direction == "-") video.playbackRate -=1;
			else video.playbackRate +=1;
		}
	}

	function seekBar() {
var value = 0;
if (video.currentTime > 0) {
value = Math.floor((100 / video.duration) * video.currentTime);
}
document.getElementById("viewSeek").innerHTML = value + "%";
}
