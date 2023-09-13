package Classes_Objects.Subjects;

public class Subject {

    private String subId;
    private String name;
    private double maxMarks;
    private double marksObtained;

    public String getSubId(){
        return subId ;
    }

    public String getName(){
        return name;
    }

    public double getMaxMarks(){
        return maxMarks;
    }

    public void setMaxMarks(double mM){
        maxMarks = mM;
    }

    public double getMarksObtained(){
        return marksObtained;
    }
    public void setMarksObtained(double mmo){
        marksObtained = mmo;
    }

    public Subject(String sid, String n, double mm, double mmo){

        subId = sid;
        name = n;
        maxMarks = mm;
        marksObtained = mmo;
        
    }

    public Subject(String sid, String n, double mm){

        subId = sid;
        name = n;
        maxMarks = mm;
        marksObtained = 0;
    }

    boolean isQualified(){
        return marksObtained >= maxMarks /(10*4);
    }

    public String toString(){
        return "Name is :" + name + "\n" + "Subject ID is : " + subId + "\n" + "Marks obtained is :" + marksObtained + "\n" + "Qualified or Not :" + isQualified();
    }
}
