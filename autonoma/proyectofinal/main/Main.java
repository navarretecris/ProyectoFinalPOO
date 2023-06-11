
package autonoma.proyectofinal.main;

import autonoma.proyectofinal.models.Menu;
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
       
        //restaurante.agregarPlato(p1);
        //System.out.println(restaurante.mostrarMenu());
        
        //restaurante.agregarPlato(p2);
        //System.out.println(restaurante.mostrarMenu());
        
        
        restaurante.agregarPlatoVendido(p1);
        restaurante.agregarPlatoVendido(p2);
        restaurante.agregarPlatoVendido(p2);
        System.out.println(restaurante.mostrarVenta());
       
        
        
    }
    
}
