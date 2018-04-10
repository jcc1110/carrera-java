/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.models.afilliation_model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Fernando
 */
@Named(value = "af")
@Dependent
public class Afilliation implements Serializable {
    public static final long serialVersionUID = 1L;
    private afilliation_model afmodel = new afilliation_model();
    private List<afilliation_model> afmodelLst;
    private String false1="true";
    private String false2="false";

    public String change(){
        addAfilliation();
        return "acviews2";
    }
    public String getFalse1() {
        return false1;
    }

    public void setFalse1(String false1) {
        this.false1 = false1;
    }

    public String getFalse2() {
        return false2;
    }

    public void setFalse2(String false2) {
        this.false2 = false2;
    }

    public Afilliation() {        
        this.afmodelLst = new ArrayList<>();
        this.afmodelLst.add(new afilliation_model("Luis", "Lopez", "V", "15856256", "B", "C","01340254630004568040"));
        this.afmodelLst.add(new afilliation_model("Gabriela", "Garcia", "E", "13458563", "M", "A","01052523060080382207"));
        this.afmodelLst.add(new afilliation_model("Julia", "Lovera", "J", "25325221", "B", "C","01340254630865324540"));
        
    }

    public afilliation_model getAfmodel() {
        return afmodel;
    }

    public void setAfmodel(afilliation_model afmodel) {
        this.afmodel = afmodel;
    }

    public List<afilliation_model> getAfmodelLst() {
        return afmodelLst;
    }

    public void setAfmodelLst(List<afilliation_model> afmodelLst) {
        this.afmodelLst = afmodelLst;
    }
    
    
    public void addAfilliation() {
            this.afmodelLst.add(new afilliation_model(                      
                    this.afmodel.getName(),
                    this.afmodel.getLastname(),
                    this.afmodel.getId_type(),
                    this.afmodel.getId(),
                    this.afmodel.getBank(),
                    this.afmodel.getAccount_type(),
                    this.afmodel.getAccount_number()                    
            ));           
            
    }
   
    public void deleteEmployee(afilliation_model afmodel) {
        this.afmodelLst.remove(afmodel);
    }
    
}
