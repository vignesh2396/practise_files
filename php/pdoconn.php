<?php

$server = "localhost";
$user = "user";
$password = "test_pass";

/* try and catch block */
try{
$conn = new PDO("mysql:host = $server;dbname = vignesh",$user,$password);
$conn ->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
echo "<h1>Connection successful using pdo </h1>";
}
catch(PDOException $e){
echo "connection failed : " . $e ->getMessage();
}
?>