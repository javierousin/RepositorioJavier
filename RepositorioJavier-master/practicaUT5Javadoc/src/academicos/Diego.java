import academicos.Persona;

/**
 * La clase Diego representa a una persona llamada Diego con su lugar de residencia y profesión.
 * Extiende la clase Persona.
 *
 * @author Tu nombre
 * @version 1.0
 * @since 2024-03-23
 */
public class Diego extends Persona {

    /**
     * Constructor de la clase Diego.
     *
     * @param lugarDeResidencia El primer lugar de residencia de Diego.
     * @param profesion La primera profesión de Diego.
     * @param lugarDeResidencia2 El nuevo lugar de residencia de Diego.
     * @param profesion2 La nueva profesión de Diego.
     */
    public Diego(String lugarDeResidencia, String profesion, String lugarDeResidencia2, String profesion2) {
        super(lugarDeResidencia, profesion);
        this.setLugarDeResidencia(lugarDeResidencia2);
        this.setProfesion(profesion2);
    }

    /**
     * Obtiene el segundo lugar de residencia de Diego.
     *
     * @return El segundo lugar de residencia de Diego.
     */
    public String getSegundoLugarDeResidencia() {
        return this.getLugarDeResidencia();
    }

    /**
     * Establece el segundo lugar de residencia de Diego.
     *
     * @param lugarDeResidencia2 El nuevo segundo lugar de residencia de Diego.
     */
    public void setSegundoLugarDeResidencia(String lugarDeResidencia2) {
        this.setLugarDeResidencia(lugarDeResidencia2);
    }

/**
 * Obtiene la segunda profesión de Diego.
