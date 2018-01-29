package concurrencia;

public class HiloContador extends Thread {
    Contador contador;

    public HiloContador(String name, Contador contador) {
        super(name);
        this.contador = contador;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int valorContador;
                synchronized(this.contador) {
                    valorContador = this.contador.getContador();
                    Thread.sleep(1);
                    this.contador.setContador(valorContador + 1);
                    System.out.println(this.getPriority()+"-"+ this.getName() + " pone el contador a " + valorContador);      
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}