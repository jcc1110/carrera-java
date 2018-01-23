/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism1;

import com.vehicles.*;

/**
 *
 * @author instructor
 */
public class Polymorphism1 {
    
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        
        vehicles[0] = new Sport("UIY65","Nissan","Atima",100);
        vehicles[1] = new Vehicle("UIY65","Nissan","Atima");
        vehicles[2] = new Turism("JGF34","Toyota","Pick Up",2);
        vehicles[3] = new Van("NHG21","Ford","Mini Van",3000);
        vehicles[4] = new Sport("LKN19","Nissan","A400",300);
        
        for(Vehicle v : vehicles) {
            System.out.println(v.showData());
            System.out.println("");
        }
    }
}