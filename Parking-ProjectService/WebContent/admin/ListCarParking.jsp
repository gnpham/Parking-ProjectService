<%@page import="model.bean.CarParking"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<tiles:insertTemplate template="../template/ad-template.jsp">
	<!-- DataTables CSS -->
	<link
		href="<%=request.getContextPath()%>/Resources/datatable-bootstrap/css/dataTables.bootstrap.css"
		rel="stylesheet" />

	<!-- DataTables Responsive CSS -->
	<link
		href="<%=request.getContextPath()%>/Resources/datatable-responsive/css/dataTables.responsive.css"
		rel="stylesheet" />

	<tiles:putAttribute name="header">
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Danh sách nhà xe</h1>
			</div>
			<!-- /.col-lg-12  -->
		</div>
	</tiles:putAttribute>

	<tiles:putAttribute name="body">
		<div class="row">
			<div class="col-md-12">
				<div class="well">
					<!-- Do du lieu tai day  -->
					<form action="">
						<div class="panel panel-default">
							<table class="table table-bordered" style="font-size:12px;">
								<thead>
									<tr style="font-weight: bold;">
										<td>Owner name</td>
										<td>Parking id</td>
										<td>Parking name</td>
										<td>Area name</td>
										<td>Empty slots</td>
										<td>Open time</td>
										<td>Close time</td>
										<td>Longitude</td>
										<td>Latitude</td>
										<td>Parking type name</td>
										<td>Address</td>
										
									</tr>
								</thead>
								<%
								ArrayList<CarParking> cp = (ArrayList<CarParking>) request.getAttribute("arrayCP");
								for (int i = 0; i < cp.size(); i++) {
								%>

								<tbody>

									<tr>
										<td><%=cp.get(i).getOwner_name()%></td>
										<td><%=cp.get(i).getParking_id()%></td>
										<td><%=cp.get(i).getParking_name()%></td>
										<td><%=cp.get(i).getArea_name()%></td>
										<td><%=cp.get(i).getEmpty_slot()%></td>
										<td><%=cp.get(i).getOpen_time()%></td>
										<td><%=cp.get(i).getClose_time()%></td>
										<td><%=cp.get(i).getLongtitude()%></td>
										<td><%=cp.get(i).getLatitude()%></td>
										<td><%=cp.get(i).getParking_type_name()%></td>
										<td><%=cp.get(i).getAddress()%></td>
<%-- 										<td><%=cp.get(i).getParking_type_id()%></td> --%>
									</tr>
									<%-- 									<a href="GiaoVien_SuaServlet?id=<%=gv.getMaGiaoVien()%>">Sửa</a> --%>
									<%-- 									<a href="doGiaoViecpoa?id=<%=gv.getMaGiaoVien()%>">Xóa</a> --%>

								<%} %>
								</tbody>
							</table>
						</div>
					</form>
				</div>
			</div>
	</tiles:putAttribute>

	<tiles:putAttribute name="footer">
		<div class="row">
			<div class="col-lg-12">
				<div class="col-lg-9"></div>
				<div class="col-lg-2">
					<button type="button" class="btn btn-info">Thêm nhà xe</button>
				</div>
			</div>
		</div>
	</tiles:putAttribute>
	<tiles:putAttribute name="javascript-source">

	</tiles:putAttribute>


</tiles:insertTemplate>