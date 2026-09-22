public class Question8 {

    //Animal class as requested by the question
    public static class Animal {

        //constuctor
        public Animal() {}

        //default speak function
        public void speak() {
            System.out.println("Hi, I am an Animal");
        }
    }

    //Cat as a subcalass of Animal
    public static class Cat extends Animal {

        //contructor
        public Cat() {}

        //overiden speak function
        public void speak() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Animal horse = new Animal();
        horse.speak(); // Output: Hi, I am an Animal

        Cat garfield = new Cat();
        garfield.speak(); // Output: Meow
    }
}