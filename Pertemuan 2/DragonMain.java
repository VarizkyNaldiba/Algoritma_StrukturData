public class DragonMain {
    
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
