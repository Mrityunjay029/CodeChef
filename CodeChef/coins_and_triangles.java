class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int count = 0;
		    int answer = 0;
		    int j = 1;
		    for(int i=1;i<=n;i++){
		        count++;
		        if(count == j){
		        answer++;
		        count=0;
		        j++;
		        }
		    }
		    System.out.println(answer);
		}
	}
}
