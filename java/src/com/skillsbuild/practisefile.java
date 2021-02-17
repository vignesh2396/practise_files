
// class and inheritance
class Animal {
    public final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void Saysomething() {
        System.out.println("i am " + name);
    }
}
class Dog extends Animal {
    public Dog(String name) {
super(name);    }

    public void Saysomething() {
        System.out.println("i am " + name);

        System.out.println("i can bark");
    }
}
public class practisefile {
    public static void main(String[] args){

        /*// to split a string value
        String str = "this is a string";
        for (String a : str.split(" "))
            System.out.println(a); */

   //class and inheritance
   Dog dog = new Dog("johnny");
   dog.Saysomething();

    }
}
