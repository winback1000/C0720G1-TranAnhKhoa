package Test;

public class MainTest {
    public static void main(String[] args) {
        TestPrivateAtt test = new TestPrivateAtt();
        test.setNum(10);
        System.out.println(test.getNum());
        test.setNum(20);
        System.out.println(test);
    }
}
