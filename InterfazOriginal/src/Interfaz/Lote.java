/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;
import java.util.Scanner;

public class Lote {
    private String nroLote;
    private FechaVencimiento fechaVencimiento;
    private int cantidad;
    private double precioLote;

   
    public Lote(String nroLote, int cantidad,double precioLote, int dia, int mes , int anio) {
        this.nroLote = nroLote;
        this.precioLote=precioLote;
        this.fechaVencimiento =  new FechaVencimiento(dia, mes, anio);
        this.cantidad = cantidad;
    }

    public String getNroLote() {
        return nroLote;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(FechaVencimiento fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public void leer() {
        Scanner lee = new Scanner(System.in);

        System.out.print("Ingrese el número de lote: ");
        this.nroLote = lee.next();

        System.out.print("Ingrese la cantidad: ");
        this.cantidad = lee.nextInt();
    }
  
    public void mostrar() {
        System.out.println("Codigo de Lote: " + this.nroLote);
        System.out.println("Cantidad: " + this. cantidad);
        System.out.println("Precio del lote: "+this.precioLote);
        this.fechaVencimiento.mostrar();
        System.out.println("__________________________________");
    }

    public double getPrecioLote() {
        return precioLote;
    }


}
