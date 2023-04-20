package OOP.Composition.CompositionChallenge;

public class DishWasher {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("washing dishes.........");
            hasWorkToDo = false;
        }
    }



}
