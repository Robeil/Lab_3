package CS203Course.Lab_3;

import java.util.ArrayList;

public class AddressBook extends Contact {

    private  ArrayList<Contact> personalContacts;
    private  ArrayList<Contact> businessContacts;


    public AddressBook() {
        this.personalContacts = new ArrayList<Contact>();
        this.businessContacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getPersonalContacts() {
        return personalContacts;
    }

    public void setPersonalContacts(ArrayList<Contact> personalContacts) {
        this.personalContacts = personalContacts;
    }

    public ArrayList<Contact> getBusinessContacts() {
        return businessContacts;
    }

    public void setBusinessContacts(ArrayList<Contact> businessContacts) {
        this.businessContacts = businessContacts;
    }

    //adding personal contact
    public void addPersonalContact(Contact personal) {
        this.personalContacts.add(personal);
    }

    //adding business contact
    public void addBusinessContact(Contact business) {
        this.businessContacts.add(business);
    }

    //removing existing personal contact
    public void deletePersonalContact(Contact personal) {
        if (this.personalContacts.contains(personal)) {
            this.personalContacts.remove(personal);
        }
        //personalContacts.remove(personal);
    }

    //removing existing business contact
    public void deleteBusinessContact(Contact business) {
        if (this.businessContacts.contains(business)) {
            this.businessContacts.remove(business);
        }
    }

   @Override
    public String toString() {
        return "AddressBook{\nBusiness Contact " +this.getBusinessContacts()
                + "\nPersonal Contact "+ getPersonalContacts()+"}";
    }
}
