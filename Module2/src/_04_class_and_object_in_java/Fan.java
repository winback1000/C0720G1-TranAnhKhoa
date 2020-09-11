package _04_class_and_object_in_java;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String showInfo() {
        if (this.isOn()) {
            return "The fan is on \n speed: "+getSpeed()+"\n color: "+getColor()+"\n radius: "+getRadius();
        } else {
            return "The fan is off \n color: "+getColor()+"\n radius: "+getRadius();
        }

    }
}
