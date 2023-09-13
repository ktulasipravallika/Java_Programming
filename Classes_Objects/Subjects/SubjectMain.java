package Classes_Objects.Subjects;

public class SubjectMain {
    public static void main(String[] args) {
        
        Subject s[] = new Subject[3];
        Student stu = new Student();

        s[0] = new Subject("12345", "Pravallika", 900);
        s[2] = new Subject("678910", "Tulasi",1000, 800);
        s[1] = new Subject("112345", "Mani", 1700);

        s[1].setMaxMarks(2000);
        s[0].setMaxMarks(1000);
        
    
        stu.setSubjects(s[0], s[1], s[2]);
        stu.setDept("CSE");
        

        for(int i = 0; i < 3 ; i++){
             System.out.println("The details of the subjects is :" + s[i]);
        }

        System.out.println(stu);
    }
    
}
