package store;

import java.util.Scanner;
import store.employee.Employee;
import store.client.Client;

public class Store {
    public static void main(String[] args) {
        Employee e = new Employee();
        Client c = new Client();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        
        do {
            System.out.print("Escoja una opción a gestionar:\n1.Empleado.\n2.Cliente.\nOpción:");
            op = sc.nextInt();
            
            if(op != 1 && op != 2) {
                System.out.println("Ingrese una opción válida.\n\n\n\n\n");
            }
        } while(op != 1 && op != 2);
        
                
    }
}