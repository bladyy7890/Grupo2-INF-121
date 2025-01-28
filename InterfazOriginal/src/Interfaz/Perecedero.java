/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;


/**
 *
 * @author rapto
 */
class Perecedero extends Producto {
    private Lote[] lotes = new Lote[50];
    private int cantidadLotes;
    

    public Perecedero(String nombre,double precio) {
        super(nombre,precio);
        this.cantidadLotes=0;
    }
    
    @Override
    public void agregarLote(Lote lote){
        this.lotes[this.cantidadLotes]=lote;
        this.cantidadLotes++;
    }
    
    public Lote quitarLote(){
        int aux = this.cantidadLotes;
        this.cantidadLotes--;
        return  this.lotes[aux];
    }
    
    @Override
    public Lote[] getLotes() {
        return lotes;
    }
    
    @Override
    public String getMarca() {
        return null;
    }
    
    @Override
    public void mostrar(){
        
        System.out.println("Precio del producto: "+precio);
        System.out.println("Numero de lotes: "+cantidadLotes);
        for (int i = 0; i < this.cantidadLotes; i++) {
            lotes[i].mostrar();
        }
    }

    public int getCantidadLotes() {
        return cantidadLotes;
    } 

    @Override
    public String getSistemaOperativo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTalla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
