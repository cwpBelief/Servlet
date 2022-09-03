  package Package01;
  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;
  import java.io.IOException;
   @WebServlet("/ser01") // 设置访问的路经 (name = “servlet01” ， value = "/ser01") value 可以设置多个
  public class Servlet01 extends HttpServlet {  // 继承规范
    @Override // 重写方法
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // super.service(req, resp);
      System.out.println("hello world , servlet ");   // 这是控制台输出的内容
      // 通过 Flow 输出数据到浏览器
      resp.getWriter().write("HELL O , WORLD , SERVLET ");  // 这是网页中显示内容。
       /*
        页面每刷新一次， 控制台就会刷新一次，输出语句就会执行一次。
        */
       String url = req.getRequestURL()+"";
      System.out.println("获取请求的完整路径"+ url);
      StringBuffer uri = req.getRequestURL();
      System.out.println("获取请求的部分路径：" + uri);
      String queryString = req.getQueryString();
      System.out.println("获取请求时的参数字符串" + queryString);
      String method = req.getMethod();
      System.out.println("获取请求的方式： " + method);
      String prototol  = req.getProtocol();
      System.out.println("获取当前协议版本： " + prototol);
      String webapp = req.getContextPath();
      System.out.println("获取上下文路径，或者项目的站点名"+ webapp);
//http://localhost:8080/cwuping/ser01?username=admin&password=1234456
      /*
      hello world , servlet
获取请求的完整路径http://localhost:8080/cwuping/ser01
获取请求的部分路径：http://localhost:8080/cwuping/ser01
获取请求时的参数字符串username=admin&password=1234456
获取请求的方式： GET
获取当前协议版本： HTTP/1.1
获取上下文路径，或者项目的站点名/cwuping
       */
 // 获取指定名称的参数值
      String username1 = req.getParameter("username"); // 括号里的值要和穿过来的参数完全一致
      String password1 = req.getParameter("password");
      System.out.println("username  :"+username1);
      System.out.println("password  :"+password1);
// 获取指定名称的参数的所有参数值 ， 返回字符串数组，（用于复选框传值）
      String[] hobbys = req.getParameterValues("hobby");
    if(hobbys != null && hobbys.length > 0 ){
      for(String hobby : hobbys){
        System.out.println("爱好: "+hobby);
      }
    }



    }
  }