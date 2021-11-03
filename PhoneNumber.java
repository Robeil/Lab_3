package CS203Course.Lab_3;

public class PhoneNumber {

    private int type;
    private int number;


    public PhoneNumber() {
        this.type = 0;
        this.number = 2066025164;
    }

    public PhoneNumber(int type, int number) {
        this.type = 0;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
