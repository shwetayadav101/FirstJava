import com.globalpayex.college.entities.StudentOld;

public class PlayArrays {

	public static void main(String[] args) {
		int n = 3;
		StudentOld[] as = new StudentOld[n];
		
		as[1] = new StudentOld("Achyut",'M',1,2);
		as[0] = new StudentOld("Achyt",'M',11,2);
		as[2] = new StudentOld("Ayu",'M',1,21);
		for(StudentOld x:as)
		{
			System.out.println(x.getNameGrade());
		}
	}

}
