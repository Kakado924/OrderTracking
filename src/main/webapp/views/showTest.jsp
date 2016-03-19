<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0">
        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
         <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <title>仓库页面</title>
    </head>
    <body class="container-fluid">
    <form action="warehouse.do">
            <div class="form-group">
                <label for="username">仓库位置</label>
                <input type="text" class="form-control" id="bin" placeholder="">
            </div>
            <button type="submit" class="btn btn-default">提交</button>
        </form>
        <h1>${MO.MO}</h1>
        <h1>${MO.Reference}</h1>
    </body>
</html>

<style type="text/css">
table.zyhovertable {
    font-family:
    verdana,arial,sans-serif;
    font-size:11px;
    color:#333333;
    border-width: 1px;
    border-color: #999999;
    border-collapse:
    collapse;
}

table.zyhovertable th {
    background-color:#C3DDE0;
    border-width: 1px;
    padding: 8px;
    border-style: solid;
    border-color: #999999;
}

table.zyhovertable tr {
    background-color:#DCDCDC;
}

table.zyhovertable td {
    border-width: 1px;
    padding: 8px;
    border-style: solid;
    border-color: #999999;
}
</style>

<table class="zyhovertable">
<tr>
<th>A01-4</th><th>A01-3</th><th>A01-2</th><th>A01-1</th><th>库位</th>
</tr>

<tr onmouseover="this.style.backgroundColor='#FFFF66';"onmouseout="this.style.backgroundColor='#DCDCDC';"><td>blank</td><td>blank</td><td>blank</td><td>blank</td><td>MO</td></tr>
<tr onmouseover="this.style.backgroundColor='#FFFF66';"onmouseout="this.style.backgroundColor='#DCDCDC';"><td>blank</td><td>blank</td><td>blank</td><td>blank</td><td>Ref</td></tr>
</table>



