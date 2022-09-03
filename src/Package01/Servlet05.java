package Package01;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet("/ser05")
/*
request 作用域，
通过该对象可以在一个请求种传递数据，
作用范围： 在一次请求中有效，即服务器跳转有效。（请求转发跳转时有效）
 */
public class Servlet05 extends HttpServlet {

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet 05 ");

		req.setAttribute("name","admin");
		req.setAttribute("age", 18);
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbbb");
		req.setAttribute("list", list);
		//请求跳转到Servlet06,在此之前，根本就不是一个ruquest作用域，压根就不是一个对象
		req.getRequestDispatcher("ser06").forward(req,resp);
		
		
	}
}
		/*
  1 .   设置域对象     request.setAttrubute("形参","value");  request.setAttrubute(String name  , Object value);
  2 . 获取域对象内容    request.getAttrubute(String name)
  String name1 = (String) request.getAttrubute("形参");
  要使用包装类， (List<String>) 也可以强制转换
  
	3 . 删除域对象内容
	 request.removeAttribute(String name);
		 */