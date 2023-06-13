package OOP.BillsBurgerChallenge;

public class TestMain {

    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
////        coke.setSize("SMALL");
////        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.50);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BACON", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("CHEESE", "AVOCADO", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();


//        MealOrder secondMeal = new MealOrder("Turkey", "7-up", "chili");
//        secondMeal.addBurgerToppings("CHEESE", "BACON", "MAYO");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("Deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "CHEESE", "BACON", "SALAMI", "LETTUCE");
        deluxeMeal.printItemizedList();

    }

}
