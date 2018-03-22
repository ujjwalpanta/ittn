class largestFOur{
	public static void main(String args[]){
		int a=10,b=20,c=15,d=18;
		/*int result1=(a>b)?a:b;
		int result2=(c>d)?c:d;
		int result=(result1>result2)?result1:result2;
		// int result1=(a>b)?(a>c?a:c):(b>c?b:c);*/
		int result=(((a>b)?(a>c))?(a>d?a:d)):(b>c)?(b>d?b:d):(c>d?c:d)b:c);
		System.out.println(result);
	}
}