public class Dragon {
    int x, y, width = 3, height = 5;

    public Dragon() {
        
    }

    public Dragon(int horizontal, int vertical) {
        x = horizontal;
        y = vertical;
    }

    void moveLeft() {
        x -= 1;
        if (x < 0) {
            x = 0;
            detectCollision();
        }
    }

    void moveRight() {
        x += 1;
        if (x >= width) {
            x = width - 1;
            detectCollision();
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0) {
            y = 0;
            detectCollision();
        }
    }

    void moveDown() {
        y += 1;
        if (y >= height) {
            y = height - 1;
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi = (" + x + "," + y + ")");
    }

    void detectCollision() {
        System.out.println("GAME OVER");
    }
}
