class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int m=-1;
		    for(int i=0;i<n;i++){
		        int s = sc.nextInt();
		        int r = sc.nextInt();
		        if(s<=x && m<=r)
		        m=r;
		    }
		    System.out.println(m);
		}
	}
}
