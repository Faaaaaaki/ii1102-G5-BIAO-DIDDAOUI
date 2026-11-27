public class Personne {

    private int identifiant;
    private String nom;
    private String adresse;
    private String contact;

    public Personne(int id, String n, String a, String c) {
        identifiant = id;
        nom = n;
        adresse = a;
        contact = c;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setNom(String n) {
        nom = n;
    }

    public void setAdresse(String a) {
        adresse = a;
    }

    public void setContact(String c) {
        contact = c;
    }

    public void obtenirInfos() {
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Contact : " + contact);
    }
}