package OOP.Encapsulation;

public class TestPlayer {
    public static void main(String[] args) {
        Player player = new Player();
        player.restoreHealth(20);
        int damage = 10;

        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());

        System.out.println(player.healthRemaining());
    }

}
