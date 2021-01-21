public class ReverseIntegerArray {

    public static void reverse(int[] anArray){

        int temp = 0;

        for(int i = 0; i < anArray.length; i++)
        {
            for(int j = i + 1; j < anArray.length; j++){
                temp = anArray[i]; //temp becomes 1
                anArray[i] = anArray[j]; //array, position 0 becomes 2
                anArray[j] = temp; //array position 1 becomes 1
            }
        }

    }
}
