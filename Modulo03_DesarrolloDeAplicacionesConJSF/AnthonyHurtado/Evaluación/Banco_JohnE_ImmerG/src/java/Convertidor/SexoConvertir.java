package Convertidor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("sexoconvertir")
public class SexoConvertir implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return value;
    }
   
    public String getAsString(FacesContext context, UIComponent component, String value) {
        String sexo = "";

        if (value != null) {
            sexo = (String) value;
            switch (sexo) {
                case "M":
                    sexo = "Masculino";
                    break;
                case "F":
                    sexo = "Femenino";
                    break;
            }
        }
        return sexo;
   
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}    

   