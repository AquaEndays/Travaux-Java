public class Test {
    public static void main(String[] args) {
        // //creation d'objets
        // Trapeze t1 = new Trapeze();
        // Trapeze t2 = new Trapeze(16, 1, 7, 5);
        // t1.calculerPerimetre();
        // t1.calculerAire();
        // t1.Affiche();
        // t2.calculerPerimetre();
        // t2.calculerAire();
        // t2.Affiche();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4,5);
        System.out.println("Surface : ");
        r1.calculerPerimetre();
        r1.Surface();
        r1.Affiche();
        r2.calculerPerimetre();
        r2.Surface();
        r2.Affiche();
    }  
}





