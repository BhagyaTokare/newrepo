



<div class="top-menu">
	<ul class="nav navbar-nav pull-right">
		<!-- BEGIN NOTIFICATION DROPDOWN -->

		<li class="dropdown dropdown-user"><a href="javascript:;"
			class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"
			data-close-others="true"> <sec:ifAnyGranted roles="ROLE_USER">
					<img alt="" class="img-circle"
						src="assets1/layouts/layout2/img/avatar.png" />

				</sec:ifAnyGranted> <sec:ifAnyGranted roles="ROLE_SUPERADMIN">
					<img alt="" class="img-circle"
						src="assets1/layouts/layout2/img/avatar.png" />
				</sec:ifAnyGranted> <sec:ifAnyGranted roles="ROLE_ADMIN">
					<img alt="" class="img-circle"
						src="assets1/layouts/layout2/img/avatar.png" />
				</sec:ifAnyGranted> <sec:ifAnyGranted roles="ROLE_COMMANUSERS">


					<img alt="" class="img-circle"
						src="assets1/layouts/layout2/img/avatar.png" />


				</sec:ifAnyGranted> <span class="username username-hide-on-mobile"> <sec:username /></span>
				<i class="fa fa-angle-down"></i>
		</a>

			<div class="user-menu dropdown-menu"
				style="background-color: transparent; margin-top: 2px;">
				<sec:ifLoggedIn>
					<g:form controller="logout">
						<div class="list-item-content">
							<span style="padding: 0 50px;"> </span>
							<g:submitButton name="Log Out" class="btn btn-warning" />
						</div>
					</g:form>
				</sec:ifLoggedIn>
			</div></li>




		<!-- END USER LOGIN DROPDOWN -->
		<!-- BEGIN QUICK SIDEBAR TOGGLER -->

		<!-- END QUICK SIDEBAR TOGGLER -->
	</ul>
</div>



