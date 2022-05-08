class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    String check = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		    int arr[] = {1,2,0,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0};
		    int sum=0;
		    for(int i=0;i<s.length();i++){
		        int index = check.indexOf(s.charAt(i));
		        sum+=arr[index];
		    }
		    System.out.println(sum);
		}
	}
}
