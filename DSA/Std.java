class Student {
    String Name;
    String Roll;
    String year;
    int age;

    Student(){
    Name=" ";
    Roll=" ";
    year=" ";
    age=0;
    }

    void printInfo() {
        System.out.println(this.Name);
        System.out.println(this.Roll);
        System.out.println(this.year);
        System.out.println(this.age);
    }
}

public class Std{

    public static void main (String args[]) {

        Student s1 = new Student();

        s1.Name = "Sayan";
        s1.Roll = "AIML/24/004";
        s1.year = "3rd";
        s1.age = 20;

        s1.printInfo();
    }
}