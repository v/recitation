/* Creates a class. Class <-> Type of Object */
public class Student
{
    //Fields / Properties / instance variables
    public String name;
    public int id;
    //non static. Belong to the instance.
    public String location;

    public int[] grades;

    //methods to a class
    public double gpa()
    {
        System.out.println("Computing gpa for "+name);
        int sum = 0;
        for(int i=0; i<grades.length; i++)
        {
            sum += grades[i];
        }
        return sum/grades.length;
    }

    //Constructor gets called when I say new Student
    // Usually constructors are used to "initialize" the object.
    public Student(String inputName)
    {
        grades = new int[10];
        name = inputName; 
    }

    public Student(String inputName, int inputId)
    {
        grades = new int[10];
        name = inputName; 
        id = inputId;
    }
}
