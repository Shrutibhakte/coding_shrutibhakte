class reverseExample
{
	public static void main(String []args)
	{
		int num=98764,rev=0;
		while(num!=0){
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		System.out.println("reverse of given number:" +rev);
	}
}