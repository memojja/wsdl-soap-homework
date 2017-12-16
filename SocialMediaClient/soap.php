<?php
$soapclient = new SoapClient('http://localhost:8085/ws/social-media?wsdl');

$response = '';
$params = array('arg0' => '');

if( isset($_GET["username"]) && isset($_GET["platform"]) ){
	if($_GET["username"] != ""){
		$params['arg0'] = $_GET["username"];
	}
	if($_GET['platform'] == "twitter"){
		$response = $soapclient->getTwitPic($params);
	}
	else if($_GET['platform'] == "instagram"){
		$response = $soapclient->getInsPic($params);
	}
	else{
		$response->return = "Platform Seçmediniz";
	}
}
?>

<html>
<head></head>
<body>
	<?php
		if($response->return == "User Not Found!" || $response->return == "Platform Seçmediniz"){
			echo $response->return;
		}else{
	?>
		<img src="<?php echo $response->return ?>" alt="">
	<?php } ?>
</body>
</html>