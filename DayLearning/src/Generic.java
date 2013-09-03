import java.util.List;
import java.util.ArrayList;

// 泛型函数的使用
public class Generic {
	
	public static <T> T getInstance(List<T> list){
		T  t = list.get(0);
		return t; 
	}
	
	public static boolean IsInJar(Class clazz){
		 ClassLoader loader = clazz.getClassLoader();
		 String classFile = clazz.getName().replaceAll("\\.", "/") + ".class";
		 System.out.println(classFile);
		 return false;
	}
	public static void main(String[] args){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1));
		Integer g = Generic.getInstance(list);
		System.out.println(g.intValue());
		Generic.IsInJar(Generic.class);
	}

}
