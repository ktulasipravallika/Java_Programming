package Classes_Objects.Student;

public class Student {

    public int rollNo;
    public String name;
    public String course;
    public double m1, m2, m3;

    public double total(){
        return (m1 + m2 + m3);

    }
    public double average(){
        return total()/3;

    }
    public char grade(){

        double percentage = (total() * 100) / 300;
        if(percentage >= 80){
            return 'A';
        }
        else if(percentage >= 65 && percentage < 80){
            return 'B';
        }
        else{
            return 'C';
        }
    }

    public String showDetails(){

        return ("\n rollNo is : " + rollNo +  "\n Name is : " + name + "\n Course is : " + course);
    }

    

    
}
