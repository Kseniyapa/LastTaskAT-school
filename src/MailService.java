import java.util.*;
import java.util.function.Consumer;


/**
 * The mail service that is responsible for handling the parcel(storage/dispatch)
 *
 * @param <T> messages\parcel filling type
 */
public class MailService<T> implements Consumer<Message> {

    /**
     * Mailbox.Сontains all the departure (key-secondary)
     * <p>
     * Overridden the .get method to get empty message list for a unknown recipient
     */
    private Map<String, List<T>> mailBox = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

    /**
     * Add a messages\parcel to the service
     *
     * @param message messages\parcel
     */
    @Override
    public void accept(Message message) {

        if (!mailBox.containsKey(message.getTo()))
            mailBox.put(message.getTo(), new ArrayList<>());

        mailBox.get(message.getTo()).add((T) message.getContent());
    }

    /**
     * Method to get the mailbox
     *
     * @return return the mailbox
     */
    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}