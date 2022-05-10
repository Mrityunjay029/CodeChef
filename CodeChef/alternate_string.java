class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    char arr[] = s.toCharArray();
		    int count0=0;
		    int count1=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]=='0')
		        count0++;
		        else
		        count1++;
		    }
		    if(count0==count1)
		    System.out.println(2*count0);
		    else
		    System.out.println((2*Math.min(count0,count1))+1);
		}
	}
}
