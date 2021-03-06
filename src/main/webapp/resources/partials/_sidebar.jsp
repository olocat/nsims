<nav class="sidebar sidebar-offcanvas" id="sidebar">
	<ul class="nav">
		<li class="nav-item nav-profile">
			<a href="#" class="nav-link">
				<div class="nav-profile-image">
					<img src="${pageContext.request.contextPath}/resources/images/faces/face27.jpg" alt="profile">
					<span class="login-status online"></span> <!--change to offline or busy as needed-->
				</div>
				<div class="nav-profile-text d-flex flex-column">
					<span class="font-weight-bold mb-2">Admin</span>
					<span class="text-secondary text-small">超级管理员</span>
				</div>
				<i class="mdi mdi-bookmark-check text-success nav-profile-badge"></i>
			</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/index">
				<span class="menu-title">主页</span>
				<i class="mdi mdi-home menu-icon"></i>
			</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/patient">
				<span class="menu-title">住院信息</span>
				<i class="mdi mdi-thermometer-lines menu-icon"></i>
			</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/nurse">
				<span class="menu-title">护士信息</span>
				<i class="mdi mdi-needle menu-icon"></i>
			</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/ward">
				<span class="menu-title">病房管理</span>
				<i class="mdi mdi-clipboard-outline menu-icon"></i>
			</a>
		</li>
		<li class="nav-item">
			<a class="nav-link" href="${pageContext.request.contextPath}/doctor">
				<span class="menu-title">医生信息</span>
				<i class="mdi mdi-stethoscope menu-icon"></i>
			</a>
		</li>
		<li class="nav-item sidebar-actions">
              <a href="${pageContext.request.contextPath}/patient/toAdd" style="text-decoration: none">
				  <button class="btn btn-block btn-lg btn-gradient-primary mt-4">办理住院</button></a>
		</li>
		<li class="nav-item sidebar-actions">
              <a href="${pageContext.request.contextPath}/nurse/toAdd" style="text-decoration: none">
				  <button class="btn btn-block btn-lg btn-gradient-primary mt-4">添加护士</button></a>
		</li>
		<li class="nav-item sidebar-actions">
              <a href="${pageContext.request.contextPath}/doctor/toAdd" style="text-decoration: none">
				  <button class="btn btn-block btn-lg btn-gradient-primary mt-4">添加医生</button></a>
		</li>
	</ul>
</nav>