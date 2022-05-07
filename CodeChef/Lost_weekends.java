class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int a1=sc.nextInt();
	        int a2=sc.nextInt();
	        int a3=sc.nextInt();
	        int a4=sc.nextInt();
	        int a5=sc.nextInt();
	        int p=sc.nextInt();
	        if(p*(a1+a2+a3+a4+a5) > 120)
	        System.out.println("Yes");
	        else
	        System.out.println("No");
	    }
	}
}
