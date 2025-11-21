package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private String playID;
    private int audience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }

    /**
     * Gets the play ID for this performance.
     * @return the play ID
     */
    public String getPlayID() {
        return playID;
    }

    /**
     * Gets the audience size for this performance.
     * @return the audience size
     */
    public int getAudience() {
        return audience;
    }
}
