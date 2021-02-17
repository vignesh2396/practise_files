<?php

$server = "localhost";
$user = "user";
$password = "test_pass";
$dbname = "vignesh";

// connecting database
$conn = new mysqli($server, $user, $password, $dbname);

//check connection
if ($conn->connect_error) {
    die("connection error " . $conn->connect_error);
}
echo "<h1> Connection successful </h1>";

//setup sql query
$sql = "select Cid, FirstName, LastName, City from Customer";

//run the query
$result = mysqli_query($conn, $sql);
//or $result = $conn -> query(sql);

if (mysqli_num_rows($result) > 0) {
    //or if ($result -> num_rows > 0)

    //creating a table to get the output in table format
    echo "<table border=2><tr><th>Customer ID</th><th>Name</th><th>City</th></tr>";

    // to print each row using while loop
    //mysqli_fetch_assoc() function is used to put the result in array format

    while ($row = mysqli_fetch_assoc($result)) {
        //or while ($row = $result -> fetch_assoc())

        //method 1
        //        echo "customer id : " . $row["Cid"] . "- Name : " . $row["FirstName"] . " " . $row["LastName"] . "- City " . $row["City"] . "<br>";

        //method 2
        echo "<tr><td>" . $row["Cid"] . "</td><td>" . $row["FirstName"] . " " . $row["LastName"] . "</td><td>" . $row["City"] . "</td></tr>";
    }
} else {
    echo "empty table";
}

//closing the connection
mysqli_close($conn);
//or $conn ->close();
