package cursor_education_JB.gameobjects;


public class Snake extends ObjectOnScreen {
    int currentLength;
    float speed;

    public Snake(int x, int y) {
        super(x, y, 'S');
    }

    public void collideWith(ObjectOnScreen collision) {
        if (collision instanceof Wall) {

            System.out.println("Game over!");
            System.exit(0);
        } else if (collision instanceof Food) {
            System.out.println("Level Up!");
        } else {
            System.out.printf("Error");
            System.exit(0);
        }
    }
}