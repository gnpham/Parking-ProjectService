package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.CarParking;
import model.bo.CarParkingBO;

/**
 * Servlet implementation class showListCarParking
 */
@WebServlet("/showListCarParking")
public class showListCarParking extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showListCarParking() {
    	 super();
         // TODO Auto-generated constructor stub
     }

 	/**
 	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
 	 */
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		doPost(request, response);
 	}

 	/**
 	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 	 */
 	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
 		
 		CarParkingBO carParkingBO = new CarParkingBO();
 		ArrayList<CarParking> arrayCP = null;
 		arrayCP = carParkingBO.getListCP();
 		request.setAttribute("arrayCP",arrayCP);
 		
 		RequestDispatcher rd = request.getRequestDispatcher("admin/ListCarParking.jsp");
 		rd.forward(request, response);
 	}

 }
