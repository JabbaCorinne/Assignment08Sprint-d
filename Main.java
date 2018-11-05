public class Main {

    public static void main(String[] args) {
        //Define instances of variables for the method to calculate the capacity
        //40-hour workweek
        calculateCapacity(8,3,40);
        calculateCapacity(9,3,40);
        calculateCapacity(10,3,40);
        calculateCapacity(11,3,40);
        calculateCapacity(8,4,40);
        calculateCapacity(8,5,40);
        calculateCapacity(8,6,40);
        //35-hour workweek
        calculateCapacity(8,3,35);
        calculateCapacity(9,3,35);
        calculateCapacity(10,3,35);
        calculateCapacity(11,3,35);
        calculateCapacity(8,4,35);
        calculateCapacity(8,5,35);
        calculateCapacity(8,6,35);
        //30-hour workweek
        calculateCapacity(8,3,30);
        calculateCapacity(9,3,30);
        calculateCapacity(10,3,30);
        calculateCapacity(11,3,30);
        calculateCapacity(8,4,30);
        calculateCapacity(8,5,30);
        calculateCapacity(8,6,30);
    }

    //Create method to calculate capacities
    //Parameters include number of engineers, number of weeks spent on each sprint, and number of hours spent working per week
    public static void calculateCapacity(int engineers, int weeks, int hoursPerWeek) {

        //First, calculate the total work effort by adding the provided effort levels of the ten work items
        // The sum should be 1590
        double totalWorkEffort=100+50+20+360+80+160+500+240+40+40;

        //Next, calculate the capacities by dividing the total work effort by the number of engineers times the sprint length in weeks times the hours worked per week
        //Multiply by 100 to get a percentage value
        double capacity=(totalWorkEffort/(engineers*weeks*hoursPerWeek))*100;

        //Output statements containing info using printf
        // Make capacity an int because it was originally a double (this is called casting)
        // Add \n so each statement is formatted on a new line
        System.out.printf("With %d devs working a %d week sprint, for %d hrs/wk, we would be at %d%% of capacity.\n",engineers,weeks,hoursPerWeek,(int)capacity);
    }
}