import java.util.Stack;
import javax.swing.*;
public class Ejemplostack {

    public static void  main(String [] args){

        Stack<Estudiante> pilaEstudiante= new Stack<>();
        int opcion;
     do {
         String menu = "1.Agregar estudiante\n" + "2.Mostrar estudiante\n+" +
                 "3.Ver estudiantes " +
                 "" +
                 "";

         String entrada = JOptionPane.showInputDialog("Ingresa el numero" + menu);
         opcion = Integer.parseInt(entrada);

         switch (opcion) {
             case 1:
                 String nombre = JOptionPane.showInputDialog("Nombre del estudiante");
                 int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                 String clase = JOptionPane.showInputDialog("Clase");
                 pilaEstudiante.push(new Estudiante(nombre, edad, clase));

                 JOptionPane.showMessageDialog(null, "Estudiante agregado");
                 break;
             case 2:
                 if (pilaEstudiante.isEmpty()) {
                     JOptionPane.showMessageDialog(null, "La pila esta vacia");

                 } else {
                     StringBuilder lista = new StringBuilder("Pila de estudiantes \n");

                     for (Estudiante e : pilaEstudiante) {
                         lista.append(e.getNombre()).append("\n");

                     }


                     JOptionPane.showMessageDialog(null, lista.toString());

                 }

                 break;
         }
     }while(opcion!=9);

    }



}
