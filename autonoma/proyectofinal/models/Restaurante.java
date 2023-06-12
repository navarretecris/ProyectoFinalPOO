
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
    //Metodos Gestion Menu
    public boolean agregarPlatoAlMenu(Plato plato){
        return this.menu.agregarPlato(plato);
    }
    
    public Plato buscarPlatoEnMenu(long id){   
        return this.menu.buscarPlato(id);
    }
    
    public Plato buscarPlatoEnMenu(String nombre){   
        return this.menu.buscarPlato(nombre);
    }
    
    public boolean actualizarPlatoEnMenu(long id, Plato plato){
        return this.menu.actualizarPlato(id, plato);
    }
    
    public boolean eliminarPlatoDelMenu(long id){
        return this.menu.eliminarPlato(id);
    }
    
    public ArrayList<Plato> obtenerPlatos(){
        return this.menu.obtenerPlatos();
    }
    
    public String mostrarMenu(){
        return this.menu.mostrarMenu();
    }
    
    //Metodos Gestion Ventas    
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
    
    public String mostrarPlatosVendidos(){
        return this.venta.mostrarPlatosVendidos();
    }
    
    public void agregarPlatosVendidos(Venta venta, ArrayList<Plato> platosVendidos) {
        for (Plato plato : platosVendidos) {
            venta.agregarPlato(plato);
        }
    }

    
    public boolean agregarVenta(Venta venta){
        return this.ventas.add(venta);
    }
    
    public Venta buscarVenta(int codigo){
        for (int i = 0; i < this.ventas.size(); i++){
            Venta v = this.ventas.get(i);
            if(codigo == v.getCodigo()){
                return v;
            }
        }
        return null;
    }
    
    public boolean actualizarVenta(int codigo, Venta venta){
        int index = -1;
        
        for (int i = 0; i < this.ventas.size(); i++){
            if(codigo == this.ventas.get(i).getCodigo()){
                index = i;
            }
        }
        
        if(index>=0){
            this.ventas.set(index, venta);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean eliminarVenta(int codigo){
        int index = -1;
        
        for (int i = 0; i < this.ventas.size(); i++){
            if(codigo == this.ventas.get(i).getCodigo()){
                index = i;
            }
        }
        
        if(index>=0){
            this.ventas.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Venta> obtenerVentas(){
       return this.ventas;
    }
    
    public String mostrarVenta(){
        String venta = "";
        for(int i = 0; i < this.ventas.size(); i++){
            Venta v = this.ventas.get(i);
            venta += "----------------------------\n";
            venta += v.toString();
        }
        return venta;
        
    }
    
    
    
    
    //Metodos Gestion Empleados
    public boolean agregarEmpleado(Empleado empleado){
        return this.empleados.add(empleado);
    }
    
    public Empleado buscarEmpleado(long documentoIdentidad){
        for (int i = 0; i < this.empleados.size(); i++){
            Empleado e = this.empleados.get(i);
            if(documentoIdentidad == e.getDocumentoIdentidad()){
                return e;
            }
        }
        return null;
    }
    
    public Empleado buscarEmpleado(String nombre){
        for (int i = 0; i < this.empleados.size(); i++){
            Empleado e = this.empleados.get(i);
            if(e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
    
    public boolean actualizarEmpleado(long documentoIdentidad, Empleado empleado){
        int index = -1;
        
        for (int i = 0; i < this.empleados.size(); i++){
            if(documentoIdentidad == this.empleados.get(i).getDocumentoIdentidad()){
                index = i;
            }
        }
        
        if(index>=0){
            this.empleados.set(index, empleado);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean eliminarEmpleado(long documentoIdentidad){
        int index = -1;
        
        for (int i = 0; i < this.empleados.size(); i++){
            if(documentoIdentidad == this.empleados.get(i).getDocumentoIdentidad()){
                index = i;
            }
        }
        
        if(index>=0){
            this.empleados.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Empleado> obtenerEmpleados(){
       return this.empleados;
   }
    
    public String mostrarEmpleado(){
        String empleado = "";
        for(int i = 0; i < this.empleados.size(); i++){
            Empleado e = this.empleados.get(i);
            empleado += "----------------------------\n";
            empleado += e.toString();
        }
        return empleado;
        
    }
    
}
