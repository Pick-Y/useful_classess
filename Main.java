import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = readIntegers();
        int minValue = findMin(array);
        System.out.println(minValue);
    }

    public static int[] readIntegers(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose how many elements to put in the array:");
        int count = sc.nextInt();

        int[] myArray = new int[count];

        for(int i =0; i < count; i++){

            System.out.println("Insert number: ");
            myArray[i] = sc.nextInt();
        }

        return myArray;
    }

    public static int findMin(int[] anArray){

        int min = 0;

        for (int i = 0; i < 5; i++)//we get the first number
        {
            for (int j = i + 1; j < 5; j++)//we get the second number
            {
                if (anArray[i] < anArray[j])//is first number less then second? if yes:
                {
                    min = anArray[i]; //assisgn the value to the temporary variable
                    anArray[i] = anArray[j]; //make the first number equal to the second number (you are swopping position)
                    anArray[j] = min; //assign the value of temp to the first position of the array;
                }
            }
        }
        return min;
    }
}

