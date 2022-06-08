import com.globalpayex.college.entities.StudentOld;


public class CreateStudent 
{	
	public static void main(String[] args) 
	{
		StudentOld studentArray[];
		studentArray = new StudentOld[3];
		studentArray[0] = new StudentOld("shreya",'m',23,70); 
		studentArray[1] = new StudentOld("mayank",'m',24,80);
		studentArray[2] = new StudentOld("shiv",'m',25,90);
		
		for(int i=0;i<studentArray.length;i++)
		{
			System.out.println(studentArray[i].name+" "+studentArray[i].gender+"\n");
		}
	}
}