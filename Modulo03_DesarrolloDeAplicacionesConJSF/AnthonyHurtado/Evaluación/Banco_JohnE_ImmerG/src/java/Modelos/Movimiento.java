/**
 *
 * @author John Erice / Immer Gonzalez
 * Proyecto modulo 3 de Java
 * @version 1.0
 */
package Modelos;

/**
 *
 * Tabla Movimiento
 *
 *
 */
public class Movimiento {

    private Integer Codigo;
    private String Nro_cuenta;
    private Double monto;
    private String Cuenta_destino;
    private String Tipo_Movimiento;

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer Codigo) {
        this.Codigo = Codigo;
    }

    public String getNro_cuenta() {
        return Nro_cuenta;
    }

    public void setNro_cuenta(String Nro_cuenta) {
        this.Nro_cuenta = Nro_cuenta;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getCuenta_destino() {
        return Cuenta_destino;
    }

    public void setCuenta_destino(String Cuenta_destino) {
        this.Cuenta_destino = Cuenta_destino;
    }

    public String getTipo_Movimiento() {
        return Tipo_Movimiento;
    }

    public void setTipo_Movimiento(String Tipo_Movimiento) {
        this.Tipo_Movimiento = Tipo_Movimiento;
    }

}
