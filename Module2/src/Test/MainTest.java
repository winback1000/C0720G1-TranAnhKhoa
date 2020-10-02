package Test;

public class MainTest {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder();
        String name = "abcd";
        System.out.println(name.charAt(0));
        test.append(name.charAt(0)).append(name.charAt(1)).append(4);
        System.out.println(test);
    }
}
