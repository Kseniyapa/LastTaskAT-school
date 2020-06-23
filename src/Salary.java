public class Salary extends Message<Integer> {

    /**
     * @param from    sender's name
     * @param to      recipient's name
     * @param content salary
     */
    public Salary(String from, String to, int content) {
        super(from, to, content);
    }
}