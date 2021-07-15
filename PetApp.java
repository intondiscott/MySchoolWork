package PetApp;

import java.util.Scanner;

public class PetApp extends Pet{
    public static void main(String[] args){
        Pet pet = new Pet();
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the pet a dog or cat? ");
        pet.setPetType(scan.next());
        System.out.println(pet.getPetType());
        if (pet.getPetType().equals("dog")){
            Dog dog = new Dog();
            System.out.println("What is your dog's name");
            dog.setPetName(scan.next());
            System.out.println(dog.getPetName());
            System.out.println("How old is " + dog.getPetName() + "?");
            dog.setPetAge(scan.nextInt());

        }
        else{
            Cat cat = new Cat();
            System.out.println("what is your cat's name?");
            cat.setPetName(scan.next());
            System.out.println(cat.getPetName());
            System.out.println("How old is " + cat.getPetName()+ "?");
            cat.setPetAge(scan.nextInt());
            System.out.println(cat.getPetAge());
        }
    }
}
