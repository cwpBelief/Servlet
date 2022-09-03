 package Package01;
 import javax.servlet.ServletException;
 import javax.servlet.annotation.WebServlet;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import java.io.IOException;
 @WebServlet("/ser03")
 public class Servlet03 extends HttpServlet {
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   String username = req.getParameter("username");
   System.out.println("这里是 servlet03 " + username);
   System.out.println("hello , servlet03");
   req.getRequestDispatcher("Login.jsp").forward(req, resp); // 还可以跳到jsp页面，html页面
  }
 }
