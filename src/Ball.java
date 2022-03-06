import processing.core.PApplet;

public class Ball extends PApplet {
    int speed1 = 1;
    int speed2 = 1;
    int speed3 = 1;
    int  speed4 = 1;

    public static void main(String[] args) {
        PApplet.main(Ball.class.getCanonicalName());
    }

    public void settings() {
        size(800, 800);
    }

    public void setup() {
        fill(255, 255, 255);
    }

    public void draw() {
        ellipse(0 + speed1,800/5,20,20);
        ellipse(0 + speed2,800/5 * 2,20,20);
        ellipse(0 + speed3,800/5 * 3,20,20);
        ellipse(0 + speed4,800/5 * 4,20,20);
        speed1 += 1;
        speed2 += 2;
        speed3 += 3;
        speed4 += 4;
    }
}
