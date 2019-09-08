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
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_navbar.jsp" id="_navbar"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_sidebar.jsp" id="_sidebar"/>
	<link rel="import" href="${pageContext.request.contextPath}/resources/partials/_footer.jsp" id="_footer"/>
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
						<i class="mdi mdi-clipboard-outline"></i>
					  </span>
						病房信息
					</h3>
					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/index">主页</a></li>
							<li class="breadcrumb-item active" aria-current="page">病房信息</li>
						</ol>
					</nav>
				</div>

				<div class="row">
					<div class="col-md-12 grid-margin stretch-card">
						<div class="card">
							<div class="card-body">
								<h4 class="card-title">病房信息</h4>
								<div class="table-responsive">
									<table class="table">
										<thead>
										<tr>
											<th>
												房间号
											</th>
											<th>
												所属科室
											</th>
											<th>
												责任医师
											</th>
											<th>
												床位状态
											</th>
										</tr>
										</thead>
										<tbody>
										<tr>
											<td>
												301
											</td>
											<td>
												Herman Beck
											</td>
											<td>
												May 15, 2015
											</td>
											<td>
												<div class="progress">
													<div class="progress-bar bg-gradient-success" role="progressbar"
														 style="width: 25%" aria-valuenow="25" aria-valuemin="0"
														 aria-valuemax="100"></div>
												</div>
											</td>
										</tr>
										<tr>
											<td>
												302
											</td>
											<td>
												Messsy Adam
											</td>
											<td>
												Jul 01, 2015
											</td>
											<td>
												<div class="progress">
													<div class="progress-bar bg-gradient-danger" role="progressbar"
														 style="width: 75%" aria-valuenow="75" aria-valuemin="0"
														 aria-valuemax="100"></div>
												</div>
											</td>
										</tr>
										<tr>
											<td>
												303
											</td>
											<td>
												John Richards
											</td>
											<td>
												Apr 12, 2015
											</td>
											<td>
												<div class="progress">
													<div class="progress-bar bg-gradient-warning" role="progressbar"
														 style="width: 90%" aria-valuenow="90" aria-valuemin="0"
														 aria-valuemax="100"></div>
												</div>
											</td>
										</tr>
										<tr>
											<td>
												304
											</td>
											<td>
												Peter Meggik
											</td>
											<td>
												May 15, 2015
											</td>
											<td>
												<div class="progress">
													<div class="progress-bar bg-gradient-primary" role="progressbar"
														 style="width: 50%" aria-valuenow="50" aria-valuemin="0"
														 aria-valuemax="100"></div>
												</div>
											</td>
										</tr>
										<tr>
											<td>
												305
											</td>
											<td>
												Edward
											</td>
											<td>
												May 03, 2015
											</td>
											<td>
												<div class="progress">
													<div class="progress-bar bg-gradient-danger" role="progressbar"
														 style="width: 35%" aria-valuenow="35" aria-valuemin="0"
														 aria-valuemax="100"></div>
												</div>
											</td>
										</tr>
										<tr>
											<td>
												306
											</td>
											<td>
												Ronald
											</td>
											<td>
												Jun 05, 2015
											</td>
											<td>
												<div class="progress">
													<div class="progress-bar bg-gradient-info" role="progressbar"
														 style="width: 90%" aria-valuenow="90" aria-valuemin="0"
														 aria-valuemax="100"></div>
												</div>
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
