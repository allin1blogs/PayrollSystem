<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Profile</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="../css/employeepersonalinfo.css">
</head>
<body>

<div class="main-wrapper content-wrapper" >
    <div class="container">
        <div class="row">
        <div class="col-lg-2 col-12 col-sm-12" style="background-color:whitesmoke !important;">
        <%@ include file = "../header.jsp" %>
		</div>
		<div class="col-lg-10 col-12 col-sm-12" style="background-color:whitesmoke !important;">
		<!-- BASIC INFO -->
                <div class="tabs-wrapper" >
				<form action="addEmployee" method="post">
				<div class="col-lg-12 no-padding" >
                        <div class="row">
						<div class="form-group">
							<h4>BASIC INFO</h4>
							<hr>
						</div>
						</div>
					</div>
                   <div class="col-lg-12 no-padding">
                        <div class="row">
							<table class="table">
							<thead>
							<tr>
							<th>Name</th>
							<th>Relationship</th>
							<th>Date of birth</th>
							<th>Dependent</th>
							</tr>
							</thead>
							<tbody>
							<tr>
							<td><input type="text" class="form-control" id="familymember_name"  placeholder="Enter Name"name="familymember_name"></td>
							<td>
							<select class="form-control" id="familymember_relationship">
							<option value="">Relationship</option>
							<option value="0">Father</option>
							<option value="1">Mother</option>
							<option value="0">Husband</option>
							<option value="1">Wife</option>
							<option value="0">Son</option>
							<option value="1">Daughter</option>
							<option value="0">Brother</option>
							<option value="1">Sister</option>
						  </select>
							</td>
							<td><input type="date" class="form-control" id="familymember_dateofbirth"  name="familymember_dateofbirth"></td>
							<td><input type="text" class="form-control" id="familymember_dependant"  placeholder="Enter Yes/No" name="familymember_dependant"></td>
							</tr>
							</tbody>
							</table>
						</div>
					</div>
					<div class="col-lg-12 no-padding" >
                        <div class="row">
						<div class="form-group" style="float:right;margin-right:20px;">
						<button type="submit" value="submit" class="btn btn-danger">Submit</button>
						<button type="reset" class="btn btn-default">Cancel</button>
						</div>
						</div>
					</div>
					</form>
				</div>
				<!-- BASIC INFO -->
                <div class="tabs-wrapper" >
				<form action="" >
				<div class="col-lg-12 no-padding" >
                        <div class="row">
						<div class="form-group">
							<h4>EMERGENCY INFO</h4>
							<hr>
						</div>
						</div>
					</div>
                   <div class="col-lg-12 no-padding">
                        <div class="row">
							<table class="table">
							<thead>
							<tr>
							<th>Name</th>
							<th>Date of birth</th>
							<th>Phone Number</th>
							</tr>
							</thead>
							<tbody>
							<tr>
							<td><input type="text" class="form-control" id="emergency_name"  placeholder="Enter Name"name="emergency_name"></td>
							<td>
							<select class="form-control" id="emergency_relationship">
							<option value="">Relationship</option>
							<option value="0">Father</option>
							<option value="1">Mother</option>
							<option value="0">Husband</option>
							<option value="1">Wife</option>
							<option value="0">Son</option>
							<option value="1">Daughter</option>
							<option value="0">Brother</option>
							<option value="1">Sister</option>
						  </select>
							</td>
							<td><input type="text" class="form-control" id="emergency_phonenumber"  placeholder="Enter Number" name="emergency_phonenumber"></td>
							</tr>
							</tbody>
							</table>
						</div>
					</div>
					<div class="col-lg-12 no-padding" >
                        <div class="row">
						<div class="form-group" style="float:right;margin-right:20px;">
						<button type="submit" class="btn btn-danger">Submit</button>
						<button type="reset" class="btn btn-default">Cancel</button>
						</div>
						</div>
					</div>
					</form>
				</div>
		</div>
		</div>
	</div>
</div>
</body>
</html>