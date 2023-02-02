import java.util.ArrayList;

public class Essai {
    public static void main(String[] args) {
        Carte c1=new Carte(11,"carreau");
        Carte c2=new Carte(5,"tréfflé");

        String as="as";
        ArrayList<Carte> cartes=new ArrayList<Carte>();
        cartes = FabriqueDeJeuxDe32Cartes.créerJeu32DansOrdre();
        for(int i=0;i<cartes.size();i++){
            System.out.print( cartes.get(i)+", ");
        }
        System.out.println();
        System.out.println("--------------------------");
        cartes=FabriqueDeJeuxDe32Cartes.créerJeu32Battu();
        for(int i=0;i<cartes.size();i++){
            System.out.print( cartes.get(i)+", ");
        }
        System.out.println();
        c1=cartes.get(0);
        c2=cartes.get(1);

        if (c1.getValeur()== c2.getValeur()){
            System.out.println("les deux cartes sont égales : "+ c1 + " = "+ c2 );

        } else if (c1.supérieureA(c2)) {
            System.out.println("la carte "+ c1 + "est grande que  " +c2 );
        }
        else {
            System.out.println("la carte "+ c1 + "est petite que "+ c2);
        }

        Joueur joueur = new Joueur("Haneri");
        System.out.println(joueur.getNom());
        System.out.println(joueur.toString());
        // ramasser des cartes
        joueur.ramasserUneCarte(c1);
        joueur.ramasserUneCarte(c2);
        System.out.println(joueur.toString());
        //poser une carte
        joueur.poserUneCarte();
        System.out.println(joueur.toString());
        if (joueur.resteCarte()){
            System.out.println("le joueur a au moin une carte ");
        }
        else {
            System.out.println("le joueur n'a aucune carte");
        }
       joueur.poserUneCarte();
        if (joueur.resteCarte()){
            System.out.println("le joueur a au moin une carte ");
        }
        else {
            System.out.println("le joueur n'a aucune carte");
        }

        ArrayList<Carte>paquet1=new ArrayList<>();
        ArrayList<Carte>paquet2=new ArrayList<>();

        FabriqueDeJeuxDe32Cartes.créerEtDistribuerJeu32(paquet1,paquet2);
        Joueur joueur1=new Joueur("Tome",paquet1);
        Joueur joueur2=new Joueur("Sabar",paquet2);
        System.out.println(joueur1.toString());
        System.out.println(joueur2.toString());

        //5
        System.out.println(" comparer les deux carte "+c1.compareTo(c2));

    }

}
