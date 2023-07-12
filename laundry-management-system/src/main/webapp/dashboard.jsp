<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard/overview</title>
    <link rel="stylesheet" href="dashboard.css">
</head>
<body>
     
    <div class="container">
        <h1>Order Request</h1>
        <form action="saveorderequest">
          <input type="email" name="email" value="<%= session.getAttribute("email") %>" readonly hidden>
            <div class="form_container">
                <div class="form_control">
                    <!-- <input type="date" id="date" name="date" > -->
                    <input placeholder="pick up/Drop Date" id="date" name="date" type="text" onfocus="(this.type='date')">
                </div>
                <div class="form_control">
                    <input id="top_wear" name="top_wear" placeholder="Topwear(Tshirt,Top,Shirt)">
                </div>
                <div class="form_control">
                    <input id="bottom_wear" name="bottom_wear" placeholder="Bottomwear(Lower,Jeans,Leggins)">
                </div>
                <div class="form_control">
                    <input id="woolen_cloth" name="woolen_cloth" placeholder="Woolen Cloth">
                </div>
                <div class="form_control">
                    <input id="other_box" name="other_box" placeholder="Others">
                </div>
                <select id="service_type" name="service_type">
                    <option value="">Selective Service type</option>
                    <option value="fast_service">Fast Service</option>
                    <option value="reular_service">Regular Service</option>
                  
                </select>
                <div class="form_control">
                    <input id="contact_person" name="contact_person" placeholder="Contact Person">
                </div>
                <div class="text_control">
                    <textarea id="descrip_tion" name="descrip_tion" rows="4" cols="30" placeholder="Description(if any)"></textarea>
                    <!-- <input id="descrip_tion" name="descrip_tion" placeholder="Description(if any)"> -->
                </div>
            </div>
            </div>
            <div class="button_container">
                 <button type="submit">submit</button>
            </div>
        </form> 
    </div>
</body>
</html> 