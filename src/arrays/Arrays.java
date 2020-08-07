package arrays;

public class Arrays{
    public static void main(String[] args) {
        // Arrays in java
        
        // Type of array
        int[] numbers = {4,5,7,8,11};
        
        // Another type of array to declare arrays
        int[] values;
        values = new int[5];
        values[0] = 30;
        values[1] = 35;
        values[2] = values[0] + values[1];
        values[3] = values[2] + 20;
        values[4] = values[3] * 2;
        
        for(int i = 0; i < values.length; i++){
            // Prints out the values of the array
            System.out.println("Values of the array: " + values[i]);
        }
        
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Numbers of the array: " + numbers[i]);
        }
    }
}