
package examen.examenindividual_v2;
import java.util.Scanner;

public class Avion {
    //atributos
    private String ID = new String();
    private Integer pasajeros;
    
    //Constructor completo
    public Avion(String ID, Integer pasajeros){
        this.setID(ID);
        this.setPasajeros(pasajeros);
    }
    
    //Constructor vacio
    public Avion(){
    }

    //Getters && Setters
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public Integer getPasajeros() {
        return pasajeros;
    }
    public void setPasajeros(Integer pasajeros) {
        this.pasajeros = pasajeros;
    }
    
    //Métodos

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                "[ID: " + ID + "]\n"+
                "[Pasajeros: " + pasajeros + "]\n";
    }
    
    //Solicitar datos
    public static Avion solicitarDatos(){
        Scanner keyboard = new Scanner(System.in);
        Avion avion = new Avion();
        
        System.out.println("Introduce el ID del avion: ");
        avion.setID(keyboard.nextLine());
        
        System.out.println("Introduce el número de pasajeros: ");
        avion.setPasajeros(keyboard.nextInt());
        keyboard.nextLine();
        
        return avion;
    }
    
}
