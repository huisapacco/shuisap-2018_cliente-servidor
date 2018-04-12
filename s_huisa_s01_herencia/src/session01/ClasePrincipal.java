package session01;



public class ClasePrincipal {

    public static void main(String[] Args) {
        
        Profesor profe = new Profesor("Jose", "Servero Jaz", 38);
        profe.setNumCurso("2");
        profe.setFechIngresoProfesor("20-03-12");

        profe.mostrarNombreApellidosFechingreso();
    }

}
