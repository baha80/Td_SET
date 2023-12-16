public class Enseignant {
    private int id ; 
    private String nom , prenom ;

    //2 constructeurs dont un sans paramètre
    public Enseignant() {
    }

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    //getters et setters

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    //méthode toString
    @Override
    public String toString() {
        return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Enseignant)) {
            return false;
        }
        Enseignant enseignant = (Enseignant) o;
        return id == enseignant.id;
    }
    


    
}
