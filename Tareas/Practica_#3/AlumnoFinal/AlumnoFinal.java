/*
package AlumnoFinal;
public class AlumnoFinal {
public static void main (String[] args){
        
        Telefono telefonoTutor = new Telefono("+52","981","9818278440");
        Tutor tutor01 = new Tutor("Margarita", 56, telefonoTutor);
        Alumno Alumno01 = new Alumno("Hector","Ingeniero en Sistemas Computacionales", 64374,3, 'B',tutor01); 
        String telefono = Alumno01.getTutor().getTelefono().toString();
        System.out.println("El telefono del Tutor es: "+telefono);
    }
}*/

//Coreccion

package AlumnoFinal;
public class AlumnoFinal {
public static void main (String[] args){
        
        Telefono numeroTutorPichis = new Telefono("+52","981","9818278440");
        Tutor tutorPichis = new Tutor("Margarita", 56, numeroTutorPichis);
        Alumno Pichis = new Alumno("Hector",
        "Ingeniero en Sistemas Computacionales",
        64374,3, 'B',tutorPichis); 
        
        System.out.println("----------------------------------------------------");
        System.out.println("DATOS GENERALES DEL ALUMNO");
        
        String Nombre = Pichis.getNombre();
        System.out.println("Nombre:"+Nombre);
        
        String Carrera = Pichis.getCarrera();
        System.out.println("Carrera: "+Carrera);
        
        int Matricula = Pichis.getMatricula();
        System.out.println("Matricula: "+Matricula);
        
        int Grado = Pichis.getGrado();
        System.out.println("Grado:"+Grado);
                
        char Grupo = Pichis.getGrupo();
        System.out.println("Grupo:"+Grupo);
        
        System.out.println("----------------------------------------------------");
        System.out.println("DATOS DEL TUTOR");
        
        String NombreTutor = Pichis.getTutor().getNombre();
        System.out.println("Nombre del Tutor: "+NombreTutor);
        
        int EdadTutor = Pichis.getTutor().getEdad();
        System.out.println("Edad del Tutor: "+EdadTutor);
               
        String telefono = Pichis.getTutor().getTelefono().toString();
        System.out.println("El telefono del Tutor es: "+telefono);
        
    }
}
