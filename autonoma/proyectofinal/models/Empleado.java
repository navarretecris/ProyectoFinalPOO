
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
    
    /*@Override
    public String toString(){
        return "CARGO "+this.cargo+":\n"+
               "SALARIO: "+this.salario+"\n\n"; 
    }*/
   
}
