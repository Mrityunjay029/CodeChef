class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int r = sc.nextInt();
		    int s = sc.nextInt();
		    if(r%2==0)
		    r=r/2;
		    else
		    r=(r+1)/2;
		    
		    if(s%2==0)
		    s=s/2;
		    else
		    s=(s+1)/2;
		    
		    System.out.println(r*s);
		}
	}
}
