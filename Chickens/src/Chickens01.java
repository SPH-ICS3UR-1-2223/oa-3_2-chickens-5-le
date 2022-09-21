public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
        
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = 0 ;
        //Monday
        totalEggs += chickenCount * eggsPerChicken;
        //Tuesday
        chickenCount = chickenCount + 1;
        totalEggs += chickenCount * eggsPerChicken;
        //Wednesday
        chickenCount = chickenCount / 2;
        totalEggs += chickenCount * eggsPerChicken;
        
        System.out.println(totalEggs);
    }   
}
