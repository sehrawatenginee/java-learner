class Test{
	static int a = 10;
	int i[] = {0};
	public static void main(String[] args) {
		int i[] = {1};
		ssTest(i);
		System.out.println(i[0]);
		
		String l = "aa";
		String m = l.concat("bb");
		System.out.println(m);
		
		
	}
	public static void ssTest(int i[]){
		int j[] = {2};
		i= j;
		
		StringBuffer a = new StringBuffer("Am");
		StringBuffer b = new StringBuffer("Am");
		String c = "Am";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println("Poddar".substring(3));
		
		int h=8;
		String s=h+"";s=String.valueOf(h);
		
		Float f=10.4f;
		int fint=f.intValue();
		s="12345";
		int r=Integer.parseInt(s);
		
		
	}
}