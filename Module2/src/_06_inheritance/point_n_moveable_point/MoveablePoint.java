package _06_inheritance.point_n_moveable_point;

public class MoveablePoint extends _06_inheritance.point2d_point3d.Point2D {
    public float xSpeed = 0;
    public float ySpeed = 0;
    public MoveablePoint() {}
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {xSpeed,ySpeed};
    }
    public float[] move() {
        this.x += this.xSpeed;
        this.y += this.ySpeed;
        return new float[] {this.x,this.y};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
