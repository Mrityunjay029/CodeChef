class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int greatest = -1;
		    for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    if(greatest < arr[i])
		    greatest = arr[i];
		}
		System.out.println(greatest);
		}
	}
}
