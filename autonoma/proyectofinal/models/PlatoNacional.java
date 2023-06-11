
package autonoma.proyectofinal.models;


public class PlatoNacional extends Plato {

    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public PlatoNacional(String nombre, double costoFabricacion, String descripcion) {
        super(nombre, costoFabricacion, descripcion);
        this.precioVenta = this.calcularGanancia() * (1+IVA);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "PLATO " + this.id + ":\n" + 
               "NOMBRE: " + this.nombre + "\n" + 
               "PRECIO VENTA: " + this.precioVenta + "\n" +
               "COSTO FABRICACION: " + this.costoFabricacion + "\n" +
               "DESCRIPCION: " + this.descripcion + "\n";
    }
    
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public double calcularGanancia(){
       return this.getCostoFabricacion() * 1.25;
    }
    
}
