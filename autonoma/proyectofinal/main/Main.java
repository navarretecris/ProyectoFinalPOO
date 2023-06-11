
package autonoma.proyectofinal.main;

import autonoma.proyectofinal.models.Menu;
import autonoma.proyectofinal.models.Plato;
import autonoma.proyectofinal.models.PlatoInternacional;
import autonoma.proyectofinal.models.PlatoNacional;
import autonoma.proyectofinal.models.Venta;


public class Main {
    public static void main(String[] args){
        
        Plato p1 = new PlatoNacional("ajiaco", 20000, "mera papa");
        Plato p2 = new PlatoInternacional("ceviche Peruano", 45000, "Pescado","Peru");
    
        /*Menu menu = new Menu("Menu Viernes", 2002);
    
        menu.agregarPlato(p1);
        menu.agregarPlato(p2);
        System.out.println(menu.mostrarMenu());*/

        Venta venta = new Venta();
        
        Venta v2 = new Venta();
    
        venta.agregarPlato(p1);
        venta.agregarPlato(p2);
        System.out.println(venta.mostrarVenta());
        
        v2.agregarPlato(p2);
        v2.agregarPlato(p2);
        System.out.println(v2.mostrarVenta());
    }
    
}
