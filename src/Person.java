public class Person {


    private String name;




    //TODO: return the person's name
    public String getName() {
        return this.name;
    }


    //TODO: change the name field to the passed value
    public void setName(String name) {

        this.name = name;
    }


    //TODO: print a message to the console using the person's name
    public void sayHello() {

        System.out.println("Hello " + name);
    }




    public Person(String name) {
    this.name = name;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ted");


        System.out.println(p1.getName());

        p1.setName("Joe");
        System.out.println("Updated name is: " + p1.getName());

        p1.sayHello();

    }
}