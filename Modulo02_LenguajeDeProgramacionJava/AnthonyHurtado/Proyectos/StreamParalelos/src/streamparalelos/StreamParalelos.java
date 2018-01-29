package streamparalelos;
import java.util.ArrayList;
import java.util.List;

public class StreamParalelos { 
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();
        for (int i = 0; i < 5; i++) {
            numeros.add(i);
        }
        
        numeros.stream().forEach(System.out::println);
        System.out.println("====");
        numeros.parallelStream().forEach(System.out::println);
    }
}
