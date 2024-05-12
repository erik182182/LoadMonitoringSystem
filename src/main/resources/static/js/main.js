$( document ).ready(function() {
    sleep(3000);
    $('#overlay').fadeOut(1000);
    document.getElementById("overlay-full").style.display = "none";
});

function sleep(delay) {
    var start = new Date().getTime();
    while (new Date().getTime() < start + delay);
}