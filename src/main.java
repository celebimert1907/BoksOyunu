public class main {
    public static void main(String[] args) {
        Fighter mert = new Fighter("Mert", 1000, 50, 113, 60.0);
        Fighter mehmet = new Fighter("Mehmet", 1250,70,100,25.0);
        Ring ring = new Ring (mert,mehmet,90, 115);
        ring.run();
    }
}
