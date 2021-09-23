package Entity;

public class Person {

    private int id = 1;
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public Person() {
    }

    public Person( int age, String name) {
        this.id++;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Person person = new Person(1,"qwe");
        Person person1 = new Person(2,"qwe");
        Person person2 = new Person(3,"qwe");
        Person person3 = new Person(4,"qwe");
        Person person4 = new Person(5,"qwe");
    }
}
