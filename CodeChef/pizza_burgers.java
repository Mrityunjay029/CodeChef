class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int p = sc.nextInt();
		    int b = sc.nextInt();
		    if(x > p && x < b)
		    System.out.println("PIZZA");
		    else if(x < p && x > b)
		    System.out.println("BURGER");
		    else if(x < p && x < b)
		    System.out.println("NOTHING");
		    else if(x >= p && x >= b){
		        if(p < b)
		        System.out.println("PIZZA");
		        else
		        System.out.println("BURGER");
		    }
		}
	}
}
