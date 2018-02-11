/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structures;

/**
 *
 * @author ricardoperez
 */
public class MyExceptions extends Exception{
    
    private int code;
    
    public MyExceptions (String _mensaje,int code) {
        super(_mensaje);
        this.code=code;
    }

    public int getCode() {
        return code;
    }
    
    
    
}
