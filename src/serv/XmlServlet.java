package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class XmlServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter pw = response.getWriter();
		List<Person> ps = DataDAO.getData();
		pw.println("<persons>");
		for (Person tmp : ps) {
			pw.println("<person>");
			pw.println("<id>" + tmp.getNo() + "</id>");
			pw.println("<name>" + tmp.getName() + "</name>");
			pw.println("</person>");
		}
		pw.println("</persons>");
		pw.close();
	}
}
