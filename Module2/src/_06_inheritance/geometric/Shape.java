package _06_inheritance.geometric;

public abstract class Shape implements Resizeable {
    public String color = "green";
    public boolean filled = true;
    public Shape () {
    }
    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString() {
        return "A shape with color "+getColor()+" and " +(filled? "filled" : "not filled");
    }

    @Override
    public void resize(double percent) {
    }
    public abstract double getArea();

}
