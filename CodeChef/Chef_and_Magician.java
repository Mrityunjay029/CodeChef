class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int s = sc.nextInt();
		    int arr[] = new int[n];
		    arr[x-1] = 1;
		    int index=0;
		    for(int i=0;i<s;i++){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int temp = arr[a-1];
		        arr[a-1] = arr[b-1];
		        arr[b-1] = temp;
		    }
		    for(int i=0;i<n;i++){
		        if(arr[i] == 1){
		            index = i;
		            break;
		        }
		    }
		    System.out.println(index+1);
		}
	}
}
