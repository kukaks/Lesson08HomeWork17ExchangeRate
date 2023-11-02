import java.util.Arrays;
import java.util.Random;

public class ExchangeRate {
    public static void main (String[] args){
        Random random = new Random();
        String[] bankNames = { "ПриватБанк", "Ощадбанк", "Укрексімбанк", "Сенс Банк", "Сітібанк", "Райффайзен Банк",
                "УКРСИББАНК", "ПУМБ", "КРЕДІ АГРІКОЛЬ БАНК", "КРЕДОБАНК", "ТАСКОМБАНК", "БТА Банк", "ОТП БАНК", "ЮНЕКС БАНК"
        };
//        int[] nameBank = new int[14];
        double[] exchangeRate = new double[14];
        double[] checkGoodExchange = new double[14];
        for (int i = 0; i < exchangeRate.length; i++) {
            exchangeRate[i] = (random.nextInt(500)+3500) / 100.0;
            //exchangeRate[i] = random.nextInt(5);
            checkGoodExchange[i] = exchangeRate[i];
                    }
        Arrays.sort(checkGoodExchange);
        for (int i = 0; i < exchangeRate.length; i++) {
          //  System.out.println(checkMaxExchange[i]);
          //  System.out.println();
            if (exchangeRate[i] == checkGoodExchange[checkGoodExchange.length - 1]) {
                System.out.println("Банк з найкращим курсом обміну доларів на гривні: " + bankNames[i] + ": " + exchangeRate[i]);
            }
        }
//        for (int i = 0; i<exchangeRate.length; i++){
//            if (exchangeRate[i] == checkMaxExchange[checkMaxExchange.length-1]) {
//                System.out.println("Банк з найкращим курсом обміну доларів на гривні: " + bankNames[i] + ": " + exchangeRate[i]);
//            }
//        }
    }
}
