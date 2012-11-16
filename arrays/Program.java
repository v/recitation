public class Program {
    public static void main(String[] args)
    {
        /* Let's say you wanted to write code that took in three student's grades and averages it */
        //You would probably do something like this.
        
        int first = IO.readInt();
        int second = IO.readInt();
        int third = IO.readInt();

        System.out.println((first+second+third)/3);

        /* Now if you wanted to take in 10 grades, or a 100 grades, you can imagine that this gets pretty tedious.*/
        // This is where arrays come in.
        // Arrays allow you to create a list of something easily.
        
        int[] numbers = new int[10]; //Creates an int-array called numbers of size 10.

        System.out.println(numbers[0]); //Prints the first element of numbers. Will equal 0 by default.

        numbers[0] = 5; //Sets the element at the 0th index of numbers to 5.
        numbers[9] = 20; //Sets the element at the 9th index (the last element) of numbers to 20.

        System.out.println(numbers[0]); //Prints the first element of numbers. Will equal 5.
        System.out.println(numbers[0]); //Prints the first element of numbers. Will equal 5.


        System.out.println(numbers.length); //Prints the length of numbers. For this array you will return 10.

        //print all the elements of an array
        
        //You can imagine that to print all the elements of numbers, I can do this.
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        //...
        System.out.println(numbers[9]);

        //But this is tedious. What happens if I change the size of numbers? So I can use a loop to print all the elements of numbers instead.
        
        for(int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //How would I go about incrementing all the values in an array? {1,2,3,4,5} -> {2,3,4,5,6}
        
        for(int i=0; i<numbers.length; i++) {
            numbers[i] += 1;
        }

        //How do I take in an array  of n numbers as input?
        
        int n = IO.readInt();
        int[] inputNumbers = new int[n];

        //The first time this loop runs, it will set:
        //inputNumbers[0] = IO.readInt()
        //The next time,
        //inptuNumbers[1] = IO.readInt()
        //and so on 
        //until
        //inputNumbers[9] = IO.readInt()
        
        for(int i=0; i<n; i++) {
            inputNumbers[i] = IO.readInt();
        }
    }
}
