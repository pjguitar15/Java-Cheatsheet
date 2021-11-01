import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MoviesSnacks {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);        
        Queue movies = new LinkedList();
        Queue snacks = new LinkedList();

        // take movies input from user 3 times using for loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter movie " + (i + 1) + " of 3: ");
            movies.add(scan.nextLine());            
        }
        
        // take snacks input from user 3 times using for loop
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter snack " + (i + 1) + " of 3: ");
            snacks.add(scan.nextLine());            
        }
        
        // display result
        System.out.println(""); // new line
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println(""); // new line
        System.out.println("Press S each time you finish a snack.");
        
        
        // use while loop to prompt input from user over and over until snacks queue becomes empty
        while (snacks.size() > 0) {
            System.out.print("Press \"S\": ");
            String s = scan.nextLine();
            // allow both upper and lower case            
            if (s.toUpperCase().equals("S")) {
                snacks.remove();
                if (snacks.size() > 0) {                    
                System.out.println("Snacks left: " + snacks);
                }
            }
        }
        
        // if snack queue is empty, print this
        System.out.println("No more snacks");
    }
    
}