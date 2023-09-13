package Classes_Objects.Subjects;

public class Student {

    private String rollNo;
    private String name;
    private String dept;
    private Subject s[] = new Subject[3]; 


    public String getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public void setDept(String dep){
        if(!dep.equals(null)) dept = dep;
        else dept = "";
    }
    
    public Subject getSubjects(int i){

            return s[i];
    }
    public void setSubjects(Subject... sub){

        for(int i =0 ; (i < sub.length) ; i ++){
            s[i] = sub[i];
        }
    }
    public String toString() {
        return "Student Id : " + rollNo + "\n Student Name : " + name + "\n Department : " + dept ;
    }

    public Student(){
        rollNo = "1111";
        name = "Latha";
    }
}
