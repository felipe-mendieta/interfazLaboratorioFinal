/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Felipe
 */
public class UnidadMedida {

    private int id;
    private String tituloUM;

    public UnidadMedida(int id, String tituloUM) {
        this.id = id;
        this.tituloUM = tituloUM;
    }

    @Override
    public String toString() {
        return tituloUM;
    }

    public int getId() {
        return id;
    }

    public String getTituloUM() {
        return tituloUM;
    }
    
}
