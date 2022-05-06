class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    arr[i] = sc.nextInt();
		    
		    int sum = 0;
		    int count = 0;
		    int product = 1;
		    
		    for(int i=0;i<n;i++){
		        sum = 0;
		        product =1;
		        for(int j=i;j<n;j++){
		            sum+=arr[j];
		            product*=arr[j];
		            if(sum == product)
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
