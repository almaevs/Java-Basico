import java.math.*;

public class Principal {

    int numero;
    boolean activo;
    String texto;
    float num1=3.1416f;

    public static void main(String [] args){

        Persona obj=new Persona();


        System.out.println("Nombre"+obj.nombre+"\nEdad:"+obj.edad+"\nSexo:"+obj.sexo);

        String s1="Hola";
        String s2=new String("Hola mundo ");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println(s2.charAt(0));
        System.out.println(s2.substring(9));
        System.out.println(s2.substring(5,11));

        String a="Hola me gusta programar en Java";
        String b="hola";

        System.out.println(a.equalsIgnoreCase(b));

        System.out.println(a.contains("Java"));
        System.out.println(a.indexOf("gusta"));
        System.out.println(a.startsWith("me"));
        System.out.println(a.endsWith("Java"));

        StringBuilder sb= new StringBuilder("Hola");
        sb.append("Mundo");
        sb.insert(5,"Java");
        sb.replace(5,10,"JAVA");
        sb.delete(5,10);
        sb.reverse();
        sb.setCharAt(0,'L');
        sb.length();
        sb.capacity();

        System.out.println( sb.capacity());


        Principal obj1= new Principal();

        System.out.println(obj1.numero);
        System.out.println(obj1.activo);
        System.out.println(obj1.num1);
        System.out.println(obj1.texto);


        System.out.println("El valor es:"+obj1.num1);
        System.out.println("El valor es: %.2f%n"+obj1.num1);

        float numero=3.1415927f;
        System.out.printf("Sin decimales:%.0f%n",numero);

        System.out.println(Math.PI);

        //Operadores *+-/%

        int var=(5*6+3+4)*5;
        // 30+3+20
        //53
        System.out.println(var);

        int var2=10%3;
        //
        System.out.println(var2);

        // incrementos pos pre
        // a++
        //++a
        int num1=3, num2=4;

        System.out.println(num1);
        System.out.println(num2);

        num1=(num2--);
        System.out.println(num1);
        System.out.println(num2);

        num1=--num2;
        System.out.println(num1);
        System.out.println(num2);

        //asignación

        //num1=num1+num2
        System.out.println(num1+=num2);
        System.out.println(num1-=num2);
        System.out.println(num1*=num2);
        System.out.println(num1%=num2);
        //Casteo

        String x="1";
        Integer.parseInt(x);
        Double.parseDouble(x);

        //String

        String.valueOf(num1);

        System.out.println("Operadores logicos");
        //& y &&
        //&& evaluar 2 condiciones , si la primera es verdadera
        //& evaluar siempre ambas condiciones falso o verderaro


        if(obj1.valor1() & obj1.valor2()){
            System.out.println("Resultado:true");

        }else{
            System.out.println("Resultado:false");

        }

        if(obj1.valor2() && obj1.valor1()){
            System.out.println("Resultado:true");

        }else{
            System.out.println("Resultado:false");

        }

        //bucle
        for (int i = 0; i <10; i++) {

            System.out.println("Iteración número:" + i);

            if (i == 5) {
                break;
            }


        }

        for (int i = 0; i <10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println("For 2 iteración número:" + i);
        }

        int i=0;

        while(i<10){
            System.out.println("Iteración número:"+i);
            i++;
        }

        do{
            System.out.println("Iteración número:"+i);
            i++;
        }while(i<10);


       }

    public boolean valor1(){
        System.out.println("valor1");
        return true;
    }

    public boolean valor2(){
        System.out.println("valor2");
        return false;
    }





}
