/**
 * General class for all massage
 */
public class Message {

    private final String from;
    private final String to;

    /**
     * Constructor - creating a new object with certain values
     *
     * @param from - from
     * @param to   - to
     */
    public Message(String from, String to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Method of receiving from whom the shipment is sent
     *
     * @return returns data from whom the shipment is sent
     */
    public String getFrom() {
        return from;
    }

    /**
     * Method of receiving to whom sending
     *
     * @return returns data from the sender
     */
    public String getTo() {
        return to;
    }

}