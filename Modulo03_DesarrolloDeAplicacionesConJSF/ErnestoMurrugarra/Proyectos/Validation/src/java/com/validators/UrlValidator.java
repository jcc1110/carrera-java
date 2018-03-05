/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.validators;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author instructor
 */
@FacesValidator("com.validator.UrlValidator")
public class UrlValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        // Variables
        String url = value.toString();
        
        // Algoritmo
        try {
            if(url.matches("^\\d+$")) {
                FacesMessage msg = new FacesMessage("Error", "La URL no debe contener números.");
                msg.setSeverity(FacesMessage.SEVERITY_ERROR);

                throw new ValidatorException(msg);
            }
            
            // Generar una URI
            new URI(url.toString());
        
        } catch (URISyntaxException ex) {
            //Logger.getLogger(UrlValidator.class.getName()).log(Level.SEVERE, null, ex);
            FacesMessage msg = new FacesMessage("Error", "Formato inválido, verifique.");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);

            throw new ValidatorException(msg);
        }
        
    }
    
}