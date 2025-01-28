/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ichut
 */
public class Proelectrico {
    int id;
    String nombre;
    double precio;
    String marca;
    String sisoperativo;
    String material;

    public Proelectrico() {
    }

    public Proelectrico(int id, String nombre, double precio, String marca, String sisoperativo, String material) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.sisoperativo = sisoperativo;
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSisoperativo() {
        return sisoperativo;
    }

    public void setSisoperativo(String sisoperativo) {
        this.sisoperativo = sisoperativo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
}
