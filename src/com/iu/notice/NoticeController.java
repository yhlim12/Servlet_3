package com.iu.notice;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NoticeController
 */
@WebServlet("/NoticeController")
public class NoticeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private NoticeService noticeService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeController() {
        super();
        noticeService = new NoticeService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// pathInfo
		String command = request.getPathInfo();

		// Method �삎�떇
		String method = request.getMethod();
		boolean check = true;
		String path = "";
		
		try {
			if(command.equals("/noticeList")) {
				ArrayList<NoticeDTO> ar = noticeService.noticeList();
				request.setAttribute("list", ar);
				
				path="../WEB-INF/views/notice/noticeList.jsp";
				
			}else if(command.equals("/noticeSelect")) {
				
				int seq = Integer.parseInt(request.getParameter("seq"));
				
				
				NoticeDTO noticeDTO = noticeService.noticeSelect(seq);
				request.setAttribute("dto", noticeDTO);
				
				path="../WEB-INF/views/notice/noticeSelect.jsp";
				
				
			}else if(command.equals("/noticeAdd")) {
				if(method.equals("POST")) {
					
					NoticeDTO noticeDTO = new NoticeDTO();
					noticeDTO.setTitle(request.getParameter("title"));
					noticeDTO.setContext(request.getParameter("context"));
					noticeDTO.setName(request.getParameter("name"));
						
					noticeService.noticeAdd(noticeDTO);
				
					check=false;
					path="./noticeList";
				
				}else {
					
					path="../WEB-INF/views/notice/noticeAdd.jsp";
				}
				
				
			}else if(command.equals("/noticeMod")) {
				
				if(method.equals("POST")) {
				NoticeDTO noticeDTO = new NoticeDTO();
				noticeDTO.setTitle(request.getParameter("title"));
				noticeDTO.setContext(request.getParameter("context"));
				noticeDTO.setName(request.getParameter("name"));
				noticeDTO.setSeq(Integer.parseInt(request.getParameter("seq")));
				
				System.out.println(noticeDTO.getTitle());
				
				int result = noticeService.noticeMod(noticeDTO);
				check=false;
				path="./noticeList";
				/* path= "../WEB-INF/views/notice/noticeList.jsp"; */
					
				
				}else {
					int seq = Integer.parseInt(request.getParameter("seq"));
					NoticeDTO noticeDTO = noticeService.noticeSelect(seq);
					request.setAttribute("dto", noticeDTO);
					path="../WEB-INF/views/notice/noticeMod.jsp";
				}
				
		
			}else if(command.equals("/noticeDelete")){
				int seq = Integer.parseInt(request.getParameter("seq"));
				int result = noticeService.noticeDelete(seq);
				
				if(result>0) {
					check =false;
					path="./noticeList";
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		if(check) {
			RequestDispatcher view = request.getRequestDispatcher(path);
			view.forward(request, response);
		}else {
			response.sendRedirect(path);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
