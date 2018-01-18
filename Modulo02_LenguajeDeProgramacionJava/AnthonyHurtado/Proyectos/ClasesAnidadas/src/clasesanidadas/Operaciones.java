package clasesanidadas;

public class Operaciones {
    // Atributos
    static int c;
    
    public static class Suma {
        // Atributos
        private int a;
        private int b;
        
        // Metodos
        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
        
        public int calcular() {
            return this.getA() + this.getB();
        }
    }
    
    // Metodos
}
