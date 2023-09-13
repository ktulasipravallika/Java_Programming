package Static.RollNumberAssignment;

import java.util.Calendar;


public class RollNumber {

    private static int count = 1;
    private String rollNumber;


    public String generateRollNo(){
        rollNumber = "UNIV" + Calendar.getInstance().getWeekYear() + count;
        count ++;
        return rollNumber;

    }

    RollNumber(){
       rollNumber = generateRollNo();
    }

    public String getRollNo() {
        return rollNumber;
    }
    
}
