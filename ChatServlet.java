import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ChatServlet")
public class ChatServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = request.getParameter("message");

        // 在实际应用中，你需要将消息发送给所有在线用户
        // 这里仅作为演示，直接返回相同的消息
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();
        out.write(message);
        out.flush();
    }
}