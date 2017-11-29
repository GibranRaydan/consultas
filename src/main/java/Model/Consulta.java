/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gibran
 */
public class Consulta {
    private int idColmena;
    private String ubicacion;
    private String fabrica;
    private int idColmenaMadre;
    private int total;

    public Consulta(int idColmena, String ubicacion, String fabrica, int idColmenaMadre, int total) {
        this.idColmena = idColmena;
        this.ubicacion = ubicacion;
        this.fabrica = fabrica;
        this.idColmenaMadre = idColmenaMadre;
        this.total = total;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public int getIdColmenaMadre() {
        return idColmenaMadre;
    }

    public void setIdColmenaMadre(int idColmenaMadre) {
        this.idColmenaMadre = idColmenaMadre;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
    
}
