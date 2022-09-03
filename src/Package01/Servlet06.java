package Package01;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/ser06")
public class Servlet06 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet 06 执行结果如下");
		String name =(String) req.getAttribute("name");
		System.out.println("name 是 " + name);
		Integer age =(Integer) req.getAttribute("age");
		
		System.out.println("年龄是"+age);
		List<String> list =(List<String>) req.getAttribute("list");
		System.out.println("数组是"+list.get(0)); // 没有进行非空校验
		
		
	}
}
