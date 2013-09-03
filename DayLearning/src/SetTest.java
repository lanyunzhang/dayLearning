import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetTest {
	
	public static void main(String[] args){
		
		String[] cityarray = {"beijing","tianjin"};
		Set<String> city = new HashSet<String>();
		city.addAll(Arrays.asList(cityarray));
		if(city.contains("beijing")){
			System.out.println("beijing");
		}
		
		if(city.contains("ab")){
			System.out.println("ab");
		}
		
		
		String m = "abc";
		
		System.out.println(m.substring(0, 0).length()+"hah");
	}

}
