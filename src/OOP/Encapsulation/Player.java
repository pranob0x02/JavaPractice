package OOP.Encapsulation;

public class Player {

    private String name;
    private int health;
    private String weapon;


    public void loseHealth(int damage){

        health = health - damage;
        if (health <= 0){
            System.out.println("Player knocked out of game......");
        }

    }

    public void restoreHealth(int extraHealth){
        health = health + extraHealth;
        if (health > 100){
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }

    public int healthRemaining(){
        return health;
    }




}
