
package autonoma.proyectofinal.models;


public class PlatoInternacional extends Plato {
    //Atributo
    ////////////////////////////////////////////////////////////////////////////
    private String paisOrigen;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public PlatoInternacional(String nombre, double costoFabricacion, String descripcion, String paisOrigen) {
        super(nombre, costoFabricacion, descripcion);
        this.paisOrigen = paisOrigen;
        this.precioVenta = this.calcularGanancia() * (1+IVA);
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "PLATO " + this.id + ":\n" + 
               "NOMBRE: " + this.nombre + "\n" + 
               "PRECIO VENTA: " + this.precioVenta + "\n" +
               "COSTO FABRICACION: " + this.costoFabricacion + "\n" +
               "DESCRIPCION: " + this.descripcion + "\n" +
               "PAIS DE ORIGEN: " + this.paisOrigen + "\n";
    }
    
    
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public double calcularGanancia(){
       return this.getCostoFabricacion() * 1.30;
    }
    
}
