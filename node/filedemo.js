var http = require("http");
var fs = required("fs");
http
    .createServer(function (request, response) {
        fs.readFile("submit.html", function (err, data) {
            response.writeHead(200, { "Content-Type": "text/plain" });
            response.write(data);
            response.end("end");
        });
    })
    .listen(8081);

console.log("Server running at http://127.0.0.1:8081/");
