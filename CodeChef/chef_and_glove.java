class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int l[] = new int[n];
		    int g[] = new int[n];
		    for(int i=0;i<n;i++)
		    l[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		    g[i]=sc.nextInt();
		    int countF=0;
		    int countB=0;
		    for(int i=0;i<n;i++){
		        if(l[i]>g[i]){
		            countF=-1;
		            break;
		        }
		    }
		    for(int i=0;i<n;i++){
		        if(l[i]>g[n-i-1]){
		            countB=-1;
		            break;
		        }
		    }
		    if(countF==-1 && countB==-1)
		    System.out.println("none");
		    else if(countF==0 && countB==0)
		    System.out.println("both");
		    else if(countF==0 && countB==-1)
		    System.out.println("front");
		    else
		    System.out.println("back");
		}
	}
}
