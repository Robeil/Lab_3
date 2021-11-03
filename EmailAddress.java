package CS203Course.Lab_3;

public class EmailAddress {

    private int type;
    private String emailAddress;

    public EmailAddress() {
        this.type = 0;
        this.emailAddress = "robeilaregawi1@gmail.com";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(int type, String emailAddress) {
        this.type = type;
        this.emailAddress = emailAddress;
    }

    public EmailAddress(int type, String emailAddress) {
        this.type = type;
        this.emailAddress = emailAddress;
    }

}
