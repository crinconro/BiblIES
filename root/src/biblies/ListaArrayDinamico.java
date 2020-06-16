/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblies;

/**
 *
 * @author deste
 */
public class ListaArrayDinamico {
    
    private int capacidad;
    private int ultimo=0;
    private int tamano;
    private Texto[] arreglo ;
    private String[] dato;

    public ListaArrayDinamico() {
        capacidad = 1000;
        ultimo = 0;
        arreglo = new Texto[1000];
        dato = new String[1000];
    }
    
    
    public int getIndex(Texto texto){
        int retorno =0;
        
        
        
        
        
        
        return retorno;
        
    }
    
    public boolean isEmpty(){
        
        if(ultimo==0)
            return true;
        else 
            return false;
    }
    public void add(Texto objeto){
        
        if (ultimo == capacidad){
            
            Texto arreglo2[]= new Texto[capacidad*2];
            
            for (int i = 0;i<capacidad;i++){
                
                arreglo2[i]= arreglo[i];
                
            }
            capacidad = capacidad*2;
                
            arreglo = arreglo2;
            
        }
        
        arreglo[ultimo] = objeto;
        ultimo++;
                
        
    }
    public void add(String objeto){
        
        if (ultimo == capacidad){
            
            String arreglo2[]= new String[capacidad*2];
            
            for (int i = 0;i<capacidad;i++){
                
                arreglo2[i]= dato[i];
                
            }
            capacidad = capacidad*2;
                
            dato = arreglo2;
            
        }
        
        dato[ultimo] = objeto;
        ultimo++;
                
        
    }
    
    
    public void addEnLugar(Texto objeto, int lugar){
        
        if (lugar<=ultimo)
        
        arreglo[lugar] = objeto;
        
        
    }
    
    public Texto getUltimoTexto(){
        
        
        return arreglo[ultimo];
        
        
    }
    
    
    
    public Texto get (int lugar){
        
        if (lugar<=ultimo){
            
            return arreglo[lugar];
            
        }
        return null;
    }
   
    public void removeUltimoTexto(){
        
        ultimo--;
        
    }
    
    
    
      
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

 
    public Texto[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Texto[] object){
        
        this.arreglo=object;
        
   

        }
    


         @Override
    
     public String toString(){
        
        
          String imprimir= "";
          
          for(int i = 0; i < ultimo;i++){
            
            imprimir += arreglo[i].toString()+"\n";
           
          }
          
          return imprimir;

    }

    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public ListaEnlazada toListaEnlazada(){
        ListaEnlazada lista=new ListaEnlazada();
        
        for(int i=0;i<=tamano;i++){
            if(arreglo[i]!=null){
            Nodo nuevoNodo=new Nodo(arreglo[i]);
            lista.add(nuevoNodo);
            }
        }
        return lista;

    }  

    public String[] getDato() {
        return dato;
    }

    public void setDato(String[] dato) {
        this.dato = dato;
    }
    
    public String getDatoString(){
        String retorno = "";
        
        for (int i = 0; i<ultimo;i++){
            retorno+= dato[i];
        }
        
        return retorno;
    }
    public int getSize(){
        return ultimo;
    }
   
    
}
