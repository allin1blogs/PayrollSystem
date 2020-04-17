<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css"
	href="../css/employeepersonalinfo.css">
</head>
<body>

	<div class="main-wrapper content-wrapper">
		<div class="container">
			<div class="row">
				<div class="col-lg-10 col-12 col-sm-12"
					style="background-color: whitesmoke !important;">
					<div class="tabs-wrapper">
						<form action="addEmployee">
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="form-group">
										<h4>PERSONAL INFO</h4>
										<hr>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_surName">SURNAME:</label> <input
												type="text" value="Miss" class="form-control" id="empPersonal_surName"
												placeholder="" name="empPersonal_surName">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_firstName">FIRST NAME:</label> <input
												type="text" value="Preeti" class="form-control" id="empPersonal_firstName"
												placeholder="" name="empPersonal_firstName">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_lastName">Last Name:</label> <input
												type="text" value="Rani" class="form-control" id="empPersonal_lastName"
												placeholder="Enter Name" name="empPersonal_lastName">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_fatherName">FATHER'S NAME:</label> <input
												type="text" class="form-control" id="empPersonal_fatherName"
												placeholder="" value="Sudesh" name="empPersonal_fatherName">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_emailId1">Official Email ID:</label>
											<input type="email" class="form-control"
												id="empPersonal_emailId1" placeholder=""
												name="empPersonal_emailId1">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_emailId2">Personal Email ID:</label><br>
											<input type="email" class="form-control"
												id="empPersonal_emailId2" placeholder=""
												name="empPersonal_emailId2">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_phone1">Phone Number:</label> <input
												type="email" class="form-control" id="empPersonal_phone1"
												placeholder="" name="empPersonal_phone1">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_phone2">Alternate Phone
												Number:</label><br> <input type="email" class="form-control"
												id="empPersonal_phone2" placeholder=""
												name="empPersonal_phone2">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_dateOfBirth">DATE OF BIRTH:</label><br>
											<input type="date" class="form-control"
												id="empPersonal_dateOfBirth" name="empPersonal_dateOfBirth">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_placeOfBirth">PLACE OF BIRTH:</label>
											<input type="text" class="form-control"
												id="empPersonal_placeOfBirth" placeholder=""
												name="empPersonal_placeOfBirth">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_age">AGE:</label><br> <input
												type="number" class="form-control" id="empPersonal_age"
												name="empPersonal_age">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_languageKnown">LANGUAGE
												KNOWN:</label><br> <input type="text" class="form-control"
												id="empPersonal_languageKnown"
												name="empPersonal_languageKnown">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_height">HEIGHT:</label><br> <input
												type="number" class="form-control" id="empPersonal_height"
												name="empPersonal_height">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_weight">WEIGHT:</label> <input
												type="number" class="form-control" id="empPersonal_weight"
												placeholder="" name="empPersonal_weight">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_nationality">NATIONALITY:</label><br>
											<input type="text" class="form-control"
												id="empPersonal_nationality" name="empPersonal_nationality">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_gender">Gender:</label><br> <label
												class="radio-inline"><input type="radio"
												name="empPersonal_gender" value="0" checked>Male</label> <label
												class="radio-inline"><input type="radio"
												name="empPersonal_gender" value="1">Female</label> <label
												class="radio-inline"><input type="radio"
												name="empPersonal_gender" value="2">Other</label>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empPersonal_bloodGroup">Blood Group:</label> <select
												class="form-control" id="empPersonal_bloodGroup">
												<option value="">Select Blood Group</option>
												<option value="0">A+</option>
												<option value="1">A-</option>
												<option value="2">B+</option>
												<option value="3">B-</option>
												<option value="4">O+</option>
												<option value="5">O-</option>
												<option value="6">AB+</option>
												<option value="7">AB-</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<!-- ------ADDRESSES--- -->

							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="form-group">
										<h4>ADDRESSES</h4>
										<hr>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<!-- ------ Current Address--- -->
									<div class="col-sm-6">
										<div class="row">
											<div class="col-lg-12 no-padding">
												<h5>CURRENT ADDRESS</h5>
												<br>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="form-group">
													<label for="currentAdd_addressLine1">Address Line
														1:</label> <input type="text" value="Free hold" class="form-control"
														id="currentAdd_addressLine1" placeholder=""
														name="currentAdd_addressLine1">
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="form-group">
													<label for="currentAdd_addressLine2">Address Line
														2:</label> <input type="text" value="sanjay" class="form-control"
														id="currentAdd_addressLine2" placeholder=""
														name="currentAdd_addressLine2">
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="row">
													<div class="col-sm-6">
														<div class="form-group">
															<label for="currentAdd_country">Country:</label> <input
																type="text" class="form-control" id="currentAdd_country"
																placeholder="" name="currentAdd_country">
														</div>
													</div>
													<div class="col-sm-6">
														<div class="form-group">
															<label for="currentAdd_state">State:</label><br> <input
																type="text" class="form-control" id="currentAdd_state"
																placeholder="" name="currentAdd_state">
														</div>
													</div>
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="row">
													<div class="col-sm-6">
														<div class="form-group">
															<label for="currentAdd_city">City:</label> <input
																type="text" class="form-control" id="currentAdd_city"
																placeholder="" name="currentAdd_city">
														</div>
													</div>
													<div class="col-sm-6">
														<div class="form-group">
															<label for="currentAdd_pincode">Pincode:</label><br>
															<input type="text" class="form-control"
																id="currentAdd_pincode" placeholder=""
																name="currentAdd_pincode">
														</div>
													</div>
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="row">
													<div class="col-sm-6">
														<div class="form-group">
															<label for="currentAdd_houseType">House Type:</label> <select
																class="form-control" id="currentAdd_houseType">
																<option value="0">Select House Type</option>
																<option value="1">Owned by Self/Spouse</option>
																<option value="2">Owned by Parent/Sibling</option>
																<option value="3">Rented - with Family</option>
																<option value="4">Rented - with Friends</option>
																<option value="5">Rented - Staying Alone</option>
																<option value="6">Paying Guest</option>
																<option value="7">Hostel</option>
																<option value="8">Company Provided</option>
															</select>
														</div>
													</div>
													<div class="col-sm-6">
														<div class="form-group">
															<label for="currentAdd_stayingsince">Staying
																Since:</label><br> <input type="date" class="form-control"
																id="currentAdd_stayingsince"
																name="currentAdd_stayingsince">
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<!-- ------ Permannet Address--- -->
									<div class="col-sm-6">
										<div class="row">
											<div class="col-lg-12 no-padding">
												<h5>PERMANENT ADDRESS</h5>
												<br>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="form-group">
													<label for="permanentAdd_addressLine1">Address Line
														1:</label> <input type="text" value="T square" class="form-control"
														id="permanentAdd_addressLine1" placeholder=""
														name="permanentAdd_addressLine1">
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="form-group">
													<label for="permanentAdd_addressLine2">Address Line
														2:</label> <input type="text" class="form-control"
														id="permanentAdd_addressLine2" placeholder=""
														name="permanentAdd_addressLine2">
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="row">
													<div class="col-sm-6">
														<div class="form-group">
															<label for="permanentAdd_country">Country:</label> <input
																type="text" class="form-control"
																id="permanentAdd_country" placeholder=""
																name="permanentAdd_country">
														</div>
													</div>
													<div class="col-sm-6">
														<div class="form-group">
															<label for="permanentAdd_state">State:</label><br> <input
																type="text" class="form-control" id="permanentAdd_state"
																placeholder="" name="permanentAdd_state">
														</div>
													</div>
												</div>
											</div>
											<div class="col-lg-12 no-padding">
												<div class="row">
													<div class="col-sm-6">
														<div class="form-group">
															<label for="permanentAdd_city">City:</label> <input
																type="text" class="form-control" id="permanentAdd_city"
																placeholder="" name="permanentAdd_city">
														</div>
													</div>
												</div>
											</div>

										</div>
									</div>
								</div>
							</div>



							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="form-group">
										<h4>WORK INFO</h4>
										<hr>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empwork_empId">Employee ID:</label> <input
												type="text" class="form-control" value="123" id="empwork_empId"
												placeholder="" name="empwork_empId">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empwork_empType">Employee Type:</label><br>
											<select class="form-control" id="empwork_empType">
												<option value="">Select Employee Type</option>
												<option value="0">Full Time</option>
												<option value="1">Part Time</option>
												<option value="2">Intern</option>
												<option value="3">Contract</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empwork_designation">DESIGNATION:</label> <input
												type="text" class="form-control" id="empwork_designation"
												placeholder="" name="empwork_designation">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empwork_empStatus">Employee Status:</label> <select
												class="form-control" id="empwork_empStatus">
												<option value="">Select Employee Status</option>
												<option value="0">Active</option>
												<option value="1">Inactive</option>
											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empwork_dateOfAppointment">DATE OF
												APPOINTMENT:</label> <input type="date" class="form-control"
												id="empwork_dateOfAppointment" placeholder=""
												name="empwork_dateOfAppointment">
										</div>
									</div>
									<div class="col-sm-6">
										<div class="form-group">
											<label for="empwork_dateOfConfirmation">DATE OF
												CONFIRMATION:</label> <input type="date" class="form-control"
												id="empwork_dateOfConfirmation" placeholder=""
												name="empwork_dateOfConfirmation">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-4">
										<div class="form-group">
											<label for="empwork_workLocation">Work Location:</label> <input
												type="text" class="form-control" id="empwork_workLocation"
												placeholder="" name="empwork_workLocation">
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<label for="empwork_dateOfJoining">Date Of Joining:</label> <input
												type="date" class="form-control" id="empwork_dateOfJoining"
												name="empwork_dateOfJoining">
										</div>
									</div>
								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-4">
										<div class="form-group">
											<label for="empwork_probationPeriod">Probation
												Period:</label><br> <input type="text" class="form-control"
												id="empwork_probationPeriod" placeholder=""
												name="empwork_probationPeriod">
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<label for="empwork_jobTitle">Job Title:</label><br> <input
												type="text" class="form-control" id="empwork_jobTitle"
												placeholder="" name="empwork_jobTitle">
										</div>
									</div>

								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="col-sm-4">
										<div class="form-group">
											<label for="empwork_department">Department:</label><br>
											<input type="text" class="form-control"
												id="empwork_department" placeholder=""
												name="empwork_department">
										</div>
									</div>
									<div class="col-sm-4">
										<div class="form-group">
											<label for="empwork_subDepartment">Sub Department:</label><br>
											<input type="text" class="form-control"
												id="empwork_subDepartment" placeholder=""
												name="empwork_subDepartment">
										</div>
									</div>

								</div>
							</div>
							<div class="col-lg-12 no-padding">
								<div class="row">
									<div class="form-group"
										style="float: right; margin-right: 20px;">
										<button type="submit" class="btn btn-danger" value="submit">Submit</button>
										<button type="reset" class="btn btn-default" value="cancel">Cancel</button>
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