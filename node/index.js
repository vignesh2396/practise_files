console.log("Hello vignesh");

/* blocking example*/
var fs = require("fs");
var data = fs.readFileSync("index.txt");
console.log(data.toString());
console.log("Program Ended");

/* Non-blocking example*/
var fs = require("fs");
fs.readFile("index.txt", function (err, data) {
    if (err) return console.error(err);
    console.log(data.toString());
});
console.log("program Ended");