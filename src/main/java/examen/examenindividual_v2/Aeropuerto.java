
package examen.examenindividual_v2;
import java.util.Scanner;
import java.util.ArrayList;

public class Aeropuerto{
    
    Scanner keyboard = new Scanner(System.in);
        
        //atributos
        private String nombre = new String();
        private Integer capacidad;
        private ArrayList<Vuelo> listaVuelos;
        
        //Constructor completo
        public Aeropuerto(String nombre, Integer capacidad, ArrayList<Vuelo> listaVuelos){
            this.setNombre(nombre);
            this.setCapacidad(capacidad);
            this.listaVuelos = new ArrayList<Vuelo>();
            
            if(listaVuelos != null){
                this.setListaVuelos(listaVuelos);
            };
        };
        
        //Constructor vacio
        public Aeropuerto(){
            this("",0,null);
        }
        
        //Getters && Setters
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        
        public Integer getCapacidad(){
            return capacidad;
        }
        public void setCapacidad(Integer capacidad){
            this.capacidad = capacidad;
        }
        
        public ArrayList<Vuelo> getListaVuelos(){
            return listaVuelos;
        }
        public void setListaVuelos(ArrayList<Vuelo> listaVuelos){
            this.listaVuelos = listaVuelos;
        }
        
        //Métodos
        @Override
        public String toString(){
            return getClass().getSimpleName()+
                    "\n[Nombre: "+nombre+"]\n"+
                    "[Capacidad: "+capacidad+"]\n"+
                    "[Lista Vuelos: "+listaVuelos.toString()+"]\n";//para objetos se utiliza '.toString()'
        };
        
        //Metodo comprobarCapacidad
        public boolean comprobarCapacidad(ArrayList<Vuelo> listaVuelos){
            boolean capacity = false;
            Integer total = 0;
            
            for(int i=0; i<listaVuelos.size(); i++){
                total += listaVuelos.get(i).getAvion().getPasajeros();
            }
            
            if(total > this.getCapacidad()){
                capacity = true;
            }
            
            return capacity;
        }
        
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int option=0;
        
        //Crea un objeto de clase Aeropuerto
        Aeropuerto port1 = new Aeropuerto();
        
        //Menú de opciones
        System.out.println("Selecciona una de las opciones:\n"
                + "1. Añadir vuelo\n"
                + "2. Ver lista de vuelos segun destino\n"
                + "3. Eliminar vuelo\n"
                + "4. Comprobar capacidad");
        option = keyboard.nextInt();
        keyboard.nextLine();
        
        switch(option){
            case(1):
                System.out.println("Opción 1 seleccionada");
                Vuelo.añadirVuelo(port1.getListaVuelos());
                break;
            case(2):
                System.out.println("Opción 2 seleccionada");
                Vuelo.buscarDestinoVuelo(port1.getListaVuelos());
                break;
            case(3):
                System.out.println("Opción 3 seleccionada");
                // return boolean
                if(Vuelo.eliminarVuelo(port1.getListaVuelos())){
                    System.out.println("Se ha eliminado el vuelo.");
                }
                else{
                    System.out.println("No se ha eliminado el vuelo.");
                }
                break;
            case(4):
                System.out.println("Opción 4 seleccionada");
                // return boolean
                if(port1.comprobarCapacidad(port1.getListaVuelos())){
                    System.out.println("La capacidad de los vuelos supera la capacidad del areopuerto.");
                }
                else{
                    System.out.println("La capacidad de los vuelos no supera la capacidad del aeropuerto.");
                }
                break;
            default:
                System.out.println("Selecciona una opción válida...");
                
        }
    }
    
}
