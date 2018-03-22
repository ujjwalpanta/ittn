class largestThree{
	public static void main(String args[]){
		int a=10,b=20,c=30;
		int result=(a>b)?a:b;
		int result1=(c>result)?c:result;
		// int result1=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(result1);
	}
}