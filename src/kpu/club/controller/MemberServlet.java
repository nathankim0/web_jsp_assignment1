package kpu.club.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kpu.club.domain.StudentVO;
import kpu.club.persistence.MemberDAO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher view =request.getRequestDispatcher("register.html");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		response.getWriter().append("(POST)Served at: ").append(request.getContextPath());

		String cmd = "";
		cmd = request.getParameter("key");

		if (cmd.contentEquals("join")) {
			StudentVO studentVO = new StudentVO();

			studentVO.setID(request.getParameter("id"));
			studentVO.setPasswd(request.getParameter("passwd"));
			studentVO.setUsername(request.getParameter("username"));
			studentVO.setSnum(request.getParameter("snum"));
			studentVO.setDepart(request.getParameter("depart"));
			studentVO.setMobile(request.getParameter("mobile"));
			studentVO.setEmail(request.getParameter("email"));

			MemberDAO memDAO = new MemberDAO();
			memDAO.join(studentVO);

			request.setAttribute("id", studentVO.getID());
			request.setAttribute("username", studentVO.getUsername());
			request.setAttribute("snum", studentVO.getSnum());
			request.setAttribute("depart", studentVO.getDepart());
			request.setAttribute("mobile", studentVO.getMobile());
			request.setAttribute("email", studentVO.getEmail());

			RequestDispatcher view = request.getRequestDispatcher("result.jsp");
			view.forward(request, response);
		}
	}
}
