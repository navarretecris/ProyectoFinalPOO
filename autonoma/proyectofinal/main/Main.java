
package autonoma.proyectofinal.main;

import autonoma.proyectofinal.models.Empleado;
import autonoma.proyectofinal.models.Menu;
import autonoma.proyectofinal.models.Persona;
import autonoma.proyectofinal.models.Plato;
import autonoma.proyectofinal.models.PlatoInternacional;
import autonoma.proyectofinal.models.PlatoNacional;
import autonoma.proyectofinal.models.Restaurante;
import autonoma.proyectofinal.models.Venta;


public class Main {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante("El buen sabor", "Calle 223", 895389);
        
        
        Plato p1 = new PlatoNacional("ajiaco", 20000, "mera papa");
        Plato p2 = new PlatoInternacional("ceviche Peruano", 45000, "Pescado","Peru");
        
        Venta v = new Venta();
        
        restaurante.agregarPlatoVendido(p2);
        
        restaurante.agregarVenta(v);
        
        System.out.println(restaurante.mostrarVenta());
 
        
    }
    
}