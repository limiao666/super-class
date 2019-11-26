package test.javatest.practise2;

public class Student extends Personal{

    private int grade;
    private int studentID;
    private String department;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public Student(int studentID, String department, int grade){
        this.studentID=studentID;
        this.department=department;
        this.grade=grade;

    }


    public String toString(){
        Personal pe=new Personal("17200135216","李苗",21,true);
        return "studentID="+studentID+"\tdepartment="+department+"\tgrade="+grade+"\t"+pe.toString();
    }
}
