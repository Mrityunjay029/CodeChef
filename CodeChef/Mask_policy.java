class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a=sc.nextInt();
		    int unaffected=n-a;
		    if(a < unaffected)
		    System.out.println(a);
		    else
		    System.out.println(unaffected);
		}
	}
}
