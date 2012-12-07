public class Program
{
    public static void main(String[] args)
    {
        int x = IO.readInt();
        System.out.println(fibonacci(x));        
    }

    public static int factorialIter(int x)
    {
        int product = 1;
        for(int i=1; i<=x; i++)
        {
            product = product * i;
        }
        return product;
    }

    public static int factorialRec(int x)
    {
        if (x == 1)
            return 1;
        return x * factorialRec(x - 1);
    }

    public static int fibonacci(int n)
    {
        if(n == 1 || n == 2)
            return 1;
        return fibonacci(n -1) + fibonacci(n-2);
    }
}
