package ex_030_Exception;

public class CurrencyMismatchCustomException extends Exception{
    CurrencyMismatchCustomException(String msg){
        super(msg);
    }
}
