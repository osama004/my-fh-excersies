package at.technikum.simpleclasses.library;

public class Member {

    private int number;

    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
