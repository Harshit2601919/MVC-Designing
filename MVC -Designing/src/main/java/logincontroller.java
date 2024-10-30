

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class logincontroller
 */
@WebServlet("/logincontroller")
public class logincontroller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u =request.getParameter("uname");
		String p= request.getParameter("pass");
		
		System.out.println(u);
		System.out.println(p);
		
		Loginpojo loginpojo = new Loginpojo();
		loginpojo.setUname(u);
		loginpojo.setPass(p);
		
		boolean flag = loginpojo.blLogicLogin();
		System.out.println(flag);
		
		
		if(flag) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
