/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author instructor
 */
public class NotValidNameException extends RuntimeException {
    // Constructor
    public NotValidNameException(String message) {
        super(message);
    }
}