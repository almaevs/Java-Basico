public class Estudiante{
    //Atributos y métodos
    //Encapsulamiento :Ocultar atributos y que el acceso se realice desde la interfaz pública
    //Herencia
    //Abstracción
    //Polimorfismo

    private String nombre;
    private int edad;
    private String clase;

    //Constructor vacio
    public Estudiante(){
    }
    public Estudiante(String nombre,int edad,String clase){
        //Esta clase
        this.nombre=nombre;
        this.edad=edad;
        this.clase=clase;
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+ "Edad: "+edad+ "Clase:"+clase);
    }
    //getter y setter
    //getter Obtener el valor de la variable
    //setter Establecer el valor de la variable
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
