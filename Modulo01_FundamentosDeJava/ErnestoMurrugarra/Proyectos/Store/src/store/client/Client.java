package store.client;
import store.interfaces.clients_i.clients_methods;
import store.interfaces.common_methods;
import store.person.Person;

public class Client extends Person implements common_methods, clients_methods {
    // Attr's
    private String Registered;
    private boolean Vip;
    
    // Methods
    public Client() {
        super();
        this.Registered = "";
        this.Vip = false;
    }

    public void setRegistered(String r) { this.Registered = r; }
    public void setVip(boolean v) { this.Vip = Vip; }
    
    public String getRegistered() { return Registered; }
    public boolean isVip() { return this.Vip; } 

    @Override
    public StringBuilder showInfo() {
        StringBuilder sb = new StringBuilder();
        // Atributos de padre
        sb.append(this.getName()).append("\n");
        sb.append(this.getGender()).append("\n");
        sb.append(this.getAge()).append("\n");
        sb.append(this.getAddress()).append("\n");
        
        // Atributos propios
        sb.append(this.Registered).append("\n");
        sb.append((this.Vip) ? "Es VIP." : "No es VIP.");
        
        return sb;
    }

    @Override
    public void askInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_4() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method_5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clientMethod1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clientMethod2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clientMethod3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}