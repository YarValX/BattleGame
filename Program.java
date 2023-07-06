import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        BasicHero kung_lao = new Monk("Kung Lao");
        BasicHero shang_tsung = new Mage("Shang Tsung");
        BasicHero kano = new Outlaw("Kano");
        BasicHero jade = new Spearman("Jade");
        BasicHero erron_black = new Sniper("Erron Black");
        BasicHero fujin = new Crossbowman("Fujin");
        BasicHero alesha = new Peasant("Alesha");

//        System.out.println(kung_lao.getInfo());
//        System.out.println(shang_tsung.getInfo());
//        System.out.println(kano.getInfo());
//        System.out.println(jade.getInfo());
//        System.out.println(erron_black.getInfo());
//        System.out.println(fujin.getInfo());
//        System.out.println(alesha.getInfo());

        ArrayList<BasicHero> allHeroes  = new ArrayList<>();
        allHeroes.add(kung_lao); allHeroes.add(shang_tsung); allHeroes.add(kano); allHeroes.add(jade);
        allHeroes.add(erron_black); allHeroes.add(fujin); allHeroes.add(alesha);

        ArrayList<BasicHero> team1 = new ArrayList<>();
        ArrayList<BasicHero> team2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int j = new Random().nextInt(0, 7);
            switch (j){
                case 0: team1.add(new Mage("Quan Chi"));
                break;
                case 1: team1.add(new Monk("Liu Kang"));
                break;
                case 2: team1.add(new Outlaw("Kabal"));
                break;
                case 3: team1.add(new Spearman("Tanya"));
                break;
                case 4: team1.add(new Sniper("Cyrax"));
                break;
                case 5: team1.add(new Crossbowman("Nightwolf"));
                break;
                default: team1.add(new Peasant("Oruzhnik"));
            }
            team1.add(allHeroes.get(new Random().nextInt(0, allHeroes.size())));
            team2.add(allHeroes.get(new Random().nextInt(0, allHeroes.size())));
        }
        System.out.println("Команда1:");
        team1.forEach(i -> System.out.println(i.getInfo()));
        System.out.println("Команда2:");
        team2.forEach(i -> System.out.println(i.getInfo()));
    }
}
