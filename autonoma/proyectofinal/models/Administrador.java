
package autonoma.proyectofinal.models;


public class Administrador extends Persona {
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private String nombreUsuario;
    private String contrasena;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Administrador(String nombre, long documentoIdentidad, long telefono, String direccion, String nombreUsuario, String contrasena) {
        super(nombre, documentoIdentidad, telefono, direccion);
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
    
}
