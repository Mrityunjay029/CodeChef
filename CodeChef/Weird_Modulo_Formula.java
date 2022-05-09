class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    Arrays.sort(arr);
		    int mod=arr[0]%arr[1];
		    for(int i=2;i<n;i++){
		        mod=mod%arr[i];
		    }
		    System.out.println(mod);
		}
	}
}
