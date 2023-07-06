public class Program {
    public static void main(String[] args) {
        BasicHero KungLao = new Monk("Kung Lao");
        BasicHero ShangTsung = new Mage("Shang Tsung");
        BasicHero Kano = new Outlaw("Kano");
        BasicHero Jade = new Spearman("Jade");
        BasicHero ErronBlack = new Sniper("Erron Black");
        BasicHero Fujin = new Crossbowman("Fujin");
        BasicHero Alesha = new Peasant("Alesha");

        System.out.println(KungLao);
        System.out.println(ShangTsung);
        System.out.println(Kano);
        System.out.println(Jade);
        System.out.println(ErronBlack);
        System.out.println(Fujin);
        System.out.println(Alesha);
    }
}
