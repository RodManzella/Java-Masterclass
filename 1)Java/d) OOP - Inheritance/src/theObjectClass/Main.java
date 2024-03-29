package theObjectClass;


public class Main extends Object {
    public static void main(String[] args) {

        Student max = new Student("Max", 21);
        System.out.println(max.toString());

        PrimarySchoolStudent jimmy = new PrimarySchoolStudent("Jimmy", 8, "Carole");
        System.out.println("Jimmy");
        System.out.println(jimmy);
        
    }
   
}


class Student{
    private String name;
    private int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "is "+ age;
        // return "Student [name=" + name + ", age=" + age + "]";
    }
}

class PrimarySchoolStudent extends Student{

    private String parentName;

    PrimarySchoolStudent(String name, int age, String parentName){
        super(name, age);
        this.parentName = parentName;
    }

    public String toString(){
        return parentName +"´s kid, " + super.toString();
    }

}


// we´ve already build Student, which inherits from Object implicitly
// Next, we´ll build PrimarySchoolStudent, which will inherit from Student.