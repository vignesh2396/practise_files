window.value = 2000;
function msg() {
    newFunction();
    alert("FullStackWebDeveloper");
    document.write("web developer");
    document.writeln("JavaScript programmer");
 
    function newFunction() {
        alert(window.value);
    }

}

var add=new Function("num1","num2","return num1+num2");  
document.writeln(add(2,5)); 

var pow=new Function("num1","num2","return Math.pow(num1,num2)");  
document.writeln(pow(2,5)); 