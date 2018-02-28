/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.navigation;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author instructor
 */
@Named(value = "navCon")
@RequestScoped
public class NavigationController {

    /**
     * Creates a new instance of NavigationController
     */
    public NavigationController() {
    }
    
    public String goPage2() {
        return "page_2";
    }
}