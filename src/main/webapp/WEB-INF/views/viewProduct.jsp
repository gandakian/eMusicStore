<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- for including the other external file --%>
<%@include file="/WEB-INF/views/template/header.jsp" %>


<div class="container-wrapper">

    <div class="container">
        <div class="page-header">

            <h1>Product Details</h1>
            <p class="lead">Here is the detail information of the product you selected...</p>

        </div>

        <div class="container" ng-app="cartApp">
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:url value="/resources/images/${product.productId}.png" /> " alt="image"
                         style="width: 100%"/>
                </div>
                <div class="col-md-5">
                    <h3>${product.productName}</h3>
                    <p>${product.productDescription}</p>
                    <p>${product.productManufacturer}</p>
                    <p>${product.productCategory}</p>
                    <p>${product.productCondition}</p>
                    <p>${product.productPrice} USD</p>

                    <br>

                    <c:set var="role" scope="page" value="${param.role}"/>
                    <c:set var="url" scope="page" value="/productList"/>
                    <c:if test="${role = 'admin'}">
                        <c:set var="url" scope="page" value="/admin/productInventory"/>
                    </c:if>

                    <p ng-controller="cartCtrl">
                        <a href="<c:url value="${url}" /> " class="btn btn-default">Back</a>
                        <a href="#" class="btn btn-warning btn-large" ng-click="addToCart('${product.productId}')">
                            <span class="glyphicon glyphicon-shopping-cart"></span> Order Now
                        </a>
                        <a href="<spring:url value="/cart" />" class="btn btn-default">
                            <span class="glyphicon glyphicon-hand-right"></span> View cart
                        </a>
                    </p>

                </div>
            </div>
        </div>

        <script src="<c:url value="/resources/js/controller.js" />"></script>

<%@include file="/WEB-INF/views/template/footer.jsp" %>