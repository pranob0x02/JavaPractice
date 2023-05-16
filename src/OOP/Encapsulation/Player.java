package OOP.Encapsulation;

public class Player {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public Player(String name) {
        this(name, 100, "sword");
    }

    public Player(String name, int healthPercentage, String weapon) {
        this.fullName = name;
        this.weapon = weapon;

        if (healthPercentage <= 0){
            this.healthPercentage = 1;
        }
        else if (healthPercentage > 100){
            this.healthPercentage = 100;
        }
        else {
            this.healthPercentage = healthPercentage;
        }
    }

    public void loseHealth(int damage){

        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0){
            System.out.println("Player knocked out of game......");
        }

    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }




}
