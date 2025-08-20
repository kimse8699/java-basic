package poly.ex.pay0;

public class PayService extends PayStore{

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        Pay pay = findPay(option);
        boolean result = pay.pay(amount);

        if (result) {
            System.out.println("결재를 성공했습니다.");
        } else {
            System.out.println("결재를 실패했습니다.");
        }
    }
}
