class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    double r = sc.nextInt();
		    
		    double a = sc.nextInt();
		    double b = sc.nextInt();
		    
		    double p = sc.nextInt();
		    double q = sc.nextInt();
		    
		    double x = sc.nextInt();
		    double y = sc.nextInt();
		    
		    double dis = Math.pow(Math.pow(a-p,2) + Math.pow(b-q,2),0.5);
		    double dis1 = Math.pow(Math.pow(x-p,2) + Math.pow(y-q,2),0.5);
		    System.out.println(dis);
		    System.out.println(dis1);
		    if(dis <= r && dis1 <= r)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
	}
}
