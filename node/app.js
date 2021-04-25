console.log(module) // built in module

const path = require('path')
var pathObj = path.parse(__filename)
console.log(pathObj)

// ------ Global objects ------

// console.log()

// setInterval()
// clearInterval()

// setTimeout()
// clearTimeout()

const log = require('./logger');
console.log(log);
log('vignesh');