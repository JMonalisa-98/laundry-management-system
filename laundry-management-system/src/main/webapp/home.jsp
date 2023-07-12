<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Laundry Management System Design</title>
    <link rel="stylesheet" href="style.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
    <nav>
        <div id="logoBlock">
            <h2>Laundry Management System</h2>
        </div>
       
    </nav>  
      
    <div id="menuBtn">
        <img src="photos/menu1.png" id="menu">
    </div>

    <aside>
       <ul>

        <li>Dashboard</li>
        <li><a href="dashboard.jsp">Laundry Request</a></li>
        <li><a href="vieworderequest.jsp">Request Status</a></li>
        
       </ul>
    </aside>
        <div class="dash">
            <a href="#">Dashboard/Overview</a>
        </div>
        <div class="box-conatiner" >
                <div class="box1">
                    <a href="" id="box5">View Details</a>
                </div>
                <div class="box2">
                    <a href="" id="box5">View Details</a>
                </div>
                <div class="box3">
                    <a href="" id="box5">View Details</a>
                </div>
                <div class="box4">
                    <a href="" id="box5">View Details</a>
                </div>
        </div>
        <table>
            <caption id="price"><b>Laundry Price(Per Unit)</b></caption>
            <thead> 
                   <tr>
                       <th>Top Wear Laundry Price</th>
                       <td>12</td>
                    </tr>

                    <tr>
                      <th>Bottom Wear Laundry Price</th>
                      <td>22</td>
                    </tr>

                    <tr>
                        <th>Woolen Cloth Laundry Price</th>
                        <td>20</td>
                      </tr>

                      <tr>
                        <th>Other Price</th>
                        <td>other price depend on cloth variety(other than above three catagory)</td>
                      </tr>
          </thead>           
    </table>
    <div class="footerBottom">
       <p>Copyright &copy;2023;<span>Laundry Management System</span></p>
    </div>
</body>
</html>