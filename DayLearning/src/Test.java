
public class Test {
	
	private int version = 1;
	
	public void setVersion(int version){
		this.version = version;
	}
	
	public int getVersion(){
		return version;
	}
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
