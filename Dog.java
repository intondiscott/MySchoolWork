package PetApp;

public class Dog extends Pet {
    private int dogSpaceNumber;
    private int dogWeight;
    private boolean grooming;

    Dog(){
    }

    public int getDogSpaceNumber(){
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber){
        this.dogSpaceNumber = dogSpaceNumber;
    }

    public int getDogWeight(){
        return dogWeight;
    }

    public void setDogWeight(int dogWeight){
        this.dogWeight = dogWeight;
    }

    public boolean getGrooming(){
        return grooming;
    }

    public void setGrooming(boolean grooming){
        this.grooming = grooming;
    }
}
