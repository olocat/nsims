<!DOCTYPE html>
<html lang="cn">
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Purple Admin</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors/iconfonts/mdi/css/materialdesignicons.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/vendors/css/vendor.bundle.base.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/favicon.png"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_navbar.jsp" id="_navbar"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_sidebar.jsp" id="_sidebar"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_footer.html" id="_footer"/>
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
							<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/index">主页</a></li>
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
										<tr>
											<td>
												<img src="resources/images/faces/face1.jpg" class="mr-2" alt="image">
												David Grey
											</td>
											<td>
												Fund is not recieved
											</td>
											<td>
												男
											</td>
											<td>
												<label class="badge badge-gradient-success">DONE</label>
											</td>
											<td>
												Dec 5, 2017
											</td>
											<td>
												WD-12345
											</td>
											<td>
												<button type="button" class="btn btn-gradient-success btn-rounded btn-icon">
													<i class="mdi mdi-file-find"></i>
												</button>
												<button type="button" class="btn btn-gradient-info btn-rounded btn-icon">
													<i class="mdi mdi-border-color"></i>
												</button>
												<button type="button" class="btn btn-gradient-danger btn-rounded btn-icon">
													<i class="mdi mdi-delete-forever"></i>
												</button>
											</td>
										</tr>
										<tr>
											<td>
												<img src="resources/images/faces/face2.jpg" class="mr-2" alt="image">
												Stella Johnson
											</td>
											<td>
												High loading time
											</td>
											<td>
												<label class="mdi mdi-gender-male badge"></label>
											</td>
											<td>
												<label class="badge badge-gradient-warning">PROGRESS</label>
											</td>
											<td>
												Dec 12, 2017
											</td>
											<td>
												WD-12346
											</td>
										</tr>
										<tr>
											<td>
												<img src="resources/images/faces/face3.jpg" class="mr-2" alt="image">
												Marina Michel
											</td>
											<td>
												Website down for one week
											</td>
											<td>
												<label class="mdi mdi-gender-male badge"></label>
											</td>
											<td>
												<label class="badge badge-gradient-info">ON HOLD</label>
											</td>
											<td>
												Dec 16, 2017
											</td>
											<td>
												WD-12347
											</td>
										</tr>
										<tr>
											<td>
												<img src="resources/images/faces/face4.jpg" class="mr-2" alt="image">
												John Doe
											</td>
											<td>
												Loosing control on server
											</td>
											<td>
												<label class="mdi mdi-gender-male badge"></label>
											</td>
											<td>
												<label class="badge badge-gradient-danger">REJECTED</label>
											</td>
											<td>
												Dec 3, 2017
											</td>
											<td>
												WD-12348
											</td>
										</tr>
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
