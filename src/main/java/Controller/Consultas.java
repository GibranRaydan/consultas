
package Controller;
import DAO.ConsultaDAO;
import Model.Consulta;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Gibran
 */
public class Consultas extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ConsultaDAO obj = new ConsultaDAO();

            ArrayList<Consulta> lista = (ArrayList<Consulta>) obj.getAllConsulta();

            request.setAttribute("listaConsultas", lista);

            request.getRequestDispatcher("index.jsp").forward(request, response);

        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }



    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
