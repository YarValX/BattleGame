import units.*;
import java.util.ArrayList;
import java.util.Random;

public class Program {

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    static ArrayList<BasicHero> alliance = new ArrayList<>();
    static ArrayList<BasicHero> empire = new ArrayList<>();
    static ArrayList<BasicHero> unitedTeam = new ArrayList<>();

    public static void main(String[] args) {

        for (int count = 1; count < 11; count++) {
            int newCharacter = new Random().nextInt(0, 4);
            switch (newCharacter) {
                case 0 -> {
                    alliance.add(new Mage(getName(), 1, count));
                    empire.add(new Monk(getName(), 10, count));
                }
                case 1 -> {
                    alliance.add(new Spearman(getName(), 1, count));
                    empire.add(new Outlaw(getName(), 10, count));
                }
                case 2 -> {
                    alliance.add(new Sniper(getName(), 1, count));
                    empire.add(new Crossbowman(getName(), 10, count));
                }
                default -> {
                    alliance.add(new Peasant(getName(), 1, count));
                    empire.add(new Peasant(getName(), 10, count));
                }
            }
        }

        unitedTeam.addAll(alliance);
        unitedTeam.addAll(empire);
        unitedTeam.sort((o1, o2) -> o2.getInitiative() - o1.getInitiative());

        View.view();

        for (BasicHero item : unitedTeam) {
            if (alliance.contains(item)) {
                item.step(empire, alliance);
            } else {
                item.step(alliance, empire);
            }
        }

        View.view();
    }
}