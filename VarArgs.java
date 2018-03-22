//no of arguments facilated by ...
class VarArgs{
	public static void main(String... args) {
		methodOne();
		methodOne(1);
		methodOne(1,2,3);
	}
	public static void methodOne(int... a){
		System.out.println("Your args Method");
	}
}