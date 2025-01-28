/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;


class Indumentaria extends NoPerecedero {
    
    private String talla;
    private String color;
    private String tipo;

    public Indumentaria(String nombre, double precio, String marca, String talla, String color, String tipo) {
        super(nombre, precio, marca);
        this.talla = talla;
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }
    @Override
    public String getTalla() {
        return talla;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrar(){
        super.mostrar();
        
        System.out.println("Talla: "+talla);
        System.out.println("Color: "+color);
        System.out.println("Tipo: "+tipo);
    }
}
