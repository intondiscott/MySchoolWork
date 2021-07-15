package PetApp;

public class Cat extends Pet {
    private int catSpaceNumber;

    Cat(){

    }

    public int getCatSpaceNumber(){
        return catSpaceNumber;
    }
    public void setCatSpaceNumber(int catSpaceNumber){
        this.catSpaceNumber = catSpaceNumber;
    }
}
