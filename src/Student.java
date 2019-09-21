public class Student {
    // Private Variables
    private String _name;
    private double _GPA;
    private final int _CWID = 1234;

    //Constructors
    public Student(String name, double GPA){
        _name = name;
        _GPA = GPA;
    }
    public void showStudents(){
        System.out.println(_name + " " + _CWID + " " + _GPA);
    }
    public void showStudents(String name){
        System.out.println("The students name is: ");
    }

}
