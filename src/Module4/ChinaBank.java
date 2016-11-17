package Module4;

/**
 * Created by Вадим on 17.11.2016.
 ChinaBank: лимит снятия = 100, если валюта - USD и 150, если EUR
 лимит пополнения - 5000, если EUR и 10000, если USD
 месячная ставка - 1% на USD и 0% на EUR
 комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        if (currency==currency.USD) return 100;
        if (currency==currency.EU) return 150;
        else return 0;
    }

    @Override
    int getLimitOfFunding() {
        if (currency == currency.EU) return 5000;
        if (currency==currency.USD) return 10000;
        else return 0;
    }

    @Override
    int getMonthlyRate() {
        if (currency==currency.USD) return 1;
        else return 0;
    }

    @Override
    int getCommission(int summ) {
        if (currency==currency.USD){
            if (summ<=1000) return 3;
            if (summ>1000) return 5;
        }
        if (currency==currency.EU) {
            if (summ<=1000) return 10;
            if (summ>1000) return 11;
        }
        return 0;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return  numberOfEmployees*avrSalaryOfEmployee;
    }

    public String toString() {
        return "ID:" + this.id + " и страна:" +this.bankCountry;
    }
}
