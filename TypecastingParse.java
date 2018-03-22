class TypecastingParse{
	public static void main(String[] args) {
		String number="456";
		int a=10;
		System.out.println(number+a);
		int num=Integer.parseInt(number);
		System.out.println(a+num);
	}
}