public class Message<T> {


    private String from;
    private String to;
    private T content;

    /**
     * Method to getting the sender
     *
     * @return return the name of the sender
     */
    public String getFrom() {
        return from;
    }

    /**
     * Method  to getting of the recipient
     *
     * @return return the name of the recipient
     */
    public String getTo() {
        return to;
    }

    /**
     * Function to get the content
     *
     * @return return the  content of the messages\parcel
     */
    public T getContent() {
        return content;
    }


    /**
     * Constructs a message\parcel with content
     *
     * @param from    sender's name
     * @param to      recipient's name
     * @param content arbitrary filling
     */
    public Message(String from, String to, T content) {
        this.from = from;
        this.to = to;
        this.content = content;
    }
}