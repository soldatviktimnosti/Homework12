public class Main {
    final static int theCostOfWhiskey = 800;
    final static int theCostOfbeer = 150;
    final static int myMoney = 500;
    public static void main(String[] args) {
        alcoholIHave("I");
    }
    public static void alcoholIHave(String Me) {
        if(myMoney>theCostOfbeer) {
            if (myMoney > theCostOfWhiskey) {
                println(Me + " buy beer and whiskey");
            }
                println(Me + " buy beer");
            }
        else {
            println(Me + " 'm leaving the bar");
        }
    }
    public static void println(String text) {
        System.out.println(text);
    }
}