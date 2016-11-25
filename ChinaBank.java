
/**
 * Created by Катя on 25.11.2016.
 */
public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    int getLimitOfWithdrawal() {
        switch (getCurrency()) {
            case USD:
                return 100;
            case EUR:
                return 150;
            default:
                return 0;
        }

    }

    @Override
    int getLimitOfFunding() {

        switch (getCurrency()) {
            case USD:
                return 10000;
            case EUR:
                return 5000;
            default:
                return 0;
        }
    }
        @Override
        int getCommission ( int summ){
            if (summ < 1000) {
                switch (getCurrency()) {
                    case USD:
                        return 3;
                    case EUR:
                        return 10;
                    default:
                        return 0;
                }
            }
            if (summ > 1000) {
                switch (getCurrency()) {
                    case USD:
                        return 5;
                    case EUR:
                        return 11;
                    default:
                        return 0;
                }
            }
            return 0;
        }

        @Override
        int getMonthlyRate () {
            switch (getCurrency()) {
                case USD:
                    return 1;
                case EUR:
                    return 0;
                default:
                    return 0;
            }
        }

}
