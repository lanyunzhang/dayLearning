import java.util.HashMap;
import java.util.Map;


public class Testos {
	
	Map<String , Test> map = new HashMap<String,Test>();
	
	public void addMap(String key){
		Test m = new Test();
		map.put(key,m);
		m.setVersion(2);
	}
	
	public static void main(String[] args){
		System.out.println(System.getProperty("os.name"));
		Testos to = new Testos();
		to.addMap("123");
		to.addMap("456");
		
		int version = to.map.get("123").getVersion();
		int version2 = to.map.get("456").getVersion();
		System.out.println(version);
		System.out.println(version2);
	}
}
//���Բ���ϵͳ���ͣ���windows* ���� *nix
//Java��һ�ж������ã����Ըı��˶�map��˵����Ч�ġ�