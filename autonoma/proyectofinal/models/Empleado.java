
package autonoma.proyectofinal.models;


public class Empleado extends Persona {

    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private String cargo;
    private double salario;
    
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Empleado(String nombre, long documentoIdentidad, long telefono, String direccion, String cargo, double salario) {
        super(nombre, documentoIdentidad, telefono, direccion);
        this.cargo = cargo;
        this.salario = salario;
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
    
}
