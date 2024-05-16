package composition_vs_xxx;

class Person implements Date {

    public Info info = new Info();

    public void Eat() {
        System.out.println("Person Eating");
    }

    public void Drink() {
        System.out.println("Person Drinking");
    }
}
