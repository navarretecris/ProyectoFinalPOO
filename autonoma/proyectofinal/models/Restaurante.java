
package autonoma.proyectofinal.models;

import java.util.ArrayList;


public class Restaurante {
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private String nombre;
    private String direccion;
    private long telefono;
    private Menu menu;
    private Venta venta;
    //private Administrador administrador;
    private ArrayList<Venta> ventas;
    private ArrayList<Empleado> empleados;
    
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Restaurante(String nombre, String direccion, long telefono) {    
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.menu = new Menu();
        this.venta = new Venta();
        //this.administrador = new Administrador();
        this.ventas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
    public boolean agregarPlato(Plato plato){
        return this.menu.agregarPlato(plato);
    }
    
    public Plato buscarPlato(long id){   
        return this.menu.buscarPlato(id);
    }
    
    public Plato buscarPlato(String nombre){   
        return this.menu.buscarPlato(nombre);
    }
    
    public boolean actualizarPlato(long id, Plato plato){
        return this.menu.actualizarPlato(id, plato);
    }
    
    public boolean eliminarPlato(long id){
        return this.menu.eliminarPlato(id);
    }
    
    public ArrayList<Plato> obtenerPlatos(){
        return this.menu.obtenerPlatos();
    }
    
    public String mostrarMenu(){
        return this.menu.mostrarMenu();
    }
    
    public boolean agregarPlatoVendido(Plato plato){
        return this.venta.agregarPlato(plato);
    }
    
    public Plato buscarPlatoVendido(long id){   
        return this.venta.buscarPlato(id);
    }
    
    public Plato buscarPlatoVendido(String nombre){   
        return this.venta.buscarPlato(nombre);
    }
    
    public boolean actualizarPlatoVendido(long id, Plato plato){
        return this.venta.actualizarPlato(id, plato);
    }
    
    public boolean eliminarPlatoVendido(long id){
        return this.venta.eliminarPlato(id);
    }
    
    public ArrayList<Plato> obtenerPlatosVendidos(){
        return this.venta.obtenerPlatosVendidos();
    }
    
    public String mostrarVenta(){
        return this.venta.mostrarVenta();
    }
    
}
