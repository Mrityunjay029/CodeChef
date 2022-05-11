class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    String s=sc.next();
		    int amount=0;
		    for (int i=0;i<n;i++){
		        if(s.charAt(i)=='0')
		        amount+=a;
		        else
		        amount+=b;
		    }
		    System.out.println(amount);
		}
	}
}
