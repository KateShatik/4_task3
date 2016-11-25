

/**
 * Created by Катя on 25.11.2016.
 */
public class USBank extends Bank{






    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    int getCommission(int summ) {
        if (summ < 1000) {
            switch (getCurrency()) {
                case USD:
                    return 5;
                case EUR:
                    return 6;
                default:
                    return 0;
            }
        }
        if (summ > 1000) {
            switch (getCurrency()) {
                case USD:
                    return 7;
                case EUR:
                    return 8;
                default:
                    return 0;
            }
        }
  return 0;
    }

    @Override
    int getMonthlyRate() {
        switch (getCurrency()){
            case USD: return 1 ;
            case EUR: return 2;
            default: return 0;
        }
    }

    @Override
    int getLimitOfFunding() {
        switch (getCurrency()){
            case USD: return (int)(1.0/0.0) ;
            case EUR: return 10000;
            default: return 0;
        }
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()){
            case USD: return 1000;
            case EUR: return 1200;
            default: return 0;
        }

    }


}
