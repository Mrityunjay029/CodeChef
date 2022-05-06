class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
		    while(t-- > 0){
		        int e = sc.nextInt();
		        int k = sc.nextInt();
		        int count = 0;
		        while(e/k != 0){
		            e = e/k;
		            count++;
		        }
		        System.out.println(count+1);
		    }
	}
}
