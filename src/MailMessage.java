/**
 * Class emulated a mails massage
 */
public class MailMessage extends Message {

    private final String content;

    /**
     * Constructor - creating a new object with certain values
     *
     * @param content - content
     */
    public MailMessage(String from, String to, String content) {
        super(from, to);
        this.content = content;
    }

    /**
     * Method of obtaining content
     *
     * @return content
     */
    public String getContent() {
        return content;
    }
}