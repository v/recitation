public class Program
{
    public static void main(String[] args)
    {
        String name;
        int id;
        String location;

        String nameOne;
        int idOne;
        String locationOne;

        //Student is the class. sang is the instance of the class.
        Student sang = new Student("Sang", 123456);
        sang.location = "Busch";

        sang.grades = {1,2,3,4,5};

        sang.gpa();
        Student.gpa(sang);

        //v is an instance.
        Student v = new Student();
        v.name = "Vaibhav";
        v.id = 1234567;
        v.location = "Off campus";




/*

        Student s = new Student("Vaibhav", 12345); <<< NEW CALLS THE CONSTRUCTOR
        Student joe = new Student("Joe");

        System.out.println("Enter your name");
        s.name = IO.readString();

        System.out.println("Enter your id");
        s.id = IO.readInt();

        System.out.println("Enter your dorm");
        s.dorm = IO.readString();

        double gpa = s.gpa();
    */
    }
}
