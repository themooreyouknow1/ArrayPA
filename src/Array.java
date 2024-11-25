import java.util.Arrays;
import java.util.Scanner;

public class Array {

    //task 1:
    public void useAssignPrint() {
        int [] numbers = {1, 2, 3};
        System.out.println("Print Array: " + Arrays.toString(numbers));
    }
    //task 2
    public void findMiddle(){
        int [] numbers = {13, 5, 7, 68, 2};
        int middle = numbers.length/2;
        System.out.println("Middle Element: " + numbers[middle]);
    }
    //task 3
    public void useLengthToString(){
        String [] colors = {"red", "green", "blue", "yellow"};
        System.out.println("Length: " + colors.length);
        String [] clone = colors.clone();
        System.out.println("Clone Array: " + Arrays.toString(clone));
    }
    //task 4
    public void createArray(){
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length-1]); // w/o -1 = ArrayIndexOutOfBoundsException
    }
    //task 5
    public void createArrayLoop(){
        int [] numbers = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
    //task 6
    public void createArrayLoopMulti() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i * 2);
            System.out.println(numbers[i]);
        }

    }
    //task 7
    public void exceptMiddle(){
        int [] numbers = {1, 2, 3, 4, 5};
        for(int i = 0; i < numbers.length; i++){
            if (i != 2){
                System.out.println(i);
            }
        }
    }
    //task 8
    public void swapString(){
        String [] colors = {"red", "green", "blue", "yellow", "black"};
        String swap = colors[0];
        colors[0] = colors[2];
        colors[2] = swap;

        for(String color : colors){
            System.out.println(color);
        }
    }
    //task 9
    public void sortArray(){
        int [] numbers = {4, 2, 9, 13, 1, 0};
        Arrays.sort(numbers);
        System.out.println("Array in ascending order: " + Arrays.toString(numbers));
        System.out.println("The smallest number is: " + numbers[0]);
        System.out.println("The biggest number is: " + numbers[numbers.length-1]);
    }
    //task 10
    public void createMixedArray(){
        Object [] mixedArray = {1, "Hello", "World", "Java", 3.14};
        for (Object mixedObject : mixedArray) {
            System.out.println(mixedObject);
        }
    }
    //task 11
    public void askUserArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        int number = input.nextInt();
        input.nextLine();


        String [] favorites = new String[number];

        for (int i = 0; i < favorites.length; i++) {
            System.out.print("Enter your thing: " + (i + 1) + ": ");
            favorites[i] = input.nextLine();
        }
        System.out.println("Your favorite things are: " + Arrays.toString(favorites));
    }


}
