class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    s = s + '9';
		    int count = 0;
		    int operation = 0;
		    for(int i=0;i<n+1;i++){
		        for(int j=i;j<n+1;j++){
		            if(s.charAt(i) == s.charAt(j))
		            count++;
		            else{
		                if(count%2 != 0){
		                    operation+=(count+1)/2;
		                    count=0;
		                }
		                else{
		                    operation+=count/2;
		                    count=0;
		                }
		                i=j-1;
		                break;
		            }
		        }
		    }
		    System.out.println(operation);
		}
	}
}
