public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here

         double dailyAverage = 0;
         double eggCount = 0;
         double monthlyAverage = 0;
         double monthlyProfit = 0;
         //Monday
         eggCount+=100; //Collect 100 eggs
         //Tuesday
         eggCount+=121; //Collect 121 eggs
         //Wednesday
        eggCount+=117; //Collect 1177 eggs
        
        //Calculate Daily Average
        dailyAverage = eggCount/3;
        System.out.println("Daily Average:   " +dailyAverage);
        
        //Calculate the Monthly Average
        monthlyAverage = dailyAverage*30;
        System.out.println("Monthly Average: " +monthlyAverage);
        
        //Monthly Profit
        monthlyProfit = monthlyAverage*0.18;
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
