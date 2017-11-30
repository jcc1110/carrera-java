package cadenas;

public class Cadenas {
    public static void main(String[] args) {
        // Declarando mis variable de tipo String
        String cadena;
        cadena = "Hola ";
        cadena += "mundo";
        
        // Presento la información
        System.out.println(cadena);
        System.out.println(cadena.length());
        System.out.println(cadena.getClass());
        System.out.println(cadena.isEmpty());
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        
        // Usando StringBuilder
        StringBuilder sb = new StringBuilder();
        
        // Concatenar las cadenas de caracteres
        sb.append("Hola").append(" ").append("mundo");
        
        // Agregando cadenas
        sb.insert(sb.length(), "!");
        System.out.println(sb); 
    }
}
