<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 要記得加 -->
<%@ taglib uri="/WEB-INF/tiles-jsp.tld" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="../css/leather.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/jquery-ui-1.8.19.custom.css" media="screen" />
<link rel="stylesheet" type="text/css" href="../css/ui.jqgrid.css"    media="screen" />
<link rel="stylesheet" type="text/css" href="../css/ui.multiselect.css"    media="screen" />
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="../js/jquery-ui-1.8.19.custom.min.js"></script>
<script type="text/javascript" src="../js/jquery.jqGrid.min.js"></script>
<script type="text/javascript" src="../js/grid.locale-cn.js"></script>

<title>testMVNSpring</title>
</head>
<body>
    <div class="container">
        <tiles:insertAttribute name="sso_header"/>
        <div class="body">
             <tiles:insertAttribute name='sso_body'/>
        </div>
        <tiles:insertAttribute name="sso_footer"/>
    </div>
</body>
</html>