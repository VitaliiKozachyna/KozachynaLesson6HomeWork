import java.util.Random;

public class HomeWork13 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1000000000)+11;
        int temp = num;
        int sum = 0;
        for (int i = 0; ; i++) {
            sum +=temp % 10;
            temp = temp/10;
            if (temp == 0) break;
        }

        System.out.println("Сума цифр, з яких складається " + num + ", дорівнює " + sum);
    }
}
