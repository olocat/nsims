<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="cn">
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%
	String path = "";
%>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>护士站管理系统</title>
	<link rel="stylesheet" href="<%=path%>/resources/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
	<link rel="stylesheet" href="<%=path%>/resources/vendors/css/vendor.bundle.base.css">
	<link rel="stylesheet" href="<%=path%>/resources/css/style.css">
	<link rel="shortcut icon" href="<%=path%>/resources/images/favicon.png"/>
	<link rel="import" href="<%=path%>/resources/partials/_navbar.jsp" id="_navbar"/>
	<link rel="import" href="<%=path%>/resources/partials/_sidebar.jsp" id="_sidebar"/>
	<link rel="import" href="<%=path%>/resources/partials/_footer.jsp" id="_footer"/>
	<%--	用于去除链接文字下方的下划线，如果不去除则会破坏按钮整体感 --%>
	<style type="text/css">
		a{
			text-decoration: none;
		}
	</style>
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
						<i class="mdi mdi-thermometer-lines"></i>
					  </span>
						住院信息
					</h3>
					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="<%=path%>/index">主页</a></li>
							<li class="breadcrumb-item active" aria-current="page">住院信息</li>
						</ol>
					</nav>
				</div>

				<div class="row">
					<div class="col-12 grid-margin">
						<div class="card">
							<div class="card-body">
								<h4 class="card-title">病人列表</h4>
								<div class="table-responsive">
									<table class="table">
										<thead>
										<tr>
											<th>
												姓名
											</th>
											<th>
												病情信息
											</th>
											<th>
												性别
											</th>
											<th>
												病人状态
											</th>
											<th>
												入院日期
											</th>
											<th>
												病人 ID
											</th>
											<th>
												选项
											</th>
										</tr>
										</thead>
										<tbody>

										<c:forEach items="${patients}" var="patient" varStatus="stu">
											<tr>
												<td>
													<img src="<%=path%>/resources/images/faces/face${stu.count}.jpg"
														 class="mr-2" alt="image">
														${patient.name}
												</td>
												<td>
														${patient.diseaseInformation}
												</td>
												<td>
														${patient.gender}
												</td>
												<td>
													<label class="badge badge-gradient-success">${patient.patientCondition}</label>
												</td>
												<td>
														${patient.admissionDate}
												</td>
												<td>
														${patient.patientID}
												</td>
												<td>
													<a href="<%=path%>/patient/toEdit?patientID=${patient.patientID}">
														<button type="button"
																class="btn btn-gradient-success btn-rounded btn-icon">
															<i class="mdi mdi-file-find"></i>
														</button>
													</a>
													<a href="<%=path%>/patient/toEdit?patientID=${patient.patientID}">
														<button type="button"
																class="btn btn-gradient-info btn-rounded btn-icon">
															<i class="mdi mdi-border-color"></i>
														</button>
													</a>
													<a href="<%=path%>/patient/doDelete?patientID=${patient.patientID}">
													<button type="button"
															class="btn btn-gradient-danger btn-rounded btn-icon">
														<i class="mdi mdi-delete-forever"></i>
													</button>
													</a>
												</td>
											</tr>
										</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
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
<script src="<%=path%>/resources/vendors/js/vendor.bundle.base.js"></script>
<script src="<%=path%>/resources/vendors/js/vendor.bundle.addons.js"></script>
<!-- endinject -->
<!-- Plugin js for this page-->
<!-- End plugin js for this page-->
<!-- inject:js -->
<script src="<%=path%>/resources/js/off-canvas.js"></script>
<script src="<%=path%>/resources/js/misc.js"></script>
<!-- endinject -->
<!-- Custom js for this page-->
<script src="<%=path%>/resources/js/dashboard.js"></script>
<!-- End custom js for this page-->
</body>

</html>
