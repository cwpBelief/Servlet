package Package01;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
  1 .  服务端的行为 ， 地址栏不会发生改变
  2 。 从始至终， 只有一个请求。
  4 ， 数据可以共享。 服务端的跳转才可以。
  5 ， 自此， 对一次请求应该具有更加深刻的认识
 */
@WebServlet("/ser04")
public class Servlet04 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// 接收客户端请求的参数
		String username  = req.getParameter("username");
		System.out.println("Servlet04 username " + username);

	}
}
