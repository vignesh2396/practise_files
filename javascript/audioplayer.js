var player, durationOutput, elapsedOutput, myInterval, playing;
window.onload =  function(){
    document.getElementById('playbtn').addEventListener('click',playMusic,false);
    document.getElementById('pausebtn').addEventListener('click',pauseMusic,false);
    document.getElementById('nxtbtn').addEventListener('click',nextMusic,false);
    play = document.getElementById('myaudio');
    durationOutput = document.getElementById('duration');
    elapsedOutput = document.getElementById('elapsed');
    play.addEventListener('error',audioerror,false);
    play.addEventListener('ended',mediaended,false);
}
function audioerror(){
    window.alert("file corrupted");
}
function mediaended(){
    durationOutput.innerHTML = "";
    elapsedOutput.innerHTML = "";
    alert("completed");
    play.pause();
}
function playMusic(){
    play.play();
    durationOutput.innerHTML = Math.round(play.duration);
}
function pauseMusic(){
    play.pause();
}
playing =0;
function nextMusic(){
if(playing == 0){
    play.pause();
    play.src = "../audio/audio.mp3";
    play.play();
    playing = 1;
}
else {
    play.pause();
    play.src = "../audio/audio1.mp3";
    play.play();
    playing = 0;
}
}
myInterval = setInterval(update, 500)
function update(){
    elapsedOutput.innerHTML = Math.round(play.currentTime);
}