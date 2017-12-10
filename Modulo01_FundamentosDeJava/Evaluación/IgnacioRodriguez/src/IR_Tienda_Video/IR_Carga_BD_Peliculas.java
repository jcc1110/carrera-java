/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IR_Tienda_Video;
import IR_Estructuras_Datos.IR_SBD_Peliculas;
import java.util.ArrayList;
/**
 *
 * @author Carmen Thais
 */
public class IR_Carga_BD_Peliculas extends IR_SBD_Peliculas{
    
    public IR_Carga_BD_Peliculas() {
        super.bdpeliculas = new ArrayList<>();
        super.bdpeliculas.add(new IR_Peliculas(0001,"p1",2017,"a"));
        super.bdpeliculas.add(new IR_Peliculas(0002,"p2",2017,"a"));
        super.bdpeliculas.add(new IR_Peliculas(0003,"p3",2017,"a"));
    }

    public IR_Peliculas validarIR_Peliculas(int _codigo) {
        IR_Peliculas peliculas = null;        
        for (IR_Peliculas pel : this.bdpeliculas) {
            if (pel.getCodigoPeli() == _codigo ) {
                peliculas = pel;
            }
        }
        return peliculas;

   }
}
