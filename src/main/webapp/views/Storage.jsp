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

        		$("#submit").click(function(){
        		    var MOValue = $("#mo").val();
        			$.ajax({
        				url:"inbound.do",
        				type:"post",
        				dataType: "json",
        				data:{
        					"mo":MOValue
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
        <script type="text/javascript">
                    function CreateTable(rowCount,cellCount)
                        {
                        var table=$("<table class=\"table table-bordered text-center table-hover \">");
        				$("#orderTable").append(table);
                        for(var i=0;i<rowCount;i++)
                        {
                           var tr=$("<tr></tr>");
        				  table.append(tr);
                           for(var j=0;j<cellCount;j++)
                           {
        					 var td="";
        					 if ((i == 0) &&(j == 4)) {
        						td=$("<td>MO</td>");
        					 }
        					 else if ((i == 0) &&(j == 5)) {
        						td=$("<td rowspan=\"3\">A44</td>");
        					 }
        					 else if ((i == 1) &&(j == 4)) {
        						td=$("<td>Ref</td>");
        					 }
        					 else if ((i == 2) &&(j == 4)) {
        						td=$("<td>Qty</td>");
        					 }
        					 else if ((i >=0) && (j < 5) ){
        						td = $("<td>"+i*j+"</td>")
        					 }
                              tr.append(td);
                           }
                        }
                        $("#orderTable").append("</table>");
                        }
                </script>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <title>仓库 </title>
    </head>
    <body>
        <div class ="container-fluid">
            <form class="form-inline">
                <div class="form-group">
                <label for="mo">MO：</label>
                <input type="text" class="form-control" id="mo" placeholder="">
                </div>
                <button id="submit" type="button" class="btn btn-default">提交</button>
            </form>
            <div id="orderTable">
            </div>
            <input type="button" value="添加表格" onClick="CreateTable(3,6)" >
        </div>
    </body>
</html>
