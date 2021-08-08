
public class Movie{
    
    // Fill the code here
    private String movieName;
    private String movieCategory;
    private int ticketCost;
    public void setMovieName(String movieName)
    {
        this.movieName = movieName;
    }
    public String getMovieName()
    {
        return this.movieName;
    }
    public void setMovieCategory(String movieCategory)
    {
        this.movieCategory = movieCategory;
    }
    public String getMovieCategory()
    {
        return this.movieCategory;
    }
    public void setTicketCost(int ticketCost)
    {
        this.ticketCost = ticketCost;
    }
    public int getTicketCost()
    {
        return this.ticketCost;
    }
    public int calculateTicketCost(String circle)
    {
        String cat = getMovieCategory();
        if(circle.equalsIgnoreCase("GOLD") && cat.equalsIgnoreCase("2D"))
        {
            setTicketCost(300);
            return 0;
        }
        else if (circle.equalsIgnoreCase("GOLD") && cat.equalsIgnoreCase("3D"))
        {
            setTicketCost(500);
            return 0;
        }
        else if(circle.equalsIgnoreCase("SILVER") && cat.equalsIgnoreCase("2D"))
        {
            setTicketCost(250);
            return 0;
        }
        else if (circle.equalsIgnoreCase("SILVER") && cat.equalsIgnoreCase("3D"))
        {
            setTicketCost(450);
            return 0;
        }
        else if (circle.equalsIgnoreCase("SILVER") || circle.equalsIgnoreCase("GOLD"))
        {
            return -1;
        }
        else if (cat.equalsIgnoreCase("2D") || cat.equalsIgnoreCase("3D")) 
        {
            return -2;
        }
        return -3;
    }
}
