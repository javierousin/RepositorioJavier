package academicos;

/**
 * La clase Javier representa a una persona con su lugar de residencia y profesión.
 * Esta clase sirve como clase base para otras clases que representan personas específicas.
 *
 * @author Javier
 * @version 1.0
 * @since 2024-03-23
 */
public class Javier extends Persona {

    /**
     * Lugar de residencia de la persona.
     */
    private String lugarDeResidencia;

    /**
     * Profesión de la persona.
     */
    private String profesion;

    /**
     * Constructor de la clase Javier.
     *
     * @param lugarDeResidencia El lugar de residencia de la persona.
     * @param profesion La profesión de la persona.
     */
    public Javier(String lugarDeResidencia, String profesion) {
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

