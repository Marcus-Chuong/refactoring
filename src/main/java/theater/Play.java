package theater;

/**
 * Represents a theatrical play with a name and type.
 *
 * @author Theater Application
 */
public class Play {

    private String name;
    private String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of this play.
     *
     * @return the play name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of this play.
     *
     * @return the play type
     */
    public String getType() {
        return type;
    }
}
