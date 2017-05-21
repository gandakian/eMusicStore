<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
    <div class="container">

        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Cart</h1>
                    <p>All the selected products in your hopping Cart.</p>
                </div>
            </div>
        </section>

        <section class="container">
            <div>
                <a class="btn btn-danger pull-left"><span class="glyphicon glyphicon-remove-sign"/> Clear cart</a>
            </div>

            <table class="table table-hover">
                <tr>
                    <th>Product</th>
                    <th>Unit Price</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
                <tr>
                    <td>ProductName</td>
                    <td>ProductPrice</td>
                    <td>Quantity</td>
                    <td>TotalPrice</td>
                    <td>Remove Button</td>
                </tr>
                <tr>
                   <th></th>
                   <th></th>
                   <th>Grand Total</th>
                   <th>grandTotal</th>
                   <th></th>
                </tr>

            </table>

            <a href="<spring:url value="/productList" />">Continue Shopping</a>
        </section>
    </div>

</div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>