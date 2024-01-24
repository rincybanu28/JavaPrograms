package codingchallenge;

@FunctionalInterface
interface AuthFun
{
	boolean authenticate(String username,String Password);
}

public class Login {

	public boolean validate(String username, String password)
	{
		AuthFun authFun =(u,p)->u.equals("ABC")&&p.equals("DEF");
		return authFun.authenticate(username,password);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login login= new Login();
		//Scanner sc= new Scanner(System.in);
		String username="ABC";
		String password="DEF";
		boolean result=login.validate(username,password);
		System.out.println(result);

	}

}
