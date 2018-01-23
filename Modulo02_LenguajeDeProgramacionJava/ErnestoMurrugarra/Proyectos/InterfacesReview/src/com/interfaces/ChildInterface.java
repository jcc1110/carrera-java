/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interfaces;

/**
 *
 * @author instructor
 */
public interface ChildInterface extends ParentInterface {
    // Métodos
    public void methodChildOne();
    public void methodChildTwo();
    public void methodChildThree();
    public void methodChildFour();
    public void methodChildFive();

    @Override
    public void methodOne();
}
