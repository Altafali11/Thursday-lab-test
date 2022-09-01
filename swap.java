class Swap {
	int num;
	Swap(int n) {
		this.num = n;
	}
	public static void swap(Swap value1, Swap value2) {
		int temp = value1.num;
		value1.num = value2.num;
		value2.num = temp;
	}


	public static void main(String[] args) {

		Swap value1 = new Swap(1);
		Swap value2 = new Swap(2);
		
		System.out.println(" Before swapping value1 is  " + value1.num);
		System.out.println("Before swapping value2 is " + value2.num);
		swap(value1, value2);

		System.out.println(" After swapping value1 is  " + value1.num);
		System.out.println("After swapping value2 is " + value2.num);
	}
}