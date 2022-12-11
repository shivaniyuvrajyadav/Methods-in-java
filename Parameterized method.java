class Calculator 
{
	public  static void add(int a,int b,int c){
		
		int d = a+b+c;
		System.out.println(d);
		}
    public static void sub(int e , int f){
	
	int g = e - f;
	System.out.println(g);

	}
	public static void div(int h,int i){
		
		int j = h / i;
		System.out.println(j);
	}

	public static void main(String[] args) 
	{
		add(10,20,30);
		sub( 20,40);
	div(100 , 5);
	}
}
