package OOP.Composition.CompositionChallenge;

public class CoffeeMaker {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("brewing coffee......!");
            hasWorkToDo = false;
        }

    }
}
