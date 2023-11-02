import java.util.ArrayList;
import java.util.List;
public class Bank {
        private String name;
        private double exchangeRate;

        public Bank(String name, double exchangeRate) {
            this.name = name;
            this.exchangeRate = exchangeRate;
        }

        public String getName() {
            return name;
        }

        public double getExchangeRate() {
            return exchangeRate;
        }

        @Override
        public String toString() {
            return name + " - Курс: " + exchangeRate;
        }
    }

