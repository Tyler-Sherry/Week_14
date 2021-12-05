public class Name implements Comparable<Name> {
    private String firstName;
    private String lastName;

    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Name otherName) {
        int comparisonVal;

        comparisonVal = lastName.compareTo(otherName.lastName);
        if (comparisonVal != 0) {
            return -1 * comparisonVal;
        }
        else {
            return -1 * firstName.compareTo(otherName.firstName);
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
