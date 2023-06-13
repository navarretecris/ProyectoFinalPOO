
package autonoma.proyectofinal.main;

import autonoma.proyectofinal.models.Empleado;
import autonoma.proyectofinal.models.Menu;
import autonoma.proyectofinal.models.Persona;
import autonoma.proyectofinal.models.Plato;
import autonoma.proyectofinal.models.PlatoInternacional;
import autonoma.proyectofinal.models.PlatoNacional;
import autonoma.proyectofinal.models.Restaurante;
import autonoma.proyectofinal.models.Venta;
import autonoma.proyectofinal.views.VentanaPrincipal;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        
        Restaurante restaurante = new Restaurante("EL BUEN SABOR","Elm Street", 8901431);
        VentanaPrincipal ventana = new VentanaPrincipal(restaurante);
        ventana.setVisible(true);
        
        
//        Restaurante restaurante = new Restaurante("El Buen Sabor", "Calle Elm", 8901431);
//        Venta venta = new Venta();
//        
//        Plato p1 = new PlatoNacional("ajiaco", 20000, "mera papa");
//        Plato p2 = new PlatoInternacional("ceviche Peruano", 45000, "Pescado","Peru");
//
//        ArrayList<Plato> platosVendidos = new ArrayList<>();
//        
//        restaurante.agregarPlatoVendido(p1);
//        restaurante.agregarPlatoVendido(p2);
//        
//        restaurante.agregarPlatosVendidos(venta, platosVendidos);
//        
//        restaurante.agregarVenta(venta);
//        
//        System.out.println(restaurante.mostrarVenta());
    
 
        
    }
    
}