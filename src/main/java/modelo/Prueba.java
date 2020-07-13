/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Prueba {
    private int id;
    private String titulo;
    private double precio;
    private double limiteInferior;
    private double limiteSuperior;
    private int idArea;
    private int idUnidadMedida;

    public Prueba(int id, String titulo, double precio, double limiteInferior, double limiteSuperior, int idArea, int idUnidadMedida) {
        this.id = id;
        this.titulo = titulo;
        this.precio = precio;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.idArea = idArea;
        this.idUnidadMedida = idUnidadMedida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(double limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(double limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public int getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(int idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    @Override
    public String toString() {
        return titulo;
         
    }
}
