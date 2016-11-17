package Module4;

/**
 * Created by Вадим on 17.11.2016.
 EUBank: лимит снятия = 2000, если валюта - USD и 2200, если EUR
 лимит пополнения - 20000, если EUR и 10000, если USD
 месячная ставка - 0% на USD и 1% на EUR
 комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 */
public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency==currency.USD) return 2000;
        if (currency==currency.EU) return 2200;
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == currency.EU) return 20000;
        if (currency==currency.USD) return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if (currency==currency.EU) return 1;
        else return 0;
    }

    @Override
    int getCommission(int summ) {
        if (currency==currency.USD){
            if (summ<=1000) return 5;
            if (summ>1000) return 7;
        }
        if (currency==currency.EU) {
            if (summ<=1000) return 2;
            if (summ>1000) return 4;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return numberOfEmployees*avrSalaryOfEmployee;
    }
    public String toString() {
        return "ID:" + this.id + " и страна:" +this.bankCountry;
    }
}
