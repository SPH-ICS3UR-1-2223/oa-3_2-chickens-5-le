public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        
        int eggsPerChicken = 5;
        int chickenCount = 3;
        int totalEggs = 0 ;
        totalEggs += chickenCount * eggsPerChicken;
        chickenCount = chickenCount + 1;
        totalEggs += chickenCount * eggsPerChicken;
        chickenCount = chickenCount / 2;
        totalEggs += chickenCount * eggsPerChicken;
        
        System.out.println(totalEggs);
    }   
}
