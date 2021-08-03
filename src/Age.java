import java.util.Random;

public class Age {
    public static void main (String[] args){
        int min = 20;
        int max = 90;
        Random random = new Random();
        int valeur = random.nextInt(max - min ) + min;
        System.out.println(valeur);

    }
}



