<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "Mydb";

    $conn = new mysqli($servername, $username, $password, $dbname);

    if($conn->connect_error){
        die("connecction failed". $conn->connect_error);
    }
    $sql = SELECT ID,firstname,lastname FROM Mytable;
    $result = $conn->query($sql);
    
    if($result->num_rows > 0){
        while($row = $result->fetch_assoc()){
            echo "<br> ID : ".$row["ID"]. "<br> First Name : ".$row["firstname"]. "<br> Last name : ".$row["lastname"]."<br>";
        }
    }
    else{
        echo "0 results";
    }
    $conn->close();
    ?>
</body>
</html>