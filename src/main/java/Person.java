import java.time.LocalDate;
import java.util.Locale;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int sizeInCm;

    private LocalDate dob;

    public Person(String firstName, String lastName, int sizeInCm, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sizeInCm = sizeInCm;
        this.dob = dob;
    }

    public Person() {
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
    public int compareTo(Person o) {
        int lastname = this.getLastName().compareTo(o.getLastName());

        if (lastname != 0) {
            return lastname;
        }
        return this.getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return String.format("%s %s hat am %s Geburtstag und ist %d cm groß", getFirstName(), getLastName(), getDob(), getSizeInCm());
    }
}
