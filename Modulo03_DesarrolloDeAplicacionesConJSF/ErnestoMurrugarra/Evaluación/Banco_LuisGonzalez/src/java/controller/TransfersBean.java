/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.User;

import model.tranferencia;

@Named(value = "tb")
@ApplicationScoped
public class TransfersBean implements Serializable{
    
     public static final long serialVersionUID = 1L;
    private tranferencia TransObj;
    private List<tranferencia> TransLst;
   
    private  final int cta=1;
    private String Descripcion1;
    private double monto;
    private double total1;
    private OperationBean opeb;
    
    public TransfersBean(){
    
        this.TransObj= new tranferencia();
      this.TransLst = new ArrayList<>();  
      this.TransLst.add(new tranferencia(1," ",0.00,100.00));

    
    
    }

    public String getDescripcion1() {
        return Descripcion1;
    }

    public void setDescripcion1(String Descripcion1) {
        this.Descripcion1 = Descripcion1;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

    public tranferencia getTransObj() {
        return TransObj;
    }

    public void setTransObj(tranferencia TransObj) {
        this.TransObj = TransObj;
    }

    public List<tranferencia> getTransLst() {
        return TransLst;
    }

    public void setTransLst(List<tranferencia> TransLst) {
        this.TransLst = TransLst;
    }

    public OperationBean getOpeb() {
        return opeb;
    }

    public void setOpeb(OperationBean opeb) {
        this.opeb = opeb;
    }
    
    public void tranf() {
    
    /*for (tranferencia tranf: TransLst) {
                tranf.getSaldo();
                tranf.getMonto();
                tranf.getDescripcion();
                tranf.getCuenta();
              TransObj.setSaldo(tranf.getSaldo());
              TransObj.setMonto(tranf.getMonto());
            TransObj.setDescripcion(tranf.getDescripcion());
            TransObj.setCuenta(tranf.getCuenta());
            
              
           }  
        
    if(TransObj.getDescripcion().equals(null)){
    TransObj.setCuenta(cta);
    TransObj.setDescripcion(Descripcion1);
    TransObj.setMonto(monto);
    TransObj.setSaldo(total1);
    }*/

   }
      /*---------------------------------modificar ------*/
    

        public String editTransferencia(tranferencia tran){
        TransObj.setCanEdit(true);
            return null;
        }
        
         public String saveTransferencia() {
      
            
      for (tranferencia tf : this.TransLst) {
         tf.setCanEdit(false);
      }		
      return null;
         }

         
 /*------------------------------- Restar Balance----*/
        public void montorest(){
         double restmont;
         double mont;
         double sal;
         double saluser;
         double aumento;
         sal = TransObj.getSaldo();
            System.out.println(sal+" Saldo");
         mont = TransObj.getMonto();
            System.out.println("Monto: "+mont);
            
         //saluser= opeb.getUserObj().getSaldo();
         restmont=(sal-mont);
                  if(restmont<0){
                     FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "El monto Sobrepasa el Saldo", "");
            FacesContext.getCurrentInstance().addMessage(null, fm); 
         
         }else if(restmont>=0){

            TransObj.setSaldo(restmont);
          
                  }


         
        
      
    }




}
