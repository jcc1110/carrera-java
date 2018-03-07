package com.events;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class UserActionListener implements ActionListener {
    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {
        // Realizar la operación.
        System.out.println("Id: " + event.getComponent().getId());
    }
}