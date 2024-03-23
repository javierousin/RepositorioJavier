import academicos.Persona;

/**
 * La clase Javi representa a una persona llamada Javi con su lugar de residencia y profesión.
 * Extiende la clase Persona.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 2024-03-23
 */
public class Javi extends Persona {

    /**
     * Constructor de la clase Javi.
     *
     * @param lugarDeResidencia El primer lugar de residencia de Javi.
     * @param profesion La primera profesión de Javi.
     * @param lugarDeResidencia2 El nuevo lugar de residencia de Javi.
     * @param profesion2 La nueva profesión de Javi.
     */
    public Javi(String lugarDeResidencia, String profesion, String lugarDeResidencia2, String profesion2) {
        super(lugarDeResidencia, profesion);
        this.setLugarDeResidencia(lugarDeResidencia2);
        this.setProfesion(profesion2);
    }

    /**
     * Obtiene el segundo lugar de residencia de Javi.
     *
     * @return El segundo lugar de residencia de Javi.
     */
    public String getSegundoLugarDeResidencia() {
        return this.getLugarDeResidencia();
    }

    /**
     * Establece el segundo lugar de residencia de Javi.
     *
     * @param lugarDeResidencia2 El nuevo segundo lugar de residencia de Javi.
     */
    public void setSegundoLugarDeResidencia(String lugarDeResidencia2) {
        this.setLugarDeResidencia(lugarDeResidencia2);
    }

    /**
     * Obtiene la segunda profesión de Javi.
     *
     * @return La segunda profesión de Javi.
     */
    public String getSegundaProfesion() {
        return this.getProfesion();
    }

    /**
     * Establece la segunda profesión de Javi.
     *
     * @param profesion2 La nueva segunda profesión de Javi.
     */
    public void setSegundaProfesion(String profesion2) {
        this.setProfesion(profesion2);
    }
}
