public class MailMessage extends Message<String> {

    /**
     * @param from    sender's name
     * @param to      recipient's name
     * @param content content
     */
    public MailMessage(String from, String to, String content) {
        super(from, to, content);
    }
}