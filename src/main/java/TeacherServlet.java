import model.core.Teacher;
import model.services.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/teacher")

public class TeacherServlet  extends HttpServlet {

@Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws SecurityException, IOException, ServletException {
    request.setAttribute("subject","Ghadeer");
    request.getRequestDispatcher("WEB-INF/views/welcome.jsp").forward(request,response);

}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String subject = request.getParameter("subject");
        TeacherService teacherService = new TeacherService();
        Teacher teacher = teacherService.getTeacherBySubject(subject);

        request.setAttribute("name", teacher.getName());
        request.setAttribute("age", teacher.getAge());
        request.setAttribute("subject", teacher.getSubject());

        request.getRequestDispatcher("WEB-INF/views/teacher.jsp").forward(request, response);

    }
}
