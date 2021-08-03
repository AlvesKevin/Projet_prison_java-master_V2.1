import java.util.Arrays;

public class DetenuPrenom {

    public static void main(String[] args){
        System.out.println("--- Dans la prison---");
        Arrays.stream(new Personne[]{
                new Personne("Kévin"),
                new Personne("Camille"),
                new Personne("Antoine"),
                new Personne("Alexandre"),
                new Personne("Lorenzo")
        }).forEach(System.out::println);
    }
}


