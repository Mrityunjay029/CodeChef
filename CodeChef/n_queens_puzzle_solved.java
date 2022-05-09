class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    double n=sc.nextInt();
		    System.out.println(Math.round(Math.pow(0.143*n,n)));
		}
	}
}
