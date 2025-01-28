package Interfaz;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


class FechaVencimiento {
    private int dia;
    private int mes;
    private int año;

    public FechaVencimiento(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getFecha() {
        return dia + "/" + mes + "/" + año;
    }
    public void mostrar(){
        System.out.println("Fecha: "+dia + "/" + mes + "/" + año);
    }
}
