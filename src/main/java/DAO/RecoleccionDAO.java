/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Recoleccion;
import Util.DbUtil;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LabingXEON
 */
public class RecoleccionDAO {
    
     public boolean addRecoleccion(Recoleccion recoleccion) throws SQLException, URISyntaxException {
        boolean result = false;
        Connection connection = DbUtil.getConnection();
        String query = "insert into recoleccion (idrecoleccion,fecha,kilosmiel,idcolmena,idtrabajador) values (?,?,?,?,? );";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, recoleccion.getIdRecoleccion());
            preparedStmt.setString(2, recoleccion.getFecha());
            preparedStmt.setInt(3, recoleccion.getKilosMiel());
            preparedStmt.setInt(4, recoleccion.getIdColmena());
            preparedStmt.setInt(5, recoleccion.getIdTrabajador());
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
     
     public List<Recoleccion> getAllRecoleccion() throws SQLException, URISyntaxException {
        List<Recoleccion> recoleccion = null;
        boolean result = false;
        String query = "SELECT * FROM recoleccion where kilosmiel > 2 and idtrabajador !=12345";
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int idRecoleccion = 0;
            String fecha= null;
            int kilosMiel=0;
            int idColmena=0;
            int idTrabajador=0;

            while (rs.next()) {
                if (recoleccion == null) {
                    recoleccion = new ArrayList<Recoleccion>();
                }
                Recoleccion registro = new Recoleccion(idRecoleccion, fecha, kilosMiel, idColmena, idTrabajador);
                idRecoleccion = rs.getInt("idrecoleccion");
                registro.setIdRecoleccion(idRecoleccion);

                fecha = rs.getString("fecha");
                registro.setFecha(fecha);

                kilosMiel = rs.getInt("kilosmiel");
                registro.setKilosMiel(kilosMiel);
                
                idColmena = rs.getInt("idcolmena");
                registro.setIdColmena(idColmena);
                
                idTrabajador = rs.getInt("idtrabajador");
                registro.setIdTrabajador(idTrabajador);

                recoleccion.add(registro);

            }
            
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Tablas");
            e.printStackTrace();
        }

        return recoleccion;

    }
    
}
