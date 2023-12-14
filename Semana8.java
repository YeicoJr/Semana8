import java.util.List;

import model.KdElectronics_Producto;
import service.KDElectronics_Inventario;

public class Semana8 {
	
    public static void main(String[] args) {
        KDElectronics_Inventario inventarioService = new KDElectronics_Inventario();

       // Agregar_producto
        
        KdElectronics_Producto producto1 = new KdElectronics_Producto("1", "Computador", "HP", 2000000, 2500000, "Telecomunicaciones", 5);
        KdElectronics_Producto producto2 = new KdElectronics_Producto("2", "Teclado", "Genius", 15000, 25000, "Perifericos", 10);
        KdElectronics_Producto producto3 = new KdElectronics_Producto("3", "Mouse", "Genius", 10000, 15000, "Perifericos", 20);
        
        inventarioService.agregarProducto(producto1);
        inventarioService.agregarProducto(producto2);
        inventarioService.agregarProducto(producto3);
        

        System.out.println("Inventario Inicial:");
        imprimirTablaProductos(inventarioService.obtenerTodosLosProductos());
        System.out.println("---------------------------------------------"
        		+ "-------------------------------------------------------------");
        
        
         // Actualizar_producto
        KdElectronics_Producto productoActualizado1 = new KdElectronics_Producto("1", "Computador", "HP", 2000000, 2500000, "Telecomunicaciones", 0);
        KdElectronics_Producto productoActualizado2 = new KdElectronics_Producto("2", "Teclado", "Genius", 15000, 25000, "Perifericos", 4);
        KdElectronics_Producto productoActualizado3 = new KdElectronics_Producto("3", "Mouse", "Genius", 10000, 15000, "Perifericos", 10);
       inventarioService.actualizarProducto(productoActualizado1);
       inventarioService.actualizarProducto(productoActualizado2);
       inventarioService.actualizarProducto(productoActualizado3);
       

        // Mostrar_inventario_después_de_la_actualización
        System.out.println("Inventario después de la actualización:");
        imprimirTablaProductos(inventarioService.obtenerTodosLosProductos());
        System.out.println("------------------------------------------------"
        		+ "----------------------------------------------------------");
        
        
        // Eliminar_producto
        inventarioService.eliminarProducto("1");

        // Mostrar_inventario_después_de_la_eliminación
        System.out.println("Inventario después de la eliminación:");
        imprimirTablaProductos(inventarioService.obtenerTodosLosProductos());
    }
        
     // Método_para_imprimir_en_formato_de_tabla
    private static void imprimirTablaProductos(List<KdElectronics_Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        // Imprimir_encabezado
        System.out.println("ID   | Nombre              | Descripción    | Precio Base | Precio Venta | Categoría        | Cantidad");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        // Imprimir_productos
        for (KdElectronics_Producto producto : productos) {
            System.out.printf("%-5s|      %-15s| %-15s| %-12.2f| %-12.2f| %-18s|     %-7d%n",
                    producto.getCodigoProducto(), producto.getNombre(), producto.getDescripcion(),
                    producto.getPrecioBase(), producto.getPrecioVenta(), producto.getCategoria(),
                    producto.getCantidadDisponible());
        
    }
}
    }
