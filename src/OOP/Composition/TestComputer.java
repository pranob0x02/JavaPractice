package OOP.Composition;

public class TestComputer {

    public static void main(String[] args) {


        ComputerCase theCase = new ComputerCase("2008", "Dell", "240");

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2500 x 1440");

        MotherBoard theMotherBoard = new MotherBoard("Bj-200", "Asus", 4, 6, "v2.44");


        PersonalComputer thePc = new PersonalComputer("2008", "Dell", theCase, theMonitor, theMotherBoard);

        thePc.powerUp();




    }

}
