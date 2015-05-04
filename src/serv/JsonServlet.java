package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

@SuppressWarnings("serial")
public class JsonServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/json;charset=utf-8");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cahce-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("id");
		List<Person> ps = DataDAO.getSubData(id);
		JSONArray jsonArr = JSONArray.fromObject(ps);
		pw.print(jsonArr.toString());
		pw.close();
	}
}
