public class Personne {
    private final String nom;
    private final int age;
    private final int sortie;

    public Personne(String nom) {
        this(nom, MathUtils.randomNumber(), heuresortie.aleatoireTime());
    }

    public Personne(String nom, int age, int sortie) {
        this.nom = nom;
        this.age = age;
        this.sortie = sortie;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public int getSortie() { return sortie;}

    @Override
    public String toString() {
        return " Nom: " + nom + ", Age; " + age + ", Heure de sortie " + sortie;
    }
}
