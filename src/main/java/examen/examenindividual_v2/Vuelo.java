
package examen.examenindividual_v2;
import java.util.Scanner;
import java.util.ArrayList;

public class Vuelo {
    //Atributos
    private Integer ID;
    private static Integer contador = 1;
    private Avion avion;
    private String origen = new String();
    private String destino = new String();
    
    //Constructor completo
    public Vuelo(Avion avion, String origen, String destino){
        this.setAvion(avion);
        this.setOrigen(origen);
        this.setDestino(destino);
        contador ++;
        this.ID = contador;
    }
    
    //Constructor vacio
    public Vuelo(){
        contador++;
        this.ID = contador;
    }
    
    //Getters && Setters

    public Integer getID(){
        return ID;
    }
    
    public Avion getAvion() {
        return avion;
    }
    public void setAvion(Avion avion) {
        this.avion = avion;
    }
    
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    //Métodos
    @Override
    public String toString(){
        return getClass().getSimpleName()+
                "[ID: "+ID+"]\n"+
                "[Avion: "+avion.toString()+"]\n"+ //Objetos con 'toString()'
                "[Origen: "+origen+"]\n"+
                "[Destino: "+destino+"]\n";
    }
    
    
    //añadirVuelo()
    public static void añadirVuelo(ArrayList<Vuelo> listaVuelos){
        listaVuelos.add(Vuelo.solicitarDatos());
    }
    
    //solicitarDatos()
    public static Vuelo solicitarDatos(){
        Scanner keyboard = new Scanner(System.in);
        Vuelo vuelo = new Vuelo();
        
        System.out.println("Introduce el origen: ");
        vuelo.setOrigen(keyboard.nextLine());
        
        System.out.println("Introduce el destino: ");
        vuelo.setDestino(keyboard.nextLine());
        
        vuelo.setAvion(Avion.solicitarDatos());
        keyboard.close();
        
        return vuelo;
    }
    
    //buscarVuelo()
    public static Integer buscarVuelo(ArrayList<Vuelo> listaVuelos){
        Scanner keyboard = new Scanner(System.in);
        Integer num = 0;
        int position = -1;
        
        System.out.println("Introduce el ID del vuelo a buscar: ");
        num = Integer.parseInt(keyboard.nextLine());
        
        int i = 0;
        boolean find = false;
        while(!find && i<listaVuelos.size()){
            if(num == listaVuelos.get(i).getID()){
                position = i;
                find = true;
            }
        i++;
        }
        
        return position;
    }
    
    //eliminarVuelo()
    public static boolean eliminarVuelo(ArrayList<Vuelo> listaVuelos){
        Scanner keyboard = new Scanner(System.in);
        boolean deleted = false;
        Integer num = 0;
        
        System.out.println("Introduce el ID del vuelo a buscar: ");
        num = keyboard.nextInt();
        
        int i=0;
        boolean find = false;
        while(!find && i<listaVuelos.size()){
            if(num == listaVuelos.get(i).getID()){
                listaVuelos.remove(i);
                find = true;
                System.out.println("Vuelo eliminado correctamente.");
                deleted = true;
            }
        i++;
        }
        
        /* Alternativa más eficiente utilizando método 'buscarVuelo(listaVuelos)'
        que retorna posición de vuelo en la lista o '-1' si no hay coincidencias.
        
        int position = Vuelo.buscarVuelo(listaVuelos);
        
        if(position != -1){
            listaVuelos.remove(position);
            deleted = true;
        */
        
        return deleted;
    }
    
    //buscarDestinoVuelo()
    public static void buscarDestinoVuelo(ArrayList<Vuelo> listaVuelos){
        Scanner keyboard = new Scanner(System.in);
        String destino = new String();
        
        System.out.println("Introduce el destino: ");
        destino = keyboard.nextLine();
        
        for(int i=0; i<listaVuelos.size(); i++){
            if(listaVuelos.get(i).getDestino().equalsIgnoreCase(destino)){
                System.out.println(listaVuelos.get(i).toString());
            }
            else{
                System.out.println("No se han encontrado vuelos con ese destino.");
            }
        }
    }
};
