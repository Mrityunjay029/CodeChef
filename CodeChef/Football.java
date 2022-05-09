class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int a[] = new int[n];
		    int b[] = new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		    b[i]=sc.nextInt();
		    int greatest=-1;
		    for (int i=0;i<n;i++){
		        if(greatest<(20*a[i])-(10*b[i]))
		        greatest=(20*a[i])-(10*b[i]);
		    }
		    if(greatest<0)
		    greatest=0;
		    System.out.println(greatest);
		}
	}
}
