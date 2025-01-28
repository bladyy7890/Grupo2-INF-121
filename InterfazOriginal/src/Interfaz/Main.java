/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;



/**
 *
 * @author rapto
 */
public class Main {
    public static void main(String[] args) {
        //Crear inventario
        Inventario<Producto> inventario = new Inventario<>();

        /*//Crear Productos perecederos
        Producto perecedero = new Perecedero("Leche",5);
        Producto perecedero2 = new Perecedero("Huevos",0.8);
        Producto perecedero3 = new Perecedero("Carne",25);*/
        
        //Crear productos no perecederos
        Producto electronico = new Electronico("Smartphone", 1700,"Samsung", "Android", "Plastico");
        //Producto indumentaria = new Indumentaria("Camiseta", 19.99, "Nike", "M", "Azul", "Ropa");
        Producto electronico2 = new Electronico("Laptop", 5000,"HP", "Windows", "Metalico");
        //Producto indumentaria2 = new Indumentaria("CamisetaPremium", 25.99, "Nike", "M", "Azul", "Ropa");
        Producto electronico3 = new Electronico("Laptop", 4000,"Samsung", "Windows", "Metalico");
        Producto electronico4 = new Electronico("Laptop", 5000,"Kasda", "Windows", "Metalico");
        
        /*//Crear lotes para productos no perecederos
        Lote lote1 = new Lote("ABC111",50,30,1,1,2025);
        Lote lote2 = new Lote("DFG222",10,60,2,2,2025);
        Lote lote3 = new Lote("XYZ333",12,31,3,3,2025);
        Lote lote4 = new Lote("LKM444",20,190,5,4,2025);
        Lote lote5 = new Lote("YYY555",40,500,6,3,2025);
        
        //Agregar lotes al vector Lotes en los objetos perecedero 
        perecedero.agregarLote(lote1);
        perecedero.agregarLote(lote2);
        perecedero.agregarLote(lote4);
        
        perecedero2.agregarLote(lote3);
        perecedero3.agregarLote(lote5);*/
        
        //Agregar productos al inventario
        /*inventario.agregarProducto(perecedero);
        inventario.agregarProducto(perecedero2);
        inventario.agregarProducto(perecedero3);*/
        inventario.agregarProducto(electronico);
        //inventario.agregarProducto(indumentaria);
        inventario.agregarProducto(electronico2);
        //inventario.agregarProducto(indumentaria2);
        inventario.agregarProducto(electronico3);
        inventario.agregarProducto(electronico4);
        

        System.out.println("--------------------------------------");
        System.out.println("Inventario inicial:");
        inventario.mostrarInventario();
        
        System.out.println("---------------------------------------");
        String mat[][]= new String [50][5];
        int cont=0;
        int col=0;
        while(inventario.getProductos()[cont]!= null){
            mat[cont][0]=inventario.getProductos()[cont].getNombre();
            mat[cont][1]=String.valueOf(inventario.getProductos()[cont].getPrecio());
            mat[cont][2]=inventario.getProductos()[cont].getMarca();
            mat[cont][3]=inventario.getProductos()[cont].getSistemaOperativo();
            mat[cont][4]=inventario.getProductos()[cont].getMaterial();
            cont++;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(mat[i][j]);
            }
        }
        
        /*System.out.println("\nEliminando producto 'Leche':");
        inventario.eliminarProducto("Carne");
        inventario.mostrarInventario();
        
        // Buscar un producto
        System.out.println("\nBuscando producto 'Camiseta':");
        Producto buscado = inventario.buscarProducto("Camiseta");
        if (buscado != null) buscado.mostrar();
        
        // Listar productos por tipo
        System.out.println("\nListando productos del tipo T:");
        inventario.listarProductosPorTipo(NoPerecedero.class);
        
        System.out.println("\nOrdenar por cantidad de lotes de menor a mayor:");
        inventario.ordenarCantidadLotes();
        
        System.out.println("-Ordenar por precio de menor a mayor:");
        inventario.ordenarPorPrecio();
        inventario.mostrarInventario();
        
        System.out.println("\nContar productos por tipo T");
        inventario.contarProductosPorTipo(Perecedero.class);
        
        System.out.println("\nActualizar el precio del producto con nombre x:");
        inventario.actualizarPrecio("Leche", 6);
        inventario.mostrarInventario();
        
        System.out.println("\nLimpiar el inventario de productos");
        inventario.limpiarInventario();
        inventario.mostrarInventario();*/
        
    }
}
