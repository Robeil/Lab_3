package CS203Course.Lab_3;

import java.util.ArrayList;

public class Contact {

    private String firstName;
    private String lastName;
    private ArrayList<PhoneNumber> phoneNumbers;
    private ArrayList<EmailAddress> emailAddresses;
    private ArrayList<Address> addresses;
    private String notes;

    public Contact() {
        this.firstName = "unknown firstname";
        this.lastName = "nunkown lastname";
        this.emailAddresses = new ArrayList<EmailAddress>();
        this.phoneNumbers = new ArrayList<PhoneNumber>();
        this.addresses = new ArrayList<Address>();
        this.notes = "no notes for now";
    }

    public Contact(String firstName, String lastName, String notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = new ArrayList<PhoneNumber>();
        this.emailAddresses = new ArrayList<EmailAddress>();
        this.addresses = new ArrayList<Address>();
        this.notes = notes;
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

            public ArrayList<PhoneNumber> getPhoneNumbers() {
                return phoneNumbers;
            }

            public void setPhoneNumbers(ArrayList<PhoneNumber> phoneNumbers) {
                this.phoneNumbers = phoneNumbers;
            }

            public ArrayList<EmailAddress> getEmailAddresses() {
                return emailAddresses;
            }

            public void setEmailAddresses(ArrayList<EmailAddress> emailAddresses) {
                this.emailAddresses = emailAddresses;
            }

            public ArrayList<Address> getAddresses() {
                return addresses;
            }

            public void setAddresses(ArrayList<Address> addresses) {
                this.addresses = addresses;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

    @Override
    public String toString() {
        return
                "FirstName: '" + firstName + '\'' +
                ", LastName: '" + lastName + '\'' +
                ",\nPhoneNumbers: " + this.phoneNumbers +
                ",\nEmailAddresses: " + this.emailAddresses +
                ",\nAddresses: " + this.addresses +
                ",\nNotes: '" + notes + '\''
                ;
    }
}
