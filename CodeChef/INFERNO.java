class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int arr[] = new int[n];
		    int sum = 0;
		    int count = 0; 
		    int greatest = -1;
		    for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    sum+=arr[i];
		    if(greatest < arr[i])
		    greatest = arr[i];
		    }
		    
		    for(int i=0;i<n;i++){
		        arr[i]-=x;
		        count++;
		        if(arr[i] > 0)
		        i--;
		    }
		    if(greatest < count)
		    System.out.println(greatest);
		    else
		    System.out.println(count);
		}
	}
}
