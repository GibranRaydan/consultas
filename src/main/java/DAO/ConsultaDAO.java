/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Consulta;
import Util.DbUtil;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Gibran
 */
public class ConsultaDAO {
    
    public ArrayList<Consulta> getAllConsulta() throws SQLException, URISyntaxException {
        ArrayList<Consulta> consultas = null;
        boolean result = false;
        String query = "select  colmena.idcolmena,colmena.ubicacion,colmena.fabrica,colmena.idcolmenamadre,\n" +
            "sum(recoleccion.kilosmiel) as total from recoleccion,colmena,trabajador  where \n" +
            "recoleccion.idcolmena= colmena.idcolmena and recoleccion.idtrabajador = trabajador.idtrabajador\n" +
            "and trabajador.idtrabajador != 123456  group by colmena.idcolmena \n" +
            "having sum(recoleccion.kilosmiel)>2 order by sum(recoleccion.kilosmiel) asc limit 10 ";
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

         
            int idColmena=0;
            String ubicacion=null;
            String fabrica=null;
            int idColmenaMadre=0;
            int total=0;
            
            while (rs.next()) {
                if (consultas == null) {
                    consultas = new ArrayList<Consulta>();
                }
                Consulta registro = new Consulta(idColmena, ubicacion, fabrica, idColmenaMadre, total);
                idColmena = rs.getInt("idcolmena");
                registro.setIdColmena(idColmena);

                ubicacion = rs.getString("ubicacion");
                registro.setUbicacion(ubicacion);

                fabrica = rs.getString("fabrica");
                registro.setFabrica(fabrica);
                
                idColmenaMadre = rs.getInt("idcolmenamadre");
                registro.setIdColmenaMadre(idColmenaMadre);
                
                total = rs.getInt("total");
                registro.setTotal(total);

                consultas.add(registro);

            }
         
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Activos");
            e.printStackTrace();
        }

        return consultas;

    }
    
}
