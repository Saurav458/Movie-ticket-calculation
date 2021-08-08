import java.util.*;
public class Main{
    public static Movie getMovieDetails()
    {
        Scanner sc = new Scanner(System.in);
        Movie obj = new Movie();
        System.out.println("Enter the movie name:");
        obj.setMovieName(sc.nextLine());
        System.out.println("Enter the movie category:");
        obj.setMovieCategory(sc.nextLine());
        
        return obj;
    }
    public static String getCircle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the circle:");
        return(sc.nextLine());
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie m = new Movie();
        m = getMovieDetails();
        String circle = getCircle();
        int type = m.calculateTicketCost(circle);
        System.out.println("Movie name = "+m.getMovieName());
        System.out.println("Movie category = "+m.getMovieCategory());
        if(type == 0)
        {
            System.out.println("The ticket cost is = "+m.getTicketCost());
        }
        else if (type == -1)
        {
            System.out.println("Sorry there is no "+m.getMovieCategory()+" type of category in theater.");
        }
        else if (type == -2)
        {
            System.out.println("Sorry!!! Circle is Invalid.");
        }
        else
        {
            System.out.println("Sorry!!! Both circle and category are Invalid.");
        }
    }
    // Fill the code here
    
}
