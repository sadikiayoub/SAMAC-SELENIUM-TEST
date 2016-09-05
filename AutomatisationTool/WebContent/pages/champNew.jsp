<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="../../css/feuilleStyle.css" />
<script type="text/javascript" src="../../js/js.js"></script>
<title>Gestion des champs</title>
</head>
<body>
	<f:view>
	<h:form>
		<h:outputLabel value="Liste des champs : " />
		<h:selectOneMenu   value="#{champController.selectedChamp}" id="listeChamps">
				<f:selectItems   value="#{champController.selectItemsChamp}" />
		</h:selectOneMenu>
		</br></br>
		<h:commandButton value="Afficher Champ Séléctionné" action="#{champController.afficher}">
		</h:commandButton>
		</br></br>
		<h:outputLabel value="#{champController.selectedChamp}" />
		
	</h:form>

	</f:view>
</body>
</html>
