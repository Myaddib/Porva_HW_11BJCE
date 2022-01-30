package cursor_education_JB;

import cursor_education_JB.gameobjects.ObjectOnScreen;

public class GameScreen {
    int screenSize = 15;
    char emptyCell = 176;
    char[][] screen = new char[screenSize][screenSize];
    private ObjectOnScreen o;

    void fillScreenWithBlankCells() {
        for (int i = 0; i < screenSize; i++) {
            for (int j = 0; j < screenSize; j++) {
                screen[i][j] = emptyCell;
            }
        }
    }

    void printScreen() {
        for (int i = 0; i < screenSize; i++) {
            for (int j = 0; j < screenSize; j++) {
                System.out.print(screen[j][i]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public void setObjectOnScreen(ObjectOnScreen o) {
        screen[o.x][o.y] = o.printableCharacter;
    }

}

