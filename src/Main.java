import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String [] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();


        for (int i = 0; i < 50; i++) {
            int randomsan = random.nextInt(1,100);
            arr.add(randomsan);
            if (randomsan%2==0){
                arr1.add(randomsan);
            }else {
                arr2.add(randomsan);
            }

        }
        System.out.println("Все значение:"+arr);
        System.out.println("Четные число:"+arr1);
        System.out.println("Не четные число:"+arr2);
    }

}