import com.globalpayex.bank.entities.Account;
import com.globalpayex.bank.exceptions.MinBalNotMaintainedException;

public class CreateAccount {

	public static void main(String[] args) {
		Account a = new Account("Saving","123ABC",10000);
		
//		try
//		{
//			System.out.print(a.withDraw(32));
//		}
//		catch(IllegalStateException e)
//		{
//			System.out.println(e.getMessage());
//		}
//		catch(IllegalArgumentException e)
//		{
//			System.out.println(e.getMessage());
//		}
		
		try {
			System.out.println(a.withDraw(90000));
		}
		catch(MinBalNotMaintainedException e)
		{
			
			System.out.println(e.getMessage());
		}
		
	}

}
