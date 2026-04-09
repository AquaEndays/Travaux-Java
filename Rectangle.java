public class Rectangle extends Trapeze{

    //pas d'attribut car la longueur est la grande base et la largeur est la hauteur
    //constructeur
    public Rectangle() {
        super();//supe fait appel au constructeur sans paramètre du parent (la classe Trapeze)
    }
    public Rectangle(double longueur, double largueur) {
        //appel du constructeur a 4 paramètre
        super(longueur, longueur,largueur,largueur);
    }
}
