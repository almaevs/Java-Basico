import java.util.Scanner;
import java.util.ArrayList;

public class Principal {


    //Arreglo de objetos de Estudiante

    //Declare la clase

    public static void main(String [] args){
        //Arreglo de objetos

        //Constructor hace la misma función setter
        //For para agregar estudiante
        /*Estudiante est[]=new Estudiante[3];
        Scanner entrada= new Scanner(System.in);
        for (int i = 0; i <est.length; i++) {
            System.out.println("Agregar Estudiante");
            System.out.println("Ingresa el nombre");
            String nombre = entrada.next();

            System.out.println("Ingresa el edad");
            int edad = entrada.nextInt();

            System.out.println("Ingresa la clase");
            String clase = entrada.next();

            est[i]=new Estudiante(nombre,edad,clase);

        }*/
        //for para agregar profesor

        Operaciones op= new Operaciones();

        op.agregarProfesor();
        op.mostrarProfesor();


        op.eliminarProfesor("Juan");

      /* for (int i = 0; i <est.length ; i++) {
                System.out.println("Estudiante"+(i+1));
                est[i].mostrarInfo();
       }

        for (Estudiante e:est) {
            e.mostrarInfo();
        }*/

    }


}
