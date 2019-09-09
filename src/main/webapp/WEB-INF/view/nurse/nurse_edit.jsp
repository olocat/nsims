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
						修改护士信息
					</h3>
					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item">
								<a href="${pageContext.request.contextPath}/patient_info">护士信息</a>
							</li>
							<li class="breadcrumb-item active" aria-current="page">修改护士信息</li>
						</ol>
					</nav>
				</div>

				<div class="col-12 grid-margin">
					<div class="card">
						<div class="card-body">
							<h4 class="card-title">修改护士信息</h4>
							<form class="form-sample" action="${pageContext.request.contextPath}/nurse/doEdit" method="post">
								<p class="card-description">
									个人信息 :
								</p>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label" >ID</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" name="nurseID" value="${nurse.nurseID}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">姓名</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" name="name" value="${nurse.name}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">性别</label>
											<div class="col-sm-9">
												<input class="form-control" name="gender" value="${nurse.gender}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">年龄</label>
											<div class="col-sm-9">
												<input class="form-control" name="age" value="${nurse.age}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">电话号码</label>
											<div class="col-sm-9">
												<input class="form-control" name="phoneNumber" value="${nurse.phoneNumber}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">复责病房</label>
											<div class="col-sm-9">
												<input class="form-control" name="responsibleWard" value="${nurse.responsibleWard}"/>
											</div>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">职位</label>
											<div class="col-sm-9">
												<input class="form-control" name="department" value="${nurse.department}"/>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group row">
											<label class="col-sm-3 col-form-label">科室</label>
											<div class="col-sm-9">
												<input type="text" class="form-control" name="position" value="${nurse.position}"/>
											</div>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-md-4">
										<div class="form-group row">
											<button type="submit" class="btn btn-gradient-primary btn-icon-text">
												<i class="mdi mdi-file-check btn-icon-prepend"></i>
												提交
											</button>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group row">
											<button type="reset" class="btn btn-gradient-warning btn-icon-text">
												<i class="mdi mdi-alert btn-icon-prepend"></i>
												重置
											</button>
										</div>
									</div>
									<div class="col-md-4">
										<div class="form-group row">
											<a href="${pageContext.request.contextPath}/nurse_info">
												<button type="button" class="btn btn-gradient-danger btn-icon-text">
													<i class="mdi mdi-upload btn-icon-prepend"></i>
													返回
												</button></a>
										</div>
									</div>
								</div>
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
