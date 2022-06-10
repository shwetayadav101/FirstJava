import com.abc.salary.SalaryCalculator;
import com.globalpayex.college.entities.Professor;
import com.globalpayex.college.entities.Student;

public class RunCollege {

    public static void main(String[] args) {
        Student s1 = new Student("Achyut",'M',12,12);
        String[] subjects = {"Math","Scince"};
        Professor p1 = new Professor("Sif", 'M', 5000, 20, subjects);
        System.out.println(p1.calculate());

    }
    
}
