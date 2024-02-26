import java.time.LocalDate;
import java.util.Comparator;

public class PersonSizeComperator implements Comparator<Person> {


    private String firstName;
    private String lastName;
    private int sizeInCm;

    private LocalDate dob;

    public PersonSizeComperator() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getSizeInCm(), o2.getSizeInCm());
    }
}
