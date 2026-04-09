public class Trapeze {
    private double gbase;
    private double pbase;
    private double hauteur;
    private double hypotenuse;
    double aire;
    double perimetre;
    // constructeur par defaut
    public Trapeze(){
        gbase = 0;
        pbase = 0;
        hauteur =0;
        hypotenuse=0;
    }
    //constructeur avec parametre (initialisation)
    public Trapeze(double gbase, double pbase, double hauteur, double hypotenuse) {
        this.gbase = gbase;
        this.pbase = pbase;
        this.hauteur = hauteur;
        this.hypotenuse = hypotenuse;
    }

    // Methode d'affichage
    public void Affiche(){
        System.out.println("Caracteristiques du Trapeze : \n Grande base : "+gbase +"\n Petite base : "+pbase+" \n hauteur : "+hauteur+"\n hypothenuse : "+hypotenuse);
        System.out.println("l'aire de ce trapeze est de "+aire);
        System.out.println("le perimetre de ce trapeze est de "+perimetre);
    }

    //calcul du perimetre
    public void calculerPerimetre(){   
        perimetre = gbase + pbase + hauteur + hypotenuse;
    }
    //calcul de l'aire
    public void Surface(){
        aire = (gbase+pbase)*hauteur/2;
    }
}


