<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>php output</title>
</head>

<body>
    First number is : <?php echo $_POST["Fnum"]; ?> <br>
    Second number is : <?php echo $_POST["Snum"]; ?> <br>
    <!-- if else statement -->
    <?php

    $a = $_POST["Fnum"];
    $b = $_POST["Snum"];
    
    if ($a > $b) {
        echo "$a is greater than $b";
    } elseif ($b > $a) {
        echo "$b is greater than $a";
    } else {
        echo "both are equal";
    }
    ?> <br>

    <!-- switch case -->
    <?php
    $a = $_POST["dname"];
    switch ($a) {
        case 'tea':
            echo "your order for tea is ready";
            break;
        case 'coffee':
            echo "your order for coffee is ready";
            break;
        case 'juice':
            echo "your order for juice is ready";
            break;

        default:
            echo "please enter a valid order";
            break;
    }
    ?>
<!--
    /* while case */
    while ($a <= $b) {
        echo "$a <br>";
        $a += 1;
    }
    for ($x = $a; $x >= $b; $x--) {
        echo "$x <br>";
    }
    ?> -->
</body>

</html>