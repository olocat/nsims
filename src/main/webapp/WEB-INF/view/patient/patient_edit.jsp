<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="cn">
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>护士站管理系统</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors/css/vendor.bundle.base.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.png"/>
	<%--	引用上栏和左侧菜单及页脚的内容 --%>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_navbar.jsp" id="_navbar"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_sidebar.jsp" id="_sidebar"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_footer.jsp" id="_footer"/>
</head>
<body>
<div class="container-scroller">

	<script type="text/javascript">
		document.write(_navbar.import.body.innerHTML);
	</script>
	<div class="container-fluid page-body-wrapper">
		<script type="text/javascript">
			document.write(_sidebar.import.body.innerHTML);
		</script>

		<div class="main-panel">
			<div class="content-wrapper">
				<div class="page-header">
					<h3 class="page-title">
					  <span class="page-title-icon bg-gradient-primary text-white mr-2">
						<i class="mdi mdi-table-edit"></i>
					  </span>
						修改住院信息
					</h3>
					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item">
								<a href="${pageContext.request.contextPath}/patient">住院信息</a>
							</li>
							<li class="breadcrumb-item active" aria-current="page">修改住院信息</li>
						</ol>
					</nav>
				</div>

				<div class="col-12 grid-margin">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title">修改病人信息</h4>
							<form class="form-sample" action="${pageContext.request.contextPath}/patient/doEdit" method="post">
								<p class="card-description">
									个人信息 :
								</p>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label" >ID</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" name="patientID" value="${patient.patientID}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">姓名</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" name="name" value="${patient.name}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">性别</label>
											<div class="col-sm-9">
												<input class="form-control" name="gender" value="${patient.gender}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">年龄</label>
											<div class="col-sm-9">
												<input class="form-control" name="age" value="${patient.age}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">身份证号码</label>
											<div class="col-sm-9">
												<input class="form-control" name="carID" value="${patient.carID}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">联系电话</label>
											<div class="col-sm-9">
												<input class="form-control" name="contentPhoneNumber" value="${patient.contentPhoneNumber}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">紧急联系人</label>
											<div class="col-sm-9">
												<input class="form-control" name="emergencyContentPhoneNumber" value="${patient.emergencyContentPhoneNumber}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">入院日期</label>
											<div class="col-sm-9">
												<input class="form-control" name="admissionDate" value="${patient.admissionDate}"/>
											</div>
										</div>
									</div>
								</div>
								<p class="card-description">
									医疗信息 :
								</p>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">血型</label>
											<div class="col-sm-9">
												<select class="form-control" name="bloodType">
													<option value="A" <c:if test="${patient.bloodType == 'A'}">selected="selected"</c:if>>A</option>
													<option value="B" <c:if test="${patient.bloodType == 'B'}">selected="selected"</c:if>>B</option>
													<option value="AB" <c:if test="${patient.bloodType == 'AB'}">selected="selected"</c:if>>AB</option>
													<option value="O" <c:if test="${patient.bloodType == 'A'}">selected="selected"</c:if>>O</option>
													<option value="特殊" <c:if test="${patient.bloodType == '特殊'}">selected="selected"</c:if>>特殊</option>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">病况</label>
											<div class="col-sm-9">
												<input class="form-control" name="patientCondition" value="${patient.patientCondition}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">科室</label>
											<div class="col-sm-9">
												<select class="form-control" name="departmentID">
													<c:forEach items="${departments}" var="department">
														<option value="${department.departmentID}"
																<c:if test="${department.departmentID == patient.departmentID}">selected="selected"</c:if>
														>
																${department.name}</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">责任医师</label>
											<div class="col-sm-9">
												<select class="form-control" name="doctorID">
													<c:forEach items="${doctors}" var="doctor">
														<option value="${doctor.doctorID}"
																<c:if test="${patient.doctorID == doctor.doctorID}">selected="selected"</c:if>
														>
																${doctor.name}</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">病房</label>
											<div class="col-sm-9">
												<select class="form-control" name="ward">
													<c:forEach items="${wards}" var="ward">
														<option value="${ward.number}"
																<c:if test="${ward.number == patient.ward}">selected="selected"</c:if>
														>
																${ward.number}
														</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">床位</label>
											<div class="col-sm-9">
												<input class="form-control" name="bedNumber" value="${patient.bedNumber}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<label class="col-sm-9 col-form-label">病情信息</label>
									<div class="col-sm-9">
										<input type="text" class="form-control" name="diseaseInformation" value="${patient.diseaseInformation}"/>
									</div>
								</div><br/>
								<button type="submit" class="btn btn-gradient-primary btn-icon-text">
									<i class="mdi mdi-file-check btn-icon-prepend"></i>
									提交
								</button>
								<button type="reset" class="btn btn-gradient-warning btn-icon-text">
									<i class="mdi mdi-alert btn-icon-prepend"></i>
									重置
								</button>
								<a href="${pageContext.request.contextPath}/patient">
								<button type="button" class="btn btn-gradient-danger btn-icon-text">
									<i class="mdi mdi-upload btn-icon-prepend"></i>
									返回
								</button></a>
							</form>
						</div>
					</div>
				</div>
			</div>

			<script type="text/javascript">
				document.write(_footer.import.body.innerHTML);
			</script>

		</div>
		<!-- main-panel ends -->
	</div>
	<!-- page-body-wrapper ends -->
</div>
<!-- container-scroller -->

<!-- plugins:js -->
<script src="${pageContext.request.contextPath}/resources/vendors/js/vendor.bundle.base.js"></script>
<script src="${pageContext.request.contextPath}/resources/vendors/js/vendor.bundle.addons.js"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="${pageContext.request.contextPath}/resources/js/off-canvas.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/misc.js"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="${pageContext.request.contextPath}/resources/js/dashboard.js"></script>
<!-- End custom js for this page-->
</body>

</html>
