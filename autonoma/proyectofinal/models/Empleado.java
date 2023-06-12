
package autonoma.proyectofinal.models;

import java.util.ArrayList;


public class Empleado extends Persona {

    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private String cargo;
    private double salario;
    private ArrayList<Empleado> empleados;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Empleado(String nombre, long documentoIdentidad, long telefono, String direccion, String cargo, double salario) {
        super(nombre, documentoIdentidad, telefono, direccion);
        this.cargo = cargo;
        this.salario = salario;
        this.empleados = new ArrayList<>();
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
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
        empleado += "CARGO: " + this.cargo + "\n";
        empleado += "SALARIO " + this.salario + "\n";
        for(int i = 0; i < this.empleados.size(); i++){
            Empleado e = this.empleados.get(i);
            empleado += "----------------------------\n";
            empleado += e.toString();
        }
        return empleado;
        
    }
}
