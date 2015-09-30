public class CalendarPrinter
{
    public static void main (String[] args) {
    int x = 1;
    String y = "September ";
    while (x <= 30)
    {
        if (x % 7 == 5 || x % 7 == 6)
        { 
          System.out.println (y + x + " - WEEKEND");
        }
        else if (x == 7)
        {
            System.out.println (y + x + " - NO SCHOOL (LABOR DAY)");
        }
        else if (x == 25)
        {
            System.out.println (y + x + " - END OF MARKING PERIOD");
        }
        else 
        {
            System.out.println (y + x);
        }
        x = x + 1;
    }
    }
    
}