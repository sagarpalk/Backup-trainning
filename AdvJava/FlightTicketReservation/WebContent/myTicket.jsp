<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>feedbacklist</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

</head>
<body>
	<header>
	
	</header>
	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">My Ticket</h3>

			<div class="container text-left">

				<a href="<%=request.getContextPath()%>/myticket"
					class="btn btn-success">DownLoad My Ticket</a> <a
					href="<%=request.getContextPath()%>/list" class="btn btn-info">Cancel

					Ticket</a> <br>
				<hr>

				

					<tr>
						<c:out value="${myTick.tickitId}" />
						<c:out value="${myTick.lastName}" />
						<c:out value="${myTick.seviceCompany}" />
						<c:out value="${myTick.numberOfTickets}" />
						<c:out value="${myTick.seatType}" />


						
					
				
				
			</div>

<!-- public String toString() {
		return "BookingInfo [tickitId=" + tickitId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", flightName=" + flightName + ", seviceCompany=" + seviceCompany + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime
				+ ", flightType=" + flightType + ", source=" + source + ", destination=" + destination + ", Totalprice="
				+ Totalprice + ", status=" + status + ", numberOfTickets=" + numberOfTickets + ", priceEconomy="
				+ priceEconomy + ", pricePrimium=" + pricePrimium + ", priceBusiness=" + priceBusiness
				+ ", seatEconomy=" + seatEconomy + ", seatPrimium=" + seatPrimium + ", seatBusiness=" + seatBusiness
				+ ", offerName=" + offerName + ", offerrate=" + offerrate + ", seatType=" + seatType + "]";
	}
	*/ -->

			<c:out value="${myTick}" />



		</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
@import url("https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;700&display=swap");
   body, p, h1 {
     margin: 0;
     padding: 0;
     font-family: "Open Sans", sans-serif;
  }
   .container {
     background: #e0e2e8;
     position: relative;
     width: 100%;
     height: 100vh;
  }
   .container .ticket {
     position: absolute;
     top: 50%;
     left: 50%;
     transform: translate(-50%, -50%);
  }
   .container .basic {
     display: none;
  }
   .airline {
     display: block;
     height: 575px;
     width: 270px;
     box-shadow: 5px 5px 30px rgba(0, 0, 0, 0.3);
     border-radius: 25px;
     z-index: 3;
  }
   .airline .top {
     height: 220px;
     background: #ffcc05;
     border-top-right-radius: 25px;
     border-top-left-radius: 25px;
  }
   .airline .top h1 {
     text-transform: uppercase;
     font-size: 12px;
     letter-spacing: 2;
     text-align: center;
     position: absolute;
     top: 30px;
     left: 50%;
     transform: translateX(-50%);
  }
   .airline .bottom {
     height: 355px;
     background: #fff;
     border-bottom-right-radius: 25px;
     border-bottom-left-radius: 25px;
  }
   .top .big {
     position: absolute;
     top: 100px;
     font-size: 65px;
     font-weight: 700;
     line-height: 0.8;
  }
   .top .big .from {
     color: #ffcc05;
     text-shadow: -1px 0 #000, 0 1px #000, 1px 0 #000, 0 -1px #000;
  }
   .top .big .to {
     position: absolute;
     left: 32px;
     font-size: 35px;
     display: flex;
     flex-direction: row;
     align-items: center;
  }
   .top .big .to i {
     margin-top: 5px;
     margin-right: 10px;
     font-size: 15px;
  }
   .top--side {
     position: absolute;
     right: 35px;
     top: 110px;
     text-align: right;
  }
   .top--side i {
     font-size: 25px;
     margin-bottom: 18px;
  }
   .top--side p {
     font-size: 10px;
     font-weight: 700;
  }
   .top--side p + p {
     margin-bottom: 8px;
  }
   .bottom p {
     display: flex;
     flex-direction: column;
     font-size: 13px;
     font-weight: 700;
  }
   .bottom p span {
     font-weight: 400;
     font-size: 11px;
     color: #6c6c6c;
  }
   .bottom .column {
     margin: 0 auto;
     width: 80%;
     padding: 2rem 0;
  }
   .bottom .row {
     display: flex;
     justify-content: space-between;
  }
   .bottom .row--right {
     text-align: right;
  }
   .bottom .row--center {
     text-align: center;
  }
   .bottom .row-2 {
     margin: 30px 0 60px 0;
     position: relative;
  }
   .bottom .row-2::after {
     content: "";
     position: absolute;
     width: 100%;
     bottom: -30px;
     left: 0;
     background: #000;
     height: 1px;
  }
   .bottom .bar--code {
     height: 50px;
     width: 80%;
     margin: 0 auto;
     position: relative;
  }
   .bottom .bar--code::after {
     content: "";
     position: absolute;
     width: 6px;
     height: 100%;
     background: #000;
     top: 0;
     left: 0;
     box-shadow: 10px 0 #000, 30px 0 #000, 40px 0 #000, 67px 0 #000, 90px 0 #000, 100px 0 #000, 180px 0 #000, 165px 0 #000, 200px 0 #000, 210px 0 #000, 135px 0 #000, 120px 0 #000;
  }
   .bottom .bar--code::before {
     content: "";
     position: absolute;
     width: 3px;
     height: 100%;
     background: #000;
     top: 0;
     left: 11px;
     box-shadow: 12px 0 #000, -4px 0 #000, 45px 0 #000, 65px 0 #000, 72px 0 #000, 78px 0 #000, 97px 0 #000, 150px 0 #000, 165px 0 #000, 180px 0 #000, 135px 0 #000, 120px 0 #000;
  }
   .info {
     position: absolute;
     left: 50%;
     transform: translateX(-50%);
     bottom: 10px;
     font-size: 14px;
     text-align: center;
     z-index: 1;
  }
   .info a {
     text-decoration: none;
     color: #000;
     background: #ffcc05;
  }
   </style>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js" integrity="sha512-GsLlZN/3F2ErC5ifS5QtgpiJtWd43JWSuIgh7mbzZ8zBps+dvLusV+eNQATqgA/HdeKFVgA5v3S/cIrLF7QnIg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
   <script>
   function downloadpdf(){​​​​​​
       const ticket=document.getElementById("ticket");
       var worker = html2pdf().from(ticket).save();
   }​​​​​​
</script>

<body>
  <button onclick="downloadpdf()">download your ticket</button>
  <div class="container" id="ticket">

    <div class="ticket basic">
      <p><c:out value="${myTick.firstName}" /></p> &nbsp;
       <p><c:out value="${myTick.firstName}" /></p> &nbsp;
    </div>
  
    <div class="ticket airline">
      <div class="top">
        <h1>boarding pass</h1>
        <div class="big">
          <p class="from">BWI</p>
          <p class="to"><i class="fas fa-arrow-right"></i> SAN</p>
        </div>
        <div class="top--side">
          <i class="fas fa-plane"></i>
          <p>Baltimore</p>
          <p>San Diego</p>
        </div>
      </div>
      <div class="bottom">
        <div class="column">
          <div class="row row-1">
            <p><span>Flight</span>AA2005</p>
            <p class="row--right"><span>Gate</span>B3</p>
          </div>
          <div class="row row-2">
            <p><span>Boards</span>10:25 AM</p>
            <p class="row--center"><span>Departs</span>11:00 AM</p>
            <p class="row--right"><span>Arrives</span>1:05 PM</p>
          </div>
          <div class="row row-3">
            <p><span>Passenger</span>Jesus Ramirez</p>
            <p class="row--center"><span>Seat</span>11E</p>
            <p class="row--right"><span>Group</span>3</p>
          </div>
        </div>
        <div class="bar--code"></div>
      </div>
    </div>
  
    <div class="info">
      <p>Based on <a href="https://dribbble.com/shots/11399236-Boarding-Pass" target="_blank">this</a> Dribbble from Barna Erdei</p>
    </div>
  
  </div>
</body>
    

</html>