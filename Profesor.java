public class Profesor {

    private String nombre;
    private int edad;

    private String materia;

    public Profesor() {
    }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+ "Edad: "+edad+ "Materia:"+materia);
    }
    public Profesor(String nombre, int edad, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
