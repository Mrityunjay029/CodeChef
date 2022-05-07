class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int z = sc.nextInt();
		    
		    int x1 = -1 * x;
		    int y1 = -1 * y;
		    int z1 = -1 * z;
		    
		    if(x1+y+z == 0)
		    System.out.println("yes");
		    else if (y1+x+z == 0)
		    System.out.println("yes");
		    else if(z1+x+y == 0)
		    System.out.println("yes");
		    else if(x1+y1+z == 0)
		    System.out.println("yes");
		    else if(y1+z1+x == 0)
		    System.out.println("yes");
		    else if(x1+z1+y == 0)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		}
	}
}
