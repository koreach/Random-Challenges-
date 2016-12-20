//https://www.reddit.com/r/dailyprogrammer/comments/5go843/20161205_challenge_294_easy_rack_management_1/
import java.util.Scanner;
import java.lang.String; 
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;

public class Easy_294{
    public static void main(String [] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input random sequence of words: ");
        String input = sc.nextLine();
        System.out.println("What do you want to do? 1 for Bonus 1/Regular, 2 for Bonus 2, 3 for Bonus 3");
        String option = sc.nextLine();
        
        if(option.equals("1")) {
            String want = sc.nextLine();
            if(scrabble(input, want)) {
                System.out.println("True");
            }  
            else 
                System.out.println("False");
        }

        //Optional Bonus 2
        if(option.equals("2")) {
            File enable1 = new File("enable1.txt");
            Scanner sc_1 = new Scanner(enable1); 
            
            String answer = "";
            int length = 0;

            while(sc_1.hasNextLine()) {
                String want = sc_1.nextLine(); 
                if(scrabble(input, want) && want.length() > length) {
                    answer = want;
                    length = want.length();
                }
            }

            System.out.println(answer);
            sc.close();       
        }
        sc.close();
    }

    //Optional Bonus 1 and regular problem
    public static boolean scrabble(String input, String want) {
        boolean result = true;
        char[] input_arr = input.toCharArray();
        char[] want_arr = want.toCharArray();
        for(int i=0; i < want_arr.length; i++) {
            boolean exists = false;

            for(int j=0; j < input_arr.length; j++){
                if(input_arr[j] == '?' || input_arr[j] == want_arr[i]) {
                    exists = true; 
                    input_arr[j] = '0';
                    break; 
                }
            }

            if(exists == false) {
                result = false; 
                break; 
            }
        }
        return result; 
    }

}
