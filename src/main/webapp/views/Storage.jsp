<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0">
        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript">
        	$(function(){
        	    var positionValue = $("#position").val();
        		$("#submit").click(function(){
        			$.ajax({
        				url:"warehouse.do",
        				type:"post",
        				dataType: "json",
        				data:{
        					"position":positionValue
        				},
        				success:function(responseData){
        				    alert(responseData[0].MO)
                            alert(responseData);
                            $.each(responseData.list, function(i, item) {
                                alert(item.id);
                            	});
        				},
        				error:function(){
        					alert("system error");
        				}
        			});
        		});
        	});
        </script>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <title>仓库 </title>
    </head>
    <body class="container-fluid">
        <form class="form-inline">
          <div class="form-group">
            <label for="position">仓库位置：</label>
            <input type="text" class="form-control" id="position" placeholder="">
          </div>
          <button id="submit" type="button" class="btn btn-default">提交</button>
        </form>
    </body>
</html>
