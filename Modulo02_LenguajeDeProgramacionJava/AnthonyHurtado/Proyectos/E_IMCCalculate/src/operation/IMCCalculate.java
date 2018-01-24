package operation;
import structure.I_IMC;

public class IMCCalculate implements I_IMC {
    @Override
    public double calculateIMC(double p, double t) {
        return p*p;
    }
    
    // Método para realizar el diagnostico
    public String resultIMC(double result) {
        // Variable necesaria
        String message;
        
        // Formateando el mensaje
        message = "Tu resultado fue " + result;
        message += " por tal motivo estas en ";        
        
        // Evaluación
        if (result < 18.5) {
            message += "PESO INSUFICIENTE";
        } else if(result >= 18.5 || result <= 24.9) {
            message += "PESO NORMAL";
        } else if(result >= 25 || result <= 26.9) {
            message += "SOBREPESO GRADO I";
        } else if(result >= 27 || result <= 29.9) {
            message += "SOBREPESO GRADO II";
        } else if(result >= 30 || result <= 34.9) {
            message += "OBESIDAD I";
        } else if(result >= 35 || result <= 39.9) {
            message += "OBESIDAD II";
        } else if(result >= 40 || result <= 49.9) {
            message += "OBESDAD III";
        } else if(result >= 50) {
            message += "EXTREMA";
        } else {
            message += "SIN EVALUACIÓN";
        }
        
        // Devuelvo el resultado
        return message;
    }
}
