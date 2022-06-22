public class Main {
    public static void main(String[] args) {
        // simulate the passing of time
        int startingYear = 2000;
        int targetYear = 2011;
        int currentYear = startingYear+1;

        //while loop
        
        while (currentYear < targetYear) {
            if((currentYear - startingYear) == 1)
            {
                System.out.println((currentYear - startingYear) + " year have passed");
            }else{
                System.out.println((currentYear - startingYear) + " years have passed");
            }
            currentYear++;
        }

        //for loop
        currentYear = startingYear+1;

        for(int i = startingYear; i<targetYear-1; i++)
        {   
            if((currentYear - startingYear) == 1)
            {
                System.out.println((currentYear - startingYear) + " year have passed");
            }else{
                System.out.println((currentYear - startingYear) + " years have passed");
            }
            currentYear++;
        }
    }
}
