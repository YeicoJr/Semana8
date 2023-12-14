package model;

public class KdElectronics_Producto {
    private String codigoProducto;
    private String nombre;
    private String descripcion;
    private double precioBase;
    private double precioVenta;
    private String categoria;
    private int cantidadDisponible;

 

    public KdElectronics_Producto(String pCodigoProducto, String pNombreProducto, String pDescripcion, double pPrecioBase, double pPrecioVenta, String pCategoria, int pCantidadDisponible) {
		this.codigoProducto = pCodigoProducto;
		this.nombre = pNombreProducto;
		this.descripcion = pDescripcion;
		this.precioBase = pPrecioBase;
		this.precioVenta = pPrecioVenta;
		this.categoria = pCategoria;
		this.cantidadDisponible = pCantidadDisponible;
	}



	@Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
                + ", precioBase=" + precioBase + ", precioVenta=" + precioVenta + ", categoria=" + categoria
                + ", cantidadDisponible=" + cantidadDisponible + "]";
    }

	public String getCodigoProducto() {
		// TODO Auto-generated method stub
		return this.codigoProducto;
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String  getDescripcion() {
		// TODO Auto-generated method stub
		return this.descripcion;		
	}
	
	public Double getPrecioBase() {
		return this.precioBase;
	}
	
	public Double getPrecioVenta() {
		// TODO Auto-generated method stub
		return this.precioVenta;
	}
	
	public String getCategoria() {
		// TODO Auto-generated method stub
		return this.categoria;
	}
	
	public int getCantidadDisponible() {

		return this.cantidadDisponible;
	}
	
	public void setNombre(String pNombre) {
		this.nombre = pNombre;
	}


	public void setDescripcion(String pDescripcion) {
		this.descripcion = pDescripcion;
	}

	public void setPrecioBase(double pPrecioBase) {
		this.precioBase = pPrecioBase;
	}


	public void setPrecioVenta(double pPrecioVenta) {
		this.precioVenta = pPrecioVenta;
	}


	public void setCategoria(String pCategoria) {
		this.categoria = pCategoria;
	}

	public void setCantidadDisponible(int pCantidadDisponible) {
		this.cantidadDisponible = pCantidadDisponible;
	}
}