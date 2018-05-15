import processing.core.PApplet;

public class Ecker_TickTack extends PApplet {

    private int count = 1;
    private int rowCount = 1;
    final private int MAXCOUNT = 150;

    public static void main(String[] args) {
        PApplet.main("Ecker_TickTack");
    }

    public void settings() {
    }

    public void setup() {
        frameRate(2);
        System.out.println("Start");
    }

    public void draw() {
        if(count < MAXCOUNT) {
            if (count % 2 == 0) {
                System.out.println("Tack.");
            } else {
                System.out.println("Tick.");
            }

            count++;
            rowCount++;
        }

    }
}
