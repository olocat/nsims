<!DOCTYPE html>
<html lang="cn">
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%

%>
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
                <i class="mdi mdi-home"></i>
              </span>
						主页
					</h3>
					<nav aria-label="breadcrumb">
						<ul class="breadcrumb">
							<li class="breadcrumb-item active" aria-current="page">
								<span></span>主页
								<i class="mdi mdi-alert-circle-outline icon-sm text-primary align-middle"></i>
							</li>
						</ul>
					</nav>
				</div>
				<div class="row">
					<div class="col-md-4 stretch-card grid-margin">
						<div class="card bg-gradient-danger card-img-holder text-white">
							<div class="card-body">
								<img src="${pageContext.request.contextPath}/resources/images/dashboard/circle.svg" class="card-img-absolute"
									 alt="circle-image"/>
								<h4 class="font-weight-normal mb-3">本月入院人数
									<i class="mdi mdi-chart-line mdi-24px float-right"></i>
								</h4>
								<h2 class="mb-5">3</h2>
								<h6 class="card-text">今日新增：0</h6>
							</div>
						</div>
					</div>
					<div class="col-md-4 stretch-card grid-margin">
						<div class="card bg-gradient-info card-img-holder text-white">
							<div class="card-body">
								<img src="${pageContext.request.contextPath}/resources/images/dashboard/circle.svg" class="card-img-absolute"
									 alt="circle-image"/>
								<h4 class="font-weight-normal mb-3">本月出院人数
									<i class="mdi mdi-bookmark-outline mdi-24px float-right"></i>
								</h4>
								<h2 class="mb-5">4</h2>
								<h6 class="card-text">今日出院：1</h6>
							</div>
						</div>
					</div>
					<div class="col-md-4 stretch-card grid-margin">
						<div class="card bg-gradient-success card-img-holder text-white">
							<div class="card-body">
								<img src="${pageContext.request.contextPath}/resources/images/dashboard/circle.svg" class="card-img-absolute"
									 alt="circle-image"/>
								<h4 class="font-weight-normal mb-3">总住院人数
									<i class="mdi mdi-diamond mdi-24px float-right"></i>
								</h4>
								<h2 class="mb-5">3</h2>
<%--								<h6 class="card-text">Increased by 5%</h6>--%>
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
