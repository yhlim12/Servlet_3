package com.iu.member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MemberService memberService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MemberController() {
		super();
		memberService = new MemberService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// pathInfo
		String command = request.getPathInfo();

		// Method 형식
		String method = request.getMethod();
		boolean check = true;
		String path = "";
		try {
			if (command.equals("/memberJoin")) {
				if (method.equals("POST")) {
					MemberDTO memberDTO = new MemberDTO();

					memberDTO.setId(request.getParameter("id"));
					memberDTO.setPassword(request.getParameter("password"));
					memberDTO.setName(request.getParameter("name"));
					memberDTO.setPhone(request.getParameter("phone"));
					memberDTO.setEmail(request.getParameter("email"));
					memberDTO.setAge(Integer.parseInt(request.getParameter("age")));
					
					int result = memberService.memberJoin(memberDTO);
					
					if(result>0) {
						path="../WEB-INF/views/index.jsp";
					}

				} else {
					path = "../WEB-INF/views/member/memberJoin.jsp";
				}

			}else if(command.equals("/memberLogin")) {
				if(method.equals("POST")) {
					MemberDTO memberDTO = new MemberDTO();
					memberDTO.setId(request.getParameter("id"));
					memberDTO.setPassword(request.getParameter("password"));
				
					memberDTO = memberService.memberLogin(memberDTO);
					
					
					if(memberDTO != null) {
						HttpSession session = request.getSession();
						session.setAttribute("member", memberDTO);
						check=false;
						path="../";
					}else {
						request.setAttribute("result", "Login Fail");
						request.setAttribute("path", "./memberLogin");
						path="../WEB-INF/views/common/result.jsp";
					}
					
				}else {
					path="../WEB-INF/views/member/memberLogin.jsp";
				}
			}else if(command.equals("/memberLogout")) {
				HttpSession session = request.getSession();
				//session.removeAttribute("member");
				session.invalidate();
				check=false;
				path="../";
			}else if(command.equals("/memberMypage")) {
				
				path="../WEB-INF/views/member/memberMypage.jsp";
				
			}else if(command.equals("/memberDelete")) {
				HttpSession session = request.getSession();
				//MemberDTO memberDTO = new MemberDTO();
				//String id = request.getParameter("id");
				//memberDTO.setId(id);
				
				MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
				
				int result = memberService.memberDelte(memberDTO);
				if(result>0) {
					session.invalidate();
					
				}
				check=false;
				path="../";
				
			}else if(command.equals("/memberUpdate")) {
				if(method.equals("POST")) {
					HttpSession session = request.getSession();
					MemberDTO memberDTO = new MemberDTO();
					
					memberDTO.setName(request.getParameter("name"));
					memberDTO.setPhone(request.getParameter("phone"));
					memberDTO.setEmail(request.getParameter("email"));
					memberDTO.setAge(Integer.parseInt(request.getParameter("age")));
					memberDTO.setId(request.getParameter("id"));
					
					int result= memberService.memberUpdate(memberDTO);
					System.out.println(result);
					
					session.setAttribute("member", memberDTO);
					
					path="../WEB-INF/views/member/memberMypage.jsp";
					
					
				}
				else {
					
					path="../WEB-INF/views/member/memberUpdate.jsp";
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		}else {
			response.sendRedirect(path);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
