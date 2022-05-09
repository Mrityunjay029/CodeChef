class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    long sum=0;
		    long index=0;
		    long arr[] = new long[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextLong();
		    for (int i=0;i<n-1;i++){
		        if(arr[i]>arr[i+1]){
		            index=arr[i]-arr[i+1];
		            index--;
		        }
		        else{
		            index=arr[i+1]-arr[i];
		            if(index!=0)
		            index--;
		        }
		        sum+=index;
		    }
		    System.out.println(sum);
	}
}
}
