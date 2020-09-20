package _05_access_modifier;

class test {
    static int rollno = 0;
    String name;
    static String college = "BachKhoa";

    test(String n) {
        rollno++;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            String s = "test" +i;
            test name;
            name = new test(s);
            name.display();
        }
    }
}