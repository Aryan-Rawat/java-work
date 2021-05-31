class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
    public void showMessage() {
        System.out.println(super.getMessage());
    }
}
public class action {
    public static void main(String[] args) {
        MyException exception = new MyException("My Custom Exception using extends Keyword");
        try {
            exception.showMessage();
            throw exception;
        } catch (MyException e) {
            System.out.println("My Custom Exception using extends Keyword is thrown");
        }
    }
}
