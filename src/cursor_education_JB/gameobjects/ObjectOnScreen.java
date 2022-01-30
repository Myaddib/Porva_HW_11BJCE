package cursor_education_JB.gameobjects;

public abstract class ObjectOnScreen {
    public char printableCharacter;
    public int x, y;

    public ObjectOnScreen(int x, int y, char printableCharacter) {
        this.x = x;
        this.y = y;
        this.printableCharacter = printableCharacter;
    }

    public boolean intersectsWith(ObjectOnScreen other) {
        return this.x == other.x && this.y == other.y;
    }

    public boolean intersectsWith(int x, int y) {
        return this.x == x && this.y == y;
    }
}
