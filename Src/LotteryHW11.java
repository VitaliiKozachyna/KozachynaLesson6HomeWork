import java.util.Arrays;
import java.util.Random;

public class LotteryHW11 {
    public static void main(String[] args) {
        int[] lottery = arrayInitSort(7);
        int[] player = arrayInitSort(7);
        System.out.println(Arrays.toString(lottery));
        System.out.println(Arrays.toString(player));
        int count = 0;
        for (int i = 0; i < lottery.length; i++) {
            if(player[i] == lottery[i]){
                count++;
            }
        }
        System.out.println("Кількість співпадінь = " + count);
    }

    public static int[] arrayInitSort(int num){
        Random random = new Random();
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9);
        }
        Arrays.sort(array);
        return array;
    }

}
