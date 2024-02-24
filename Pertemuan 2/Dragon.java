public class Dragon {
    int x, y, width = 3, height = 5;

    public Dragon(int horizontal, int vertikal) {
        x = horizontal;
        y = vertikal;
    }

    void moveLeft() {
        x -= 1;
        if (x < 0) {
            detectCollision();
        }
    }

    void moveRight() {
        x += 1;
        if (x >= width) {
            detectCollision();
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0) {
            detectCollision();
        }
    }

    void moveDown() {
        y += 1;
        if (y >= height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi = (" + x + "," + y + ")");
    }

    void detectCollision() {
        System.out.println("GAME OVER");
        System.out.println("HIYAAA SKILL ISSUE");
    }

    public static void main(String[] args) {
        Dragon gerak = new Dragon(0, 0);
        gerak.printPosition();
        gerak.moveRight();
        gerak.moveRight();
        gerak.moveLeft();
        gerak.moveLeft();
        gerak.moveUp();
        gerak.moveUp();
        gerak.moveDown();
        gerak.moveDown();
        gerak.printPosition();
    }
}
