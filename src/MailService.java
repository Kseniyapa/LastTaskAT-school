import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Class emulated mails service. Issues and receives parcels/emails
 *
 * @param <T> - stores information about the contents (parcel / letter)
 */
public class MailService<T> implements Consumer {

    private MailBox<T> mailBox;

    public MailService() {
        this.mailBox = new MailBox<T>();
    }

    public Map<String, List<T>> getMailBox() {

        return mailBox;
    }

    /**
     * this method adds a parcel to the mailbox
     *
     * @param o- in this case is a shipment(parcel / letter)
     */
    @Override
    public void accept(Object o) {

        Message args = (Message) o;
        String recipient = args.getTo();
        T content = null;

        if (this.mailBox.containsKey(recipient)) {

            if (o.getClass().getName().contains(".Salary")) {
                this.mailBox.get(recipient).add((T) ((Salary) o).getSalary());
            } else {
                this.mailBox.get(recipient).add((T) ((MailMessage) o).getContent());
            }

        } else {
            List<T> newMailList = new ArrayList<T>();
            if (newMailList.add(content)) {
                this.mailBox.put(recipient, newMailList);
            } else {
                throw new RuntimeException();
            }
        }

    }

}