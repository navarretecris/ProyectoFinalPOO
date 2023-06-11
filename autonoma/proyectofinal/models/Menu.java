
package autonoma.proyectofinal.models;

import java.util.ArrayList;


public class Menu {
    
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private String nombre;
    private int anoCreacion;
    private ArrayList<Plato> platos;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Menu(String nombre, int anoCreacion) {
        this.nombre = nombre;
        this.anoCreacion = anoCreacion;
        this.platos = new ArrayList<>();
    }
    
    public Menu(){
        this.nombre = "";
        this.anoCreacion = 0;
        this.platos = new ArrayList<>();
    }
    
    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }
    
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
    public boolean agregarPlato(Plato plato){
        return this.platos.add(plato);
    }
    
    public Plato buscarPlato(long id){
        for (int i = 0; i < this.platos.size(); i++){
            Plato p = this.platos.get(i);
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }
    
    public Plato buscarPlato(String nombre){
        for (int i = 0; i < this.platos.size(); i++){
            Plato p = this.platos.get(i);
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    public boolean actualizarPlato(long id, Plato plato){
        int index = -1;
        
        for (int i = 0; i < this.platos.size(); i++){
            if(id == this.platos.get(i).getId()){
                index = i;
            }
        }
        
        if(index>=0){
            this.platos.set(index, plato);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean eliminarPlato(long id){
        int index = -1;
        
        for (int i = 0; i < this.platos.size(); i++){
            if(id == this.platos.get(i).getId()){
                index = i;
            }
        }
        
        if(index>=0){
            this.platos.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Plato> obtenerPlatos(){
       return this.platos;
   }
    
    public String mostrarMenu(){
        String menu = "";
        menu += "Nombre del menú: " + this.nombre + "\n";
        menu += "Fecha de creación: " + this.anoCreacion + "\n";
        for(int i = 0; i < this.platos.size(); i++){
            Plato p = this.platos.get(i);
            menu += "----------------------------\n";
            menu += p.toString();
        }
        return menu;
        
    }
}
