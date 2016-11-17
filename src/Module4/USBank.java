package Module4;


/**
 * Created by Вадим on 15.11.2016.
 * USBank: limit of withdrawal = 1000 if currency is USD and 1200 if currency is EUR
 limit of funding - 10000 if EUR and no limit if USD
 monthly rate - 1% with USD and 2% with EUR
 commision - 5% if USD and up to 1000, 7% if USD and more than 1000
 6% if EUR and up to 1000 and 8% if EUR and more than 1000
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency == currency.USD) return 1000;
        if (currency == currency.EU) return 1200;
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == currency.EU) return 10000;
        else return 2147483647;

    }

    @Override
    int getMonthlyRate() {
        if (currency == currency.USD) return 1;
        if (currency == currency.EU) return 2;
        else return 0;

    }

    @Override
    int getCommission(int summ) {
        if (currency == currency.USD) {
            if (summ <= 1000) return 5;
            if (summ > 1000) return 7;
        }
        if (currency == currency.EU) {
            if (summ <= 1000) return 6;
            if (summ > 1000) return 8;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return numberOfEmployees * avrSalaryOfEmployee;
    }


    public String toString() {
        return "ID:" + this.id + " и страна:" +this.bankCountry;
    }
}
