package service;

import java.util.ArrayList;
import java.util.List;

import model.KdElectronics_Producto;

public class KDElectronics_Inventario {
    private List<KdElectronics_Producto> productos;

    public KDElectronics_Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(KdElectronics_Producto producto) {
        productos.add(producto);
    }

    public void actualizarProducto(KdElectronics_Producto producto) {
        if (productos != null && !productos.isEmpty()) {
            for (KdElectronics_Producto p : productos) {
                if (p != null && p.getCodigoProducto().equals(producto.getCodigoProducto())) {
                    p.setNombre(producto.getNombre());
                    p.setDescripcion(producto.getDescripcion());
                    p.setPrecioBase(producto.getPrecioBase());
                    p.setPrecioVenta(producto.getPrecioVenta());
                    p.setCategoria(producto.getCategoria());
                    p.setCantidadDisponible(producto.getCantidadDisponible());
                    break;
                }
            }
        }
    }

    public void eliminarProducto(String codigoProducto) {
        for (KdElectronics_Producto p : productos) {
            if (p.getCodigoProducto().equals(codigoProducto)) {
                productos.remove(p);
                break;
            }
        }
    }

    public KdElectronics_Producto obtenerProductoPorCodigo(String codigoProducto) {
        for (KdElectronics_Producto p : productos) {
            if (p.getCodigoProducto().equals(codigoProducto)) {
                return p;
            }
        }
        return null;
    }

    public List<KdElectronics_Producto> obtenerTodosLosProductos() {
        return productos;
    }
}