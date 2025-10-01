// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Arreglos
        //Unidimensionales y muldimensiones
        //solo de ese tipo
        int [] numeros=new int[5];
        //0,1,2,3,4

        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;

        String [] nombres={"Ana","Luis","Carlos","MArta","Sofia"};

        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        //bidimensional, tridimensional,x,y,z tiempo
        arreglosmultidimensionales();
        ejemploarreglosbidimensionales();
    }

    public static void arreglosmultidimensionales(){
        //[1],[2][3]
        //[1],[2][3]
        //[1],[2][3]

        int matriz[][]=new int[3][3];
        //i=0 j=0
        //i=0 j=1
        //i=0 j=2
        //i=1 j=0
        int contador=1;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {

                matriz[i][j]=contador++;
            }
        }

        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {

                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
    }//Fin método muldimensional

    public static void ejemploarreglosbidimensionales(){
        System.out.println("Ejemplo Calificaciones");
        String[] estudiantes={"Ana","Luis","Carlos"};
        String[] materias={"Matematicas","Español","Geografia"};

        double[][] calificaciones={
                {8.5,9.0,7.5},//Ana
                {7.0,8.5,9.0},//Luis
                {9.5,7.5,5.0}//Carlos

        };

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]+":");
            for (int j = 0; j <materias.length ; j++) {
                System.out.printf(" %s: %.1f\n",materias[j],calificaciones[i][j]);
            }
            System.out.print("\n");
        }


    }


}//Fin clase