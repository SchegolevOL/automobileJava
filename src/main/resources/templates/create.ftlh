<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>create</h1>
<form method="post" action="/create">
    <label>Manufacturer: </label>
    <input type="text" name="manufacturer" placeholder="Enter manufacturer">
    <label>Model:</label>
    <input type="text" name="model" placeholder="Enter model">
    <label>Age:</label>
    <input type="text" name="age" placeholder="Enter age">
    <label>Engine Capacity:</label>
    <input type="number" name="engineCapacity" placeholder="Enter engine capacity">
    <label>Color:</label>
    <input type="text" name="color" placeholder="Enter color">
    <label>Type:</label>
    <input type="text" name="type" placeholder="Enter type">


    <input type="submit" value="Submit">
</form>
</body>
</html>