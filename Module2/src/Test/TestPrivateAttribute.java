package Test;

public class TestPrivateAttribute {
    private int num;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "TestPrivateAttribute{" +
                "num=" + this.getNum() +
                '}';
    }
}
