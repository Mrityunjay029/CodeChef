class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    String s = sc.next();
		    char charr[] = s.toCharArray();
		    int count = 0;
		    for(int i=0;i<s.length()-2;i++){
		       if(charr[i] == '<' && charr[i+1] == '>')
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
