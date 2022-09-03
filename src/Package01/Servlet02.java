package Package01;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ser02")
public class Servlet02 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//获取客户端传递的参数  默认就是GET请求 Tomcat8以上不会乱码，而POST无论什么版本的tomcat就会乱码
		req.setCharacterEncoding("UTF-8"); // 必须置于第一行， 这是第一种解决乱码的方案， 但是只能针对Post请求
		String username = req.getParameter("username"); // 括号里的就是参数
		String  password = req.getParameter("password");
		System.out.println("姓名" + username);
		System.out.println("密码"+ password);
		// Post 会乱码 ，  request.setCharacterEncoding("UTF-8")
		// 解决tomcat7及以下版本的GET请求乱码
		String name = new String(req.getParameter("username").getBytes("ISO-8859-1"), "UTF-8");



	}
}
