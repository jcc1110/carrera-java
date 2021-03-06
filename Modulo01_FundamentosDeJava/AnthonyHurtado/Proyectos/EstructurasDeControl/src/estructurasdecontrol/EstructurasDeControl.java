package estructurasdecontrol;

public class EstructurasDeControl {
    public static void main(String[] args) {
        // Declarando mis variables
        int dia = 0;
        String diaSeleccionado;
        
        // Instanciando la clase Scanner
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        // Solicito el dato al usuario
        System.out.print("Introduzca un número: ");
        
        // Capturando el valor ingresado por el usuario
        dia = scan.nextInt();       
        
        // Establezco mi estructura de control y evaluo la variable "dia"
        switch (dia) {
            case 1:
                diaSeleccionado = "Lunes";
                break;
            case 2:
                diaSeleccionado = "Martes";
                break;
            case 3:
                diaSeleccionado = "Miercoles";
                break;
            case 4:
                diaSeleccionado = "Jueves";
                break;
            case 5:
                diaSeleccionado = "Viernes";
                break;
            default:
                diaSeleccionado = "No es ningún dia";
                break;
        }
        
        // Mostrando el resultado
        System.out.println(diaSeleccionado);
    }
}
