class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for (int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    int count=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]%2==0){
		            count=-1;
		            break;
		        }
		    }
		    if(count==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
