/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author LabingXEON
 */
public class Recoleccion {
    
    private int idRecoleccion;
    private String fecha;
    private int kilosMiel;
    private int idColmena;
    private int idTrabajador;

    public Recoleccion(int idRecoleccion, String fecha, int kilosMiel, int idColmena, int idTrabajador) {
        this.idRecoleccion = idRecoleccion;
        this.fecha = fecha;
        this.kilosMiel = kilosMiel;
        this.idColmena = idColmena;
        this.idTrabajador = idTrabajador;
    }

    public int getIdRecoleccion() {
        return idRecoleccion;
    }

    public void setIdRecoleccion(int idRecoleccion) {
        this.idRecoleccion = idRecoleccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getKilosMiel() {
        return kilosMiel;
    }

    public void setKilosMiel(int kilosMiel) {
        this.kilosMiel = kilosMiel;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
    
    
}
