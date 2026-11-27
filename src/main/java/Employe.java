public class Employe extends Personne {

    private int numeroEmploye;
    private String dateEmbauche;

    public Employe(int id, String n, String a, String c,
                   int numero, String date) {

        super(id, n, a, c);
        numeroEmploye = numero;
        dateEmbauche = date;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String date) {
        dateEmbauche = date;
    }

    public String obtenirRole() {
        return "Employe";
    }
}