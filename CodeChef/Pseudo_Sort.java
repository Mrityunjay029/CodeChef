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
	        arr[i] = sc.nextInt();
	        
	        for(int i=0;i<n-1;i++){
	            if(arr[i] > arr[i+1]){
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	        }
	        int count=0;
	        for(int i=0;i<n-1;i++){
	            if(arr[i] > arr[i+1]){
	                count = -1;
	                break;
	            }
	        }
	        if(count == 0)
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	    }
	}
}
