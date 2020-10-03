import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int step = (500 - 10)/9;
        for(int i = 0; i < 6; i++){
            do{
                num = 10;
                num =(int) (num + (Math.random()) * 1 * step);
            } while (num < 10 || num > 500);
            br.close();
            if(num >= 25 && num <= 200){
                System.out.println("the number " + num + " is in the range 25...200");
            } else {
                System.out.println("the number " + num + " is not in the range 25...200");
            }

        }

    }
}
