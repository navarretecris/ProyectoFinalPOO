
package autonoma.proyectofinal.models;

public abstract class Plato {
    protected final double IVA = 0.19; 
    public static int contadorPlatos = 1;
     
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    protected int id;
    protected String nombre;
    protected double precioVenta;
    protected double costoFabricacion;
    protected String descripcion;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Plato(String nombre, double costoFabricacion, String descripcion) {
        this.id = contadorPlatos;
        this.nombre = nombre;
        this.costoFabricacion = costoFabricacion;
        this.descripcion = descripcion;
        contadorPlatos++;
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
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

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
    public abstract double calcularGanancia();
}
