package ex_030_Exception;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.amount = amount;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bank_name) {
        if (bank_name.currency.equals("INR")) {
            return bank_name.amount + this.amount;
        } else {
            try {
                throw new CurrencyMismatchCustomException("Currency Mismatch. Try with INR");
            } catch (CurrencyMismatchCustomException e) {
                System.out.println(e.getMessage());
            }
        }
        return 0;
    }
}