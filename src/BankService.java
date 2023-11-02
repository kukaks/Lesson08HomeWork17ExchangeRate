import java.util.Arrays;
import java.util.Random;

public class BankService {
    Random random = new Random();
    public void Kyrs (){
        Bank bank = new Bank();
        for (int i = 0; i < bank.exchangeRate.length; i++) {
            bank.exchangeRate[i] = (random.nextInt(500)+3500) / 100.0;
            bank.checkGoodExchange[i] = bank.exchangeRate[i];
        }
        Arrays.sort(bank.checkGoodExchange);

        for (int i = 0; i < bank.exchangeRate.length; i++) {
            if (bank.exchangeRate[i] == bank.checkGoodExchange[bank.checkGoodExchange.length - 1]) {
                System.out.println("Банк з найкращим курсом обміну доларів на гривні: " + bank.bankNames[i] + ": " + bank.exchangeRate[i]);
            }
        }
    }
}
