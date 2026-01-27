<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Member Dashboard - SuPrazo</title>
<style>
body {
	font-family: Arial, sans-serif;
	background: #f8f9fa;
}

.container {
	width: 70%;
	margin: 50px auto;
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

h1 {
	color: #004aad;
}

.stats {
	display: flex;
	gap: 20px;
	margin-top: 20px;
}

.card {
	flex: 1;
	background: #e9f0ff;
	padding: 20px;
	border-radius: 8px;
	text-align: center;
}

.number {
	font-size: 32px;
	color: #004aad;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome, ${memberName} 👋</h1>
		<div class="stats">
			<div class="card">
				<h3>Assigned Tasks</h3>
				<div class="number">${assignedTasks}</div>
			</div>
			<div class="card">
				<h3>Completed</h3>
				<div class="number">${completedTasks}</div>
			</div>
			<div class="card">
				<h3>Pending</h3>
				<div class="number">${pendingTasks}</div>
			</div>
		</div>
	</div>
</body>
</html>
