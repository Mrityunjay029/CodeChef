class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int I = 0;
		    int Y = 0;
		    int N = 0;
		    for(int i=0;i<n;i++){
		        if(s.charAt(i) == 'I')
		        I++;
		        else if(s.charAt(i) == 'Y')
		        Y++;
		        else if(s.charAt(i) == 'N')
		        N++;
		    }
		    if(I>0)
		    System.out.println("INDIAN");
		    else if(I == 0 && Y==0)
		    System.out.println("NOT SURE");
		    else if(I==0)
		    System.out.println("NOT INDIAN");
		}
	    
	}
}
