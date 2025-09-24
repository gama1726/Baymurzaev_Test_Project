
public class ConverterMoney {

    final double USD = 0.012;
    final double EUR = 0.010;
    final double BEL = 0.040;
    final double JAP = 1.77;
    final double CHN = 0.085;

    private double rubles = 0;

    public ConverterMoney(double rubles){
        this.rubles = rubles;
    }
    public void printConvert(){

        System.out.println(rubles + " рублей это " + (USD * rubles) + " долларов");
        System.out.println(rubles + " рублей это " + (EUR * rubles) + " евро");
        System.out.println(rubles + " рублей это " + (BEL * rubles) + " белорусских рублей");
        System.out.println(rubles + " рублей это " + (JAP * rubles) + " йен");
        System.out.println(rubles + " рублей это " + (CHN * rubles) + " юаней");


    }

}
