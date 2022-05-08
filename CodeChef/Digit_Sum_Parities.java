class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = n;
		    int num=0;
		    int sum=0;
		    while(x!=0){
		        num=x%10;
		        sum+=num;
		        x=x/10;
		    }
		    sumdigits(sum,n);
		}
	}
	public static void sumdigits(int sum,int n){
	    if(sum%2==0){
	        n++;
	        int x = n;
		    int num=0;
		    int sum1=0;
		    while(x!=0){
		        num=x%10;
		        sum1+=num;
		        x=x/10;
		    }
		    if(sum1%2==0)
		    sumdigits(sum,n);
		    else
		    System.out.println(n);
	    }
	    else{
	        n++;
	        int x = n;
		    int num=0;
		    int sum2=0;
		    while(x!=0){
		        num=x%10;
		        sum2+=num;
		        x=x/10;
		    }
		    if(sum2%2!=0)
		    sumdigits(sum,n);
		    else
		    System.out.println(n);
	    }
	}
}
