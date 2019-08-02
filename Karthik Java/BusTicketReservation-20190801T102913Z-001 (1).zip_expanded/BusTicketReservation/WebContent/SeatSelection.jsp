<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./css/Style.css">

<title>Seat
</title>
<%-- <%@include file="header.jsp" %>
 --%>
</head>

<body>
<div>
<center><h1><b>SELECT THE SEAT</b></h1></center>
<form action="/BusTicketReservation/SeatSelectController" method="post">
<center>
  <table>

    <tr>
        <td><input name="seat" type="checkbox" value="1" disabled/><label for="one">1</label></td>
        <td><input name="seat" type="checkbox" value="2"/><label for="two">2</label></td>
        <td><input name="seat" type="checkbox" value="3"/><label for="three">3</label></td>
        <td><input name="seat" type="checkbox" value="4"/><label for="four">4</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="5"/><label for="five">5</label></td>
        <td><input name="seat" type="checkbox" value="6"/><label for="six">6</label></td>
        <td><input name="seat" type="checkbox" value="7"><label for="seven">7</label></td>
        <td><input name="seat" type="checkbox" value="8"/><label for="eight">8</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="9"/><label for="nine">9</label></td>
        <td><input name="seat" type="checkbox" value="10"/><label for="ten">10</label></td>
        <td><input name="seat" type="checkbox" value="11"/><label for="eleven">11</label></td>
        <td><input name="seat" type="checkbox" value="12"/><label for="twelve">12</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="13"/><label for="thirteen">13</label></td>
        <td><input name="seat" type="checkbox" value="14"/><label for="fourteen">14</label></td>
        <td><input name="seat" type="checkbox" value="15"/><label for="fifteen">15</label></td>
        <td><input name="seat" type="checkbox" value="16"/><label for="sixteen">16</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="17"/><label for="seventeen">17</label></td>
        <td><input name="seat" type="checkbox" value="18"/><label for="eighteen">18</label></td>
        <td><input name="seat" type="checkbox" value="19"/><label for="nineteen">19</label></td>
        <td><input name="seat" type="checkbox" value="20"/><label for="twenty">20</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="21"/><label for="twentyone">21</label></td>
        <td><input name="seat" type="checkbox" value="22"/><label for="twentytwo">22</label></td>
        <td><input name="seat" type="checkbox" value="23"/><label for="twentythree">23</label></td>
        <td><input name="seat" type="checkbox" value="24"/><label for="twentyfour">24</label></td>
    </tr>
       <tr>
        <td><input name="seat" type="checkbox" value="25"/><label for="twentyfive">25</label></td>
        <td><input name="seat" type="checkbox" value="26"/><label for="twentysix">26</label></td>
        <td><input name="seat" type="checkbox" value="27"/><label for="twentyseven">27</label></td>
        <td><input name="seat" type="checkbox" value="28"/><label for="twentyeight">28</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="29"/><label for="twentynine">29</label></td>
        <td><input name="seat" type="checkbox" value="30"/><label for="thirty">30</label></td>
        <td><input name="seat" type="checkbox" value="31"/><label for="thirtyone">31</label></td>
        <td><input name="seat" type="checkbox" value="32"/><label for="thirtytwo">32</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="33"/><label for="thirtythree">33</label></td>
        <td><input name="seat" type="checkbox" value="34"/><label for="thirtyfour">34</label></td>
        <td><input name="seat" type="checkbox" value="35"/><label for="thirtyfive">35</label></td>
        <td><input name="seat" type="checkbox" value="36"/><label for="thirtysix">36</label></td>
    </tr>
    <tr>
        <td><input name="seat" type="checkbox" value="37"/><label for="thirtyseven">37</label></td>
        <td><input name="seat" type="checkbox" value="38"/><label for="thirtyeight">38</label></td>
        <td><input name="seat" type="checkbox" value="39"/><label for="thirtynine">39</label></td>
        <td><input name="seat" type="checkbox" value="40"/><label for="fourty">40</label></td>
    </tr>
    
</table>
<input type = "submit" name="submit" />
</center>
</form>
</div>
</body>
</html>