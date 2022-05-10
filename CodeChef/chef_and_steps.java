class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[] = new int[n];
		    String word="";
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(arr[i]%k==0)
		        word+='1';
		        else
		        word+='0';
		    }
		    System.out.println(word);
		}
	}
}
