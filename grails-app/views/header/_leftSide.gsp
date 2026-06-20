
<ul class="nav navbar-nav">
	<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
		href="javascript:;" class="text-uppercase"> <img
			src="assets1/layouts/layout5/img/Dashboardw.png"> Dashboard
	</a>
		<ul class="dropdown-menu dropdown-menu-fw">
			<li><g:link controller="superadmin" action="indexx"
					class="nav-link nav-toggle">
					<i class="icon-graph"></i>
					Dashboard
			</g:link></li>

		</ul></li>


	<sec:ifAnyGranted roles="ROLE_SUPERADMIN">
		<li
			class="dropdown dropdown-fw dropdown-fw-disabled active open selected">
			<a href="javascript:;" class="text-uppercase"> <i
				class="icon-layers"></i> Create Admin
		</a>
			<ul class="dropdown-menu dropdown-menu-fw">
				<li><g:link controller="superadmin" action="index"
						class="nav-link ">
						<i class="icon-settings"></i> Create Admin
									</g:link></li>
				<li><g:link controller="superadmin" action="index"
						class="nav-link ">
						<i class="fa fa-list"></i> View list
									</g:link></li>
			</ul>
		</li>
	</sec:ifAnyGranted>


	<sec:ifAnyGranted roles="ROLE_ADMIN">
		<li class="dropdown dropdown-fw dropdown-fw-disabled "><a
			href="javascript:;" class="text-uppercase"><img
				src="assets1/layouts/layout5/img/collegew.png"> Colleges </a>
			<ul class="dropdown-menu dropdown-menu-fw">


				<li><g:link controller="usercreate" action="index"
						class="nav-link ">
						<i class="fa fa-plus"></i> Create College
									</g:link></li>
				<li><g:link controller="usercreate" action="index"
						class="nav-link ">
						<i class="fa fa-list"></i> View College list
									</g:link></li>


			</ul></li>



		<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
			href="javascript:;" class="text-uppercase"><img
				src="assets1/layouts/layout5/img/Department.png"> Department
		</a>
			<ul class="dropdown-menu dropdown-menu-fw">

				<li><g:link controller="department" action="create"
						class="nav-link ">
						<i class="fa fa-plus"></i> Create Department
									</g:link></li>
				<li><g:link controller="department" action="index"
						class="nav-link ">
						<i class="fa fa-list"></i> View Department List
									</g:link></li>
			</ul></li>



		<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
			href="javascript:;" class="text-uppercase"> <img
				src="assets1/layouts/layout5/img/Filledpostw.png"> Filled
				Post
		</a>
			<ul class="dropdown-menu dropdown-menu-fw">

				<li><g:link controller="filledPost" action="create"
						class="nav-link" style="padding: 30px 0px 30px 25px !important;">
						<i class="fa fa-plus"></i> Create Posts
									</g:link></li>
				<li><g:link controller="filledPost" action="index"
						class="nav-link" style="padding: 30px 0px 30px 25px !important;">
						<i class="fa fa-list"></i> View Teaching List
									</g:link></li>
				<li><g:link controller="filledPost" action="indexnonteaching"
						class="nav-link " style="padding: 30px 0px 30px 25px !important;">
						<i class="fa fa-list"></i> View Non-Teaching List
									</g:link></li>

				<li><g:link controller="filledPost" action="transferteaching"
						class="nav-link " style="padding: 30px 0px 30px 25px !important;">
						<i class="fa fa-list"></i> View Retired Teaching List
									</g:link></li>

				<li><g:link controller="filledPost"
						action="transfernonteaching" class="nav-link "
						style="padding: 30px 0px 30px 25px !important;">
						<i class="fa fa-list"></i> View Retired Non-Teaching List
									</g:link></li>
			</ul></li>
		<li class="dropdown dropdown-fw dropdown-fw-disabled"><a
			href="javascript:;" class="text-uppercase"> <img
				src="assets1/layouts/layout5/img/Reportsw.png"> Reports
		</a>
			<ul class="dropdown-menu dropdown-menu-fw">
				<li><g:link controller="filledPost" action="searchByDept"
						class="nav-link ">
						<i class="fa fa-file-text-o"></i> Department Reports
									</g:link></li>

				<li><g:link controller="filledPost" action="searchByCollage"
						class="nav-link ">
						<i class="fa fa-file-text-o"></i> College Reports
									</g:link></li>
			</ul></li>


		<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
			href="javascript:;" class="text-uppercase"> <img
				src="assets1/layouts/layout5/img/Transferw.png"> Transfer
		</a>
			<ul class="dropdown-menu dropdown-menu-fw">
				<%--<li><g:link controller="transferPost" action="transferDetails"
						class="nav-link ">
						<i class="fa fa-file-text-o"></i> Transfer Post
									</g:link></li>
									
									--%>
				<li><g:link controller="transferPost" action="transferList"
						class="nav-link ">
						<i class="fa fa-file-text-o"></i> Transfer List
									</g:link></li>
			</ul></li>




		<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
			href="javascript:;" class="text-uppercase"><img
				src="assets1/layouts/layout5/img/Retiredw.png"> Retired </a>
			<ul class="dropdown-menu dropdown-menu-fw">
				<li><g:link controller="transferPost" action="searchByDept"
						class="nav-link ">
						<i class="fa fa-file-text-o"></i> Retired Post
									</g:link></li>


			</ul></li>





	</sec:ifAnyGranted>

</ul>











<!-- <ul
	class="page-sidebar-menu  page-header-fixed page-sidebar-menu-hover-submenu "
	data-keep-expanded="false" data-auto-scroll="true"
	data-slide-speed="200">



	<li class="nav-item start active open"><g:link
			controller="superadmin" action="indexx" class="nav-link nav-toggle">
			<i class="icon-home"></i>
			<span class="title">Dashboard</span>
			<span class="selected"></span>
			<span class="arrow open"></span>
		</g:link></li>
	<sec:ifAnyGranted roles="ROLE_SUPERADMIN">
		<li class="nav-item  "><a href="javascript:;"
			class="nav-link nav-toggle"> <i class="icon-user"></i> <span
				class="title">Create Admin</span> <span class="arrow"></span>
		</a>
			<ul class="sub-menu">
				<li class="nav-item  "><g:link controller="superadmin"
						action="index" class="nav-link ">
						<span class="title">Create Admin</span>
					</g:link></li>
				<li class="nav-item  "><g:link controller="superadmin"
						action="index" class="nav-link ">
						<span class="title">View List</span>
					</g:link></li>
			</ul></li>
	</sec:ifAnyGranted>
	<sec:ifAnyGranted roles="ROLE_ADMIN">
		<li class="nav-item  "><a href="javascript:;"
			class="nav-link nav-toggle"> <i class="icon-user"></i> <span
				class="title"> Create Collage</span> <span class="arrow"></span>
		</a>
			<ul class="sub-menu">
				<li class="nav-item  "><g:link controller="usercreate"
						action="index" class="nav-link ">
						<span class="title">Create Collage</span>
					</g:link></li>
				<li class="nav-item  "><g:link controller="usercreate"
						action="index" class="nav-link ">
						<span class="title">View List</span>
					</g:link></li>
			</ul></li>
		<%--
	
	  <li class="nav-item  "><a href="javascript:;"
			class="nav-link nav-toggle"> <i class="icon-user"></i> <span
				class="title"> Create Position</span> <span class="arrow"></span>
		</a>
			<ul class="sub-menu">
				<li class="nav-item  "><g:link controller="position"
						action="create" class="nav-link ">
						<span class="title">Create Position</span>
					</g:link></li>
				<li class="nav-item  "><g:link controller="position"
						action="index" class="nav-link ">
						<span class="title">View List</span>
					</g:link></li>
			</ul></li>
		

    


--%>
		<li class="nav-item  "><a href="javascript:;"
			class="nav-link nav-toggle"> <i class="icon-user"></i> <span
				class="title"> Create Filled Post</span> <span class="arrow"></span>
		</a>
			<ul class="sub-menu">
				<li class="nav-item  "><g:link controller="filledPost"
						action="create" class="nav-link ">
						<span class="title">Create Filled Post</span>
					</g:link></li>
				<li class="nav-item  "><g:link controller="filledPost"
						action="index" class="nav-link ">
						<span class="title">View List</span>
					</g:link></li>
				<li class="nav-item  "><g:link controller="filledPost"
						action="searchByDept" class="nav-link ">
						<span class="title">View List</span>
					</g:link></li>
			</ul></li>











	</sec:ifAnyGranted>

	<%--<sec:ifAnyGranted roles="ROLE_USER">

		<li class="nav-item  "><a href="javascript:;"
			class="nav-link nav-toggle"><i class="icon-settings"></i><span
				class="title">View Reports</span> <span class="arrow"></span> </a>
			<ul class="sub-menu">
				<li class="nav-item  ">
				<li class="nav-item  "><g:link controller="inwardform"
						action="userlist" class="nav-link ">
						<span class="title">View List</span>
					</g:link></li>

			</ul></li>

	</sec:ifAnyGranted>
--%>
</ul>-->



<style>
.page-sidebar .page-sidebar-menu>li>a {
	min-height: 50px !important;
	display: block !important;
	position: relative !important;
	margin: 0;
	border: 0;
	padding: 10px 0px 0px !important;
	text-decoration: none;
	font-size: 15px !important;
	font-weight: 600 !important;
	text-align: center !important;
}

.page-sidebar .page-sidebar-menu .sub-menu li>a {
	font-size: 15px !important;
	font-weight: 600 !important;
	color: #7d97f4 !important;
}
</style>