import java.util.ArrayList;
import java.util.Scanner;

public class Operaciones {
    Profesor pro= new Profesor();

    //Arreglo Arraylist Profesor
    ArrayList<Profesor> listaprofesor=new ArrayList<>();

    Scanner entrada= new Scanner(System.in);
    void agregarProfesor(){
        System.out.println("Agregar Profesor");
        System.out.println("Ingresa el nombre");
        String nombre = entrada.next();

        System.out.println("Ingresa el edad");
        int edad = entrada.nextInt();

        System.out.println("Ingresa la materia");
        String materia = entrada.next();
        pro= new Profesor(nombre,edad,materia);
        listaprofesor.add(pro);// agregamos el objeto a la lista
        System.out.println("Si salio");

    }

    void mostrarProfesor(){

        for (Profesor prof:listaprofesor) {
                prof.mostrarInfo();
        }

    }

    void eliminarTodotes(){
        listaprofesor.clear();
    }

    void eliminarProfesor(String nombre){
        listaprofesor.removeIf(profe->profe.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Profesor eliminado");
    }


}
