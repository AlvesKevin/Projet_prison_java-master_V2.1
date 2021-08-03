import java.time.LocalTime;
import java.util.Random;

public class heuresortie {

    public static void main(String[] args) {
    }
        public static int aleatoireTime(){
            Random fonctionAleatoire = new Random();
            int heureAleatoire = fonctionAleatoire.nextInt(24);// Renverra un entier aléatoire compris entre 0 et 23 inclu.
            int minutes = fonctionAleatoire.nextInt(60);// Renverra un entier aléatoire compris entre 0 et 59 inclu.
            int secondes = definitPrecision(fonctionAleatoire.nextInt(60));
            LocalTime test = LocalTime.of(heureAleatoire, minutes, secondes);
            System.out.println(test);
            return aleatoireTime();
    }

     public static int definitPrecision(int nextInt) {
        if (nextInt <=5) return 0;
        else {
            while (nextInt%5 != 0) nextInt++;
            if (nextInt == 60) nextInt = 59;
            return nextInt;
        }
    }
}
