package _04_class_and_object_in_java;

public class TestFan {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1.showInfo());
        fan2.setSpeed(MEDIUM);
        System.out.println(fan2.showInfo());
        Fan fan3 = new Fan();
        fan3.setSpeed(SLOW);
        System.out.println(fan3.showInfo());
    }
}
