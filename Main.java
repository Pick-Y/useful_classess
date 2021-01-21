import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a number");
        int number;
        scanner.nextInt();

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please insert a number");
            number = scanner.nextInt();
            myArray[i] = number;

        }

        int temp = 0;
        for (int i = 0; i < 5; i++)//we get the first number
        {
            for (int j = i + 1; j < 5; j++)//we get the second number
            {
                if (myArray[i] < myArray[j])//is first number less then second? if yes:
                {
                    temp = myArray[i]; //assisgn the value to the temporary variable
                    myArray[i] = myArray[j]; //make the first number equal to the second number (you are swopping position)
                    myArray[j] = temp; //assign the value of temp to the first position of the array;
                }
            }
        }


        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);


        }
       //arranging in discending order

    }
}

