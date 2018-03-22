/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package Modelos;
/**
 *
 * Tabla Cuenta
 * 
 * 
 */

public class Cuenta {
    private Integer Codigo;
    private String Nro_cuenta;
    private Double Saldo;
    private String Tipo_cuenta;

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo_cuenta(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getNro_cuenta() {
        return Nro_cuenta;
    }

    public void setNro_cuenta(String Nro_cuenta) {
        this.Nro_cuenta = Nro_cuenta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipo_cuenta() {
        return Tipo_cuenta;
    }

    public void setTipo_cuenta(String Tipo_cuenta) {
        this.Tipo_cuenta = Tipo_cuenta;
    }
  
  
}
