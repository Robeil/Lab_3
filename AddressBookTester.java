package CS203Course.Lab_3;

public class AddressBookTester {

    public static void main(String[] args) {

        //creating arrays list by calling the default contact constructor
        Contact contacts = new Contact();
        AddressBook contactBook = new AddressBook();

        //creating contacts
        Contact personal1 = new Contact("Meron", "Tekle", "She is amazing");
        Contact business1 = new Contact("Space", "-X", "The best company ever");
        Contact personal2 = new Contact("Robeil", "Aregawi", "It is running fine");
        Contact business2 = new Contact("Meta Version", null, "The new name for facebook");

        //creating email
        EmailAddress businessEmail1 = new EmailAddress();
        EmailAddress businessEmail2 = new EmailAddress();
        EmailAddress personalEmail1 = new EmailAddress();
        EmailAddress personalEmail2 = new EmailAddress();

        PhoneNumber personalPhone1 = new PhoneNumber();
        PhoneNumber personalPhone2 = new PhoneNumber();
        PhoneNumber businessPhone1 = new PhoneNumber();
        PhoneNumber businessPhone2 = new PhoneNumber();

        //fixme modifiying
        Address personal = new Address(0, "1234 main street", "Nevada", "LA", 9876);
        Address personal0 = new Address(1, "international street", "Vegas", "LA", 9876);
        Address business = new Address(0, "7th avenue", "Los Angeles", "LA", 9876);
        Address business0 = new Address(1, "area 51", "Nevada", "LA", 9876);
        //setting email-address
        personalEmail1.setEmailAddress(0, "Silukeen1@gmail.com");
        personalEmail2.setEmailAddress(0, "robeilaregawi1@gmail.com");
        businessEmail1.setEmailAddress(0, "workspace1@gmail.com");
        businessEmail2.setEmailAddress(0, "spacework2@gmail.com");
        //setting phone-numbers
        personalPhone1.setNumber(2066025164);
        personalPhone2.setNumber(234789022);
        businessPhone1.setNumber(206234879);
        businessPhone2.setNumber(245890231);
        //adding number and email to the list
        personal1.getPhoneNumbers().add(personalPhone1);
        personal2.getPhoneNumbers().add(personalPhone2);
        business1.getPhoneNumbers().add(businessPhone1);
        business2.getPhoneNumbers().add(businessPhone2);
        //adding address to list
        personal1.getAddresses().add(personal);
        personal2.getAddresses().add(personal0);
        business1.getAddresses().add(business);
        business2.getAddresses().add(business0);
        //adding personal and business contact to the address Book
        contactBook.addBusinessContact(business1);
        contactBook.addBusinessContact(business2);
        contactBook.addPersonalContact(personal1);
        contactBook.addPersonalContact(personal2);

        System.out.println(contactBook.toString()); //fixme HERE to print all together

        // System.out.println(contactBook.getPersonalContacts());
        // System.out.println(Arrays.toString(contactBook.getPersonalContacts().toArray()));

        for (Contact p : contactBook.getBusinessContacts()) {
            System.out.println(p.toString()); //fixme => add toString()
        }

    }
}
