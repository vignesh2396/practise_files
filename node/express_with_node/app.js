const helper = require("./helper");

let count = 0;

const timer = setInterval(() => {
  count = count + 2;
  console.log(`${count} seconds have passed`);
  if (count > 6) {
    clearInterval(timer);
  }
}, 2000);

console.log(__dirname);
console.log(__filename);

function callbackfunction(func) {
  console.log("red function accessed by callbackfunction");
  func();
}

let red = function () {
  console.log("hi there");
};

red();
callbackfunction(red);

console.log(helper("vignesh"));
