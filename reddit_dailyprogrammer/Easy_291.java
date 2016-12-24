//https://www.reddit.com/r/dailyprogrammer/comments/5bn0b7/20161107_challenge_291_easy_goldilocks_bear/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

public class Easy_291 {
    public static void main(String [] args) throws FileNotFoundException{
        String in = "";
        if(args.length == 0 || args.length > 2) {
            System.err.println("Enter in file name");
            System.exit(0);
        }
        else { 
            in = args[0];
        }

        File file = new File(in);

        Scanner sc = new Scanner(file); 

        try {
            int seat_number = 0;
            int weight = Integer.parseInt(sc.next());
            int max_temp = Integer.parseInt(sc.next());

            while(sc.hasNext() == true)
            {
                seat_number++;
                int chair = Integer.parseInt(sc.next());
                int soup = Integer.parseInt(sc.next()); 
                
                if(chair >= weight && soup <= max_temp) 
                    System.out.print(seat_number + " ");
            }
            System.out.print("\n");

        } catch(InputMismatchException e) {
            System.err.println("Invalid values in the file");
        }
    }
}
