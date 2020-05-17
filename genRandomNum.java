import java.util.Random;

public class genRandomNum {
    public static void main(String[] args) {
        System.out.println("Generating Random Number:");
        Random rn=new Random();
        for(int i=1;i<5;i++){
            System.out.println(rn.nextInt(1000));
        }
    }
}