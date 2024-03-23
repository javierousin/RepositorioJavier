package academicos;

/**
 * La clase Javier representa a una persona llamada Javier con su lugar de residencia y profesión.
 * Extiende la clase Persona.
 * 
 * @author Javier
 * @version 1.0
 * @since 2024-03-23
 */
public class Javier extends Persona {

    /**
     * Constructor de la clase Javier.
     * 
     * @param lugarDeResidencia El primer lugar de residencia de Javier.
     * @param profesion La primera profesión de Javier.
     * @param lugarDeResidencia2 El nuevo lugar de residencia de Javier.
     * @param profesion2 La nueva profesión de Javier.
     */
    public Javier(String lugarDeResidencia, String profesion, String lugarDeResidencia2, String profesion2) {
        super(lugarDeResidencia, profesion);
        this.setLugarDeResidencia(lugarDeResidencia2);
        this.setProfesion(profesion2);
    }

    /**
     * Obtiene el segundo lugar de residencia de Javier.
     * 
     * @return El segundo lugar de residencia de Javier.
     */
    public String getSegundoLugarDeResidencia() {
        return this.getLugarDeResidencia();
    }

    /**
     * Establece el segundo lugar de residencia de Javier.
     * 
     * @param lugarDeResidencia2 El nuevo segundo lugar de residencia de Javier.
     */
    public void setSegundoLugarDeResidencia(String lugarDeResidencia2) {
        this.setLugarDeResidencia(lugarDeResidencia2);
    }

    /**
     * Obtiene la segunda profesión de Javier.
     * 
     * @return La segunda profesión de Javier.
     */
    public String getSegundaProfesion() {
        return this.getProfesion();
    }

    /**
     * Establece la segunda profesión de Javier.
     * 
     * @param profesion2 La nueva segunda profesión de Javier.
     */
    public void setSegundaProfesion(String profesion2) {
        this.setProfesion(profesion2);
    }
}
