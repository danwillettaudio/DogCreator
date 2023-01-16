import java.util.Scanner;
public class NewDog {

    public static void main(String[] args) {
        String dogName;
        String dogBreed;
        String dogColour;
        int dogLegs;
        int dogSize;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your dog's name:");

        dogName = sc.nextLine();
        while (dogName == "") {
            System.out.println("Come on, don't be shy - what's your dog's name?");
            dogName = sc.nextLine();
        }
        System.out.println("What breed is " + dogName + "?");

        dogBreed = sc.nextLine();
        while (dogBreed == "") {
            System.out.println("Dude, come on. What breed is " + dogName + "?");
            dogBreed = sc.nextLine();
        }
        System.out.println("And what colour is " + dogName + "?");

        dogColour = sc.nextLine();
        while (dogColour == "") {
            System.out.println("Aren't you tired of this? I know I am. Seriously, what colour is " + dogName + "?");
            dogColour = sc.nextLine();
        }
        System.out.println("Wow, a " + dogColour + " dog? Nice! How many legs does " + dogName + " have?");

        dogLegs = sc.nextInt();
        while (dogLegs < 0 || dogLegs > 4) {
            System.out.println("Well that's just silly. You're silly. How many legs does " + dogName + " have?");
            dogLegs = sc.nextInt();
        }
        System.out.println("Finally, on a scale of 1 - 100, how big is " + dogName + "? Be honest.");

        dogSize = sc.nextInt();
        while (dogSize < 1 || dogSize > 100) {
            System.out.println("I thought I told you to be honest. On a scale of 1 - 100, how big is " + dogName + "?");
            dogSize = sc.nextInt();
        }

        Dog Dog = new Dog(dogName, dogBreed, dogColour, dogLegs, dogSize);

            System.out.println("Your dog's name is " + Dog.getName());
            System.out.println("They are a " + Dog.getColour() + " " + Dog.getBreed() + ", with " + Dog.getLegs() + " legs.");
            System.out.println(Dog.Bark());
        
    }
}