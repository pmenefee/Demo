import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        int i =0;
        for(i=0; i<=10; i++){
            doWork();
        }
    }

    private static void doWork() {
        int r = random.nextInt(50);
        if (r % 2 == 0)
        {
            System.out.println(r + " even");
        } else {
            System.out.println(r + " odd");
        }
    }
}