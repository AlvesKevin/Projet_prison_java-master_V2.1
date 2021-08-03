import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class RandomNbr{
    public static void main(String[] args) {
        Random obj = new Random();
        for (int i = 0; i < 10; i++){
            int nbr = obj.nextInt(1);
            System.out.println("Nombre aléatoire : " + nbr);
        }
    }
}




   // List myArrayList = new ArrayList();
       // myArrayList.add("Kévin" , Age);
         //       myArrayList.add("Max");

           //     List myArrayList2 = new ArrayList();
             //   myArrayList2.add(Age);
               // myArrayList2.add(random.nextInt(max - min) + min);
                //System.out.println("Prenom" + myArrayList + "Age" + myArrayList2);