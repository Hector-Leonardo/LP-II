package AlumnoFinal;
public class AlumnoFinal {
public static void main (String[] args){
        
        Telefono telefonoTutor = new Telefono("+52","981","9818278440");
        Tutor tutor01 = new Tutor("Margarita", 56, telefonoTutor);
        Alumno Alumno01 = new Alumno("Hector","Ingeniero en Sistemas Computacionales", 64374,3, 'B',tutor01); 
        String telefono = Alumno01.getTutor().getTelefono().toString();
        System.out.println("El telefono del Tutor es: "+telefono);
    }
}
