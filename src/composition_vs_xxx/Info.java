package composition_vs_xxx;

public class Info {
    private String birthday;

    public void SetBirthday(String s) {
        this.birthday = s;
    }

    public String GetBirthday() {
        return this.birthday;
    }

    public String toString() {
        return String.format("birthday is: %s", this.birthday);
    }
}
