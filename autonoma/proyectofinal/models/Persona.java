
package autonoma.proyectofinal.models;


public abstract class Persona {
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private String nombre;
    private long documentoIdentidad;
    private long telefono;
    private String direccion;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Persona(String nombre, long documentoIdentidad, long telefono, String direccion) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString(){
        return "DOCUMENTO IDENTIDAD "+this.documentoIdentidad+":\n"+
               "  NOMBRE: "+this.nombre+"\n"+
               "  TELEFONO: "+this.telefono+"\n"+
               "  DIRECCION: "+this.direccion+"\n\n"; 
    }
    
    
    
}
