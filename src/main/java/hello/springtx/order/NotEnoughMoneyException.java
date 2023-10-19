package hello.springtx.order;

/**
 * 결제 잔고가 부족하면 발생하는 비즈니스 예외 -> 롤백X
 */
public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
