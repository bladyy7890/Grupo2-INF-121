/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;



/**
 *
 * @author rapto
 */
class Inventario<T extends Producto> {
    private T[] productos;
    private int nroProductos;

    @SuppressWarnings("unchecked")
    public Inventario() {
        productos = (T[]) new Producto[100];
        nroProductos = 0;
    }

    public void agregarProducto(T producto) {
        if (nroProductos < productos.length) {
            productos[nroProductos] = producto;
            nroProductos++;
        } else {
            System.out.println("Inventario lleno, no se puede agregar mas productos.");
        }
    }

    public boolean eliminarProducto(String nombre) {
        for (int i = 0; i < nroProductos; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                for (int j = i; j < nroProductos - 1; j++) {
                    productos[j] = productos[j + 1];
                }
                productos[nroProductos - 1] = null;
                nroProductos--;
                System.out.println("Producto eliminado: " + nombre);
                return true;
            }
        }
        System.out.println("Producto no encontrado: " + nombre);
        return false;
    }
    
    public T buscarProducto(String nombre) {
        for (int i = 0; i < nroProductos; i++) {
            if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
                return productos[i];
            }
        }
        System.out.println("Producto no encontrado: " + nombre);
        return null;
    }


    public void listarProductosPorTipo(Class<?> tipo) {
        System.out.println("Productos del tipo: " + tipo.getSimpleName());
        for (int i = 0; i < nroProductos; i++) {
            //Pregunta si el tipo de clase es Perecedero o No perecedero en la posicion i
            if (tipo.isInstance(productos[i])) {
                System.out.println("Nombre: "+ productos[i].getNombre());
                productos[i].mostrar();
                System.out.println("-------------------------");
            }
        }
    }
    
    public void ordenarPorPrecio() {
        for (int i = 0; i < nroProductos - 1; i++) {
            for (int j = 0; j < nroProductos - i - 1; j++) {
                    Producto p1 =  productos[j];
                    Producto p2 =  productos[j + 1];
                    if (p1.getPrecio() > p2.getPrecio()) {
                        T aux = productos[j];
                        productos[j] = productos[j + 1];
                        productos[j + 1] = aux;
                    }
            }
        }
        System.out.println("Productos ordenados por precio.");
    }

    public void ordenarCantidadLotes() {
        for (int i = 0; i < nroProductos - 1; i++) {
            for (int j = 0; j < nroProductos - i - 1; j++) {
                if (productos[j] instanceof Perecedero && productos[j + 1] instanceof Perecedero) {
                    Perecedero p1 = (Perecedero) productos[j];
                    Perecedero p2 = (Perecedero) productos[j + 1];
                    if (p1.getCantidadLotes() > p2.getCantidadLotes()) {
                        T aux = productos[j];
                        productos[j] = productos[j + 1];
                        productos[j + 1] = aux;
                    }
                }
            }
        }
        System.out.println("Productos ordenados por cantidad de lotes.");
    }


    public int contarProductosPorTipo(Class<?> tipo) {
        int contador = 0;
        for (int i = 0; i < nroProductos; i++) {
            if (tipo.isInstance(productos[i])) {
                contador++;
            }
        }
        System.out.println("Numero de productos de tipo " + tipo.getSimpleName() + ": " + contador);
        return contador;
    }

    public void limpiarInventario() {
        for (int i = 0; i < nroProductos; i++) {
            productos[i] = null;
        }
        nroProductos = 0;
        System.out.println("Inventario limpiado.");
    }
    
    public boolean actualizarPrecio(String nombre, double nuevoPrecio) {
    for (int i = 0; i < nroProductos; i++) {
        if (productos[i].getNombre().equalsIgnoreCase(nombre)) {
            Producto producto = productos[i];
            producto.setPrecio(nuevoPrecio);
            //producto.precio = nuevoPrecio;
            System.out.println("Precio actualizado para " + nombre + ": " + nuevoPrecio);
            return true;
        }
    }
    System.out.println("Producto no encontrado o no es NoPerecedero: " + nombre);
    return false;
}
    
    public void mostrarInventario() {
        if(nroProductos==0){
                System.out.println("El inventario esta vacio");
        }
        for (int i = 0; i < nroProductos; i++) {
            System.out.println("\nNombre: "+ productos[i].getNombre());
            
            productos[i].mostrar();  
            System.out.println("----------------------------------");
            
        }
    }

    public T[] getProductos() {
        return productos;
    }

    public int getNroProductos() {
        return nroProductos;
    }
    
    
}
