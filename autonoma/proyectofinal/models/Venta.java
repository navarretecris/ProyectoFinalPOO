
package autonoma.proyectofinal.models;

import java.util.ArrayList;
import java.util.Date;


public class Venta {
    public static int contadorVentas = 1;
    
    //Atributos
    ////////////////////////////////////////////////////////////////////////////
    private int codigo;
    private double valorTotal;
    private double valorGanancia;
    private Date fecha;
    private ArrayList<Plato> platosVendidos;
    
    //Constructor
    ////////////////////////////////////////////////////////////////////////////
    public Venta() {
        this.codigo = contadorVentas;
        this.fecha = new Date();
        this.platosVendidos = new ArrayList<>();
        contadorVentas++;
    }
    
    

    //Metodos de acceso
    ////////////////////////////////////////////////////////////////////////////
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {    
        this.codigo = codigo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorGanancia() {
        return valorGanancia;
    }

    public void setValorGanancia(double valorGanancia) {
        this.valorGanancia = valorGanancia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    ////////////////////////////////////////////////////////////////////////////
     @Override
    public String toString() {
        return "CODIGO "+this.codigo+":\n"+
               "FECHA: "+this.fecha+"\n"+
               "VALOR TOTAL: "+this.valorTotal+"\n"+
               "VALOR GANACIA: "+this.valorGanancia+"\n"+
               "PLATOS VENDIDOS: "+this.mostrarPlatosVendidos()+"\n\n";
    }
    
    
    //Metodos
    ////////////////////////////////////////////////////////////////////////////
     public boolean agregarPlato(Plato plato){
        return this.platosVendidos.add(plato);
    }
    
    public Plato buscarPlato(long id){
        for (int i = 0; i < this.platosVendidos.size(); i++){
            Plato p = this.platosVendidos.get(i);
            if(id == p.getId()){
                return p;
            }
        }
        return null;
    }
    
    public Plato buscarPlato(String nombre){
        for (int i = 0; i < this.platosVendidos.size(); i++){
            Plato p = this.platosVendidos.get(i);
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    public boolean actualizarPlato(long id, Plato plato){
        int index = -1;
        
        for (int i = 0; i < this.platosVendidos.size(); i++){
            if(id == this.platosVendidos.get(i).getId()){
                index = i;
            }
        }
        
        if(index>=0){
            this.platosVendidos.set(index, plato);
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean eliminarPlato(long id){
        int index = -1;
        
        for (int i = 0; i < this.platosVendidos.size(); i++){
            if(id == this.platosVendidos.get(i).getId()){
                index = i;
            }
        }
        
        if(index>=0){
            this.platosVendidos.remove(index);
            return true;
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Plato> obtenerPlatosVendidos(){
       return this.platosVendidos;
    }
    
    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Plato p: platosVendidos){
            valorTotal += p.getPrecioVenta();
        }
        return valorTotal;
    }
    
    public double calcularValorGanancia(){
        double valorGanancia = 0.0;
        for(Plato p: platosVendidos){
            valorGanancia += (p.calcularGanancia() - p.getCostoFabricacion());
        }
        return valorGanancia;
    }
    
    public String mostrarPlatosVendidos(){
        String platosVendidos = "";
        for(int i = 0; i < this.platosVendidos.size(); i++){
            Plato p = this.platosVendidos.get(i);
            platosVendidos += "----------------------------\n";
            platosVendidos += p.toString();
        }
        return platosVendidos;
        
    }
    
    
}
