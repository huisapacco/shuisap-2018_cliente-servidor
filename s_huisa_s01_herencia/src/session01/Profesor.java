package session01;

public class Profesor extends Persona {

    private String NumCurso;
    private String FechIngreso;

       public Profesor(String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        FechIngreso = "";
    }
    
    public void setFechIngresoProfesor(String FechIngreso) {
        this.FechIngreso = FechIngreso;
    }

    public String getFechIngresoProfesor() {
        return FechIngreso;
    }
    public void setNumCurso(String NumCurs) {
        this.NumCurso = NumCurs;
    }

    public String getNumCurso() {
        return NumCurso;
    }
    public void mostrarNombreApellidosFechingreso() {

        System.out.println("Profesor de nombre: " + getNombre() + " " + getApellidos());
        System.out.println("Nº Cursos: " + getNumCurso());
        System.out.println("Fecha de Ingreso: " + getFechIngresoProfesor());
    }

}


