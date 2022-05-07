class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    double s = sc.nextInt();
		    double a = sc.nextInt();
		    double b = sc.nextInt();
		    double c = sc.nextInt();
		    if(a <= (s+(c/100)*s) && b >= (s+(c/100)*s))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		}
	}
}
