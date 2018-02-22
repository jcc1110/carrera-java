package main;
import java.net.URI;
import java.net.URISyntaxException;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("main.UrlValidator")
public class UrlValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        // Variables necesarias
        String urlValue = value.toString();
        
        try {
            // Valido que la cadena no tengo números
            if (urlValue.matches("^\\d+$")) {
                // Muestro un mensaje de error personalizado
                FacesMessage msg = new FacesMessage("Error", "La URL no solo puede tener números");
                msg.setSeverity(FacesMessage.SEVERITY_ERROR);
                
                // Genero una Exception
                throw new ValidatorException(msg);
            }
            
            // Añado el HTTP
            if (!urlValue.startsWith("http://", 0)) {
                urlValue = "http://" + urlValue;
            }
            
            // Genero una URI
            new URI(urlValue.toString());
            
        } catch (URISyntaxException e) {
            FacesMessage msg = new FacesMessage("Error", "Formato inválido #2");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(msg);
        }
    }    
}
