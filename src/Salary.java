/**
 * Class emulated processes with salary
 */
public class Salary extends Message {

    private final Integer salary;

    /**
     * Constructor - creating a new object with certain values
     *
     * @param salary - salary
     */
    public Salary(String from, String to, Integer salary) {
        super(from, to);
        this.salary = salary;
    }

    /**
     * Method of getting a salary
     *
     * @return salary
     */
    public Integer getSalary() {
        return salary;
    }
}