import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BirthMonth {
    public static void main(String[] args) {
        // Set or HashSet is the same
        // pwede ding ganito: HashSet<String> group1 = new HashSet<>();
        // tinry ko both, gumagana naman
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();         
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                System.out.print("Enter birth month " + (i + 1) + ": ");
                group1.add(sc.nextLine());
            } else {
                System.out.print("Enter birth month " + (i - 2) + ": ");
                group2.add(sc.nextLine());
            }
        }
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);

        System.out.print("Enter your birth month: ");
        self.add(sc.nextLine());

        // union       
        Set<String> union = new HashSet<>();
        union.addAll(group1);
        union.addAll(group2);

        // intersection
        Set<String> intersection = new HashSet<>();
        intersection.addAll(group1);
        intersection.retainAll(group2);

        // difference
        Set<String> difference = new HashSet<>();
        difference.addAll(group1);
        difference.removeAll(group2);        

        // display union, intersection, and difference
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);

        // checks if self has same birth month with group 1 and group 2
        group1.retainAll(self);
        group2.retainAll(self);

        if (group1.isEmpty() && group2.isEmpty()) {
            System.out.println("You do not have the same birth month with one of your classmates");
        } else {
            System.out.println("You have the same birth month with one of your classmates.");
        }        
        
    }
}