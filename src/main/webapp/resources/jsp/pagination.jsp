<!DOCTYPE html>
<html ng-app="myApp">

<head>
<link data-require="bootstrap-css@3.1.1" data-semver="3.1.1"
	rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
<script data-require="angular.js@1.3.0" data-semver="1.3.0"
	src="https://code.angularjs.org/1.3.0/angular.js"></script>
<script data-require="jquery@*" data-semver="2.0.3"
	src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
<script data-require="bootstrap@3.1.1" data-semver="3.1.1"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/PPMDashboard/resources/css/style.css" />
<script src="/PPMDashboard/resources/js/script.js"></script>
<script src="/PPMDashboard/resources/js/pagination/dirPagination.js"></script>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-8">
				<div ng-controller="MyController" class="my-controller">
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>IbdId</th>
								<th>IBD Name</th>
							</tr>
						</thead>
						<tbody>

							<tr dir-paginate="ibdInf in ibd|itemsPerPage:pageSize"
								current-page="currentPage">
								<td>{{ibdInf.ibdId}}</td>
								<td>{{ibdInf.name}}</td>

							</tr>
						</tbody>
					</table>
				</div>
				<div ng-controller="OtherController" class="other-controller">
					<div class="text-center">
						<dir-pagination-controls boundary-links="true"
							on-page-change="pageChangeHandler(newPageNumber)"
							template-url="dirPagination.tpl.html"></dir-pagination-controls>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>