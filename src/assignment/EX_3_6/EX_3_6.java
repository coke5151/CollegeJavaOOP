package EX_3_6;

class Person {
    public int age;
    public double height;
    
    public Person(int age, double height) {
        this.age = age;
        this.height = height;
    }
    
    public Person() {
        this.age = 18;
        this.height = 175;
    }
    
    public void selfIntroduction() {
        System.out.println("Hi, I\'m " + this.age + " years old.");
        System.out.println("I\'m " + this.height + " cm height.");
    }
}

class EX_3_6 {
    public static void main(String args[]) {
        Person twoParameter = new Person(20, 180);
        Person noParameter = new Person();
        System.out.println("Create person with two parameter:");
        twoParameter.selfIntroduction();
        System.out.println("Create person with no parameter:");
        noParameter.selfIntroduction();
    }
}