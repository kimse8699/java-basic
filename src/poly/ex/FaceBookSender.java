package poly.ex;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String comment) {
        System.out.println("페이북에 발송합니다: " + comment);
    }
}
