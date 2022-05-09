class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
		int stamps=0;
		int sumi=0;
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		    stamps+=arr[i];
		    sumi+=i+1;
		}
		if(stamps==sumi)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
