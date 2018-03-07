package com.beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.ValueChangeEvent;

@Named(value = "ub")
@ApplicationScoped
public class UserBean implements Serializable {
    // Atributos
    private static final long serialVersionUID = 1L;
    private String SelectedCountry = "Venezuela";
    private List<String> Countries;
    
    // Métodos
    public UserBean() {
        this.Countries = new ArrayList<>();
        this.Countries.add("Venezuela");
        this.Countries.add("Chile");
        this.Countries.add("Argentina");
        this.Countries.add("Colombia");
    }
    
    public void countryChange(ValueChangeEvent e) {
        this.setSelectedCountry(e.getNewValue().toString());
        // Lógica extra
    }
    
    public String getSelectedCountry() {
        return this.SelectedCountry;
    }

    public void setSelectedCountry(String selectedCountry) {
        this.SelectedCountry = selectedCountry;
    }

    public List<String> getCountries() {
        return this.Countries;
    }

    public void setCountries(List<String> countries) {
        this.Countries = countries;
    }
}