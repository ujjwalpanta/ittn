//no of arguments facilated by ...,feature after jdk>1.4
class VarArgs{
	public static void main(String... args) {//public static void main(String... b) {
		methodOne();
		methodOne(1);
		methodOne(1,2,3);
		methodTwo(new int[]{1,2,3});
		methodTwo();//error as no argument passed
	}
	public static void methodOne(int... a){
		System.out.println("Your args Method");
	}
	public static void methodTwo(int[] a){
		System.out.println("Simple Method");
	}

}