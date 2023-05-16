package OOP.Encapsulation;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player("Tim", 200, "knife");

        System.out.println("Initial health is " + player.healthRemaining());

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());

        player.restoreHealth(20);
        System.out.println("Player health = " + player.healthRemaining());

    }

}
