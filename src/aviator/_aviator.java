package aviator;
import java.util.HashMap;
import java.util.Map;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;

public class _aviator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String expression = "a==b&&c<d"; 
	        // ������ʽ 
	        Expression compiledExp = AviatorEvaluator.compile(expression); 
	 
	        Map<String, Object> env = new HashMap<String, Object>(); 
	        env.put("a", 45); 
	        env.put("b", 45); 
	        env.put("c", 70); 
	        env.put("d", 80); 
	        // ִ�б��ʽ 
	        Boolean result = (Boolean) compiledExp.execute(env); 
	        System.out.println(result);
	}

}
