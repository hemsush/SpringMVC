<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Angular.js - Typeahead</title>


<link rel="stylesheet" href="/PPMDashboard/resources/css/normalize.css">

<link rel='stylesheet prefetch'
	href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>

<link rel="stylesheet" href="/PPMDashboard/resources/css/style.css">




</head>

<body>
	<h1>Spring 3 MVC REST web service</h1>

	<h3>Movie Name : ${movie}</h3>
	<div ng-app="angularTypeahead">
		<div class="container-fluid" ng-controller="TypeaheadCtrl">
			<div class="form-group">
				<label for="states">Search for US States</label> <input
					name="states" id="states" type="text" placeholder="enter a state"
					ng-model="selected"
					typeahead="state for state in states | filter:$viewValue | limitTo:8"
					class="form-control">
			</div>
			<button class="btn btn-success" type="submit">Submit</button>
		</div>
	</div>
	<script
		src='http://ajax.googleapis.com/ajax/libs/angularjs/1.3.2/angular.min.js'></script>
	<script
		src='http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.12.0.js'></script>

	<script src="/PPMDashboard/resources/js/index.js"></script>
</body>
</html>