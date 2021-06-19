var url = "http://www.google.com";

function log(message) {
    console.log(message);
}

// module.exports.log = log;

// If we are having only single function in our module then,
// we can directly give
module.exports = log;
