package academicos;

/**
 * La clase Persona representa a una persona con su lugar de residencia y profesión.
 * Esta clase sirve como clase base para otras clases que representan personas específicas.
 * 
 * @author Javier
 * @version 1.0
 * @since 2024-03-23
 */
public class Persona {

    /**
     * Lugar de residencia de la persona.
     */
    private String lugarDeResidencia;

    /**
     * Profesión de la persona.
     */
    private String profesion;

    /**
     * Constructor de la clase Persona.
     * 
     * @param lugarDeResidencia El lugar de residencia de la persona.
     * @param profesion La profesión de la persona.
     */
    public Persona(String lugarDeResidencia, String profesion) {
        this.lugarDeResidencia = lugarDeResidencia;
        this.profesion = profesion;
    }

    /**
     * Obtiene el lugar de residencia de la persona.
     * 
     * @return El lugar de residencia de la persona.
     */
    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }

    /**
     * Establece el lugar de residencia de la persona.
     * 
     * @param lugarDeResidencia El nuevo lugar de residencia de la persona.
     */
    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }

    /**
     * Obtiene la profesión de la persona.
     * 
     * @return La profesión de la persona.
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Establece la profesión de la persona.
     * 
     * @param profesion La nueva profesión de la persona.
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
}

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
     * 
     * @return La segunda profesión de Diego.
     */
    public String getSegundaProfesion() {
        return this.getProfesion();
    }

    /**
     * Establece la segunda profesión de Diego.
     * 
     * @param profesion2 La nueva segunda profesión de Diego.
     */
    public void setSegundaProfesion(String profesion2) {
        this.setProfesion(profesion2);
    }
}
