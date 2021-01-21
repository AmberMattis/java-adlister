<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title> Pizza Order</title>
</head>
<dody>
    <form action="pizza-order.jsp" method="post">
        <h3>Build a Pizza</h3>

        <select name="size">
            <option value="Small">Small</option>
            <option value="Medium">Medium</option>
            <option value="Large">Large</option>
        </select>

        <br>
        <br>

        <select name="crust ">
            <option value="Thin">Thin crust</option>
            <option value="Original">Original crust</option>
            <option value="Stuffed">Stuffed crust</option>
        </select>

        <br>
        <br>

        <select name="sauce">
            <option value="Tomato">Robust inspired sauce</option>
            <option value="Original">Marinara</option>
            <option value="Stuffed">Garlic parmesan white sauce</option>
        </select>

        <br>
        <br>

        <input name="pepperoni" value="true" type="checkbox" >Pepperoni<br>
        <input name="Cheese" value="true" type="checkbox" >Cheese <br>
        <input name="Sausage" value="true" type="checkbox" >Sausage <br>
        <input name="Pineapple" value="true" type="checkbox" >Pineapple <br>
        <input name="Bacon" value="true" type="checkbox" >Bacon <br>

        <br>
        <br>

        <label for="address">Address</label><br>
        <input name="address" id="address" type="text" textarea="enter delivery address">
        <br>
        <br>

        <button name="submit" type="submit">Submit</button>

    </form>


</dody>
</html>