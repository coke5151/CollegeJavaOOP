package composition_vs_xxx;

public class Main {

    public static void main(String[] args) {
        Dog ruby = new Dog();
        Person junqi = new Person();
        ruby.info.SetBirthday("2005/01/01");
        junqi.info.SetBirthday("2004/09/26");

        System.out.println(ruby.info);
        System.out.println(junqi.info);
    }
}
