
public class Test {
	
	public int  aa(){
		int a = 1;
		b(a);
		return a;
		
	}
	public void b(int m){
		m++;
	}
	
	public static void main(String[] args){
		System.out.println(new Test().aa());
	}
}
