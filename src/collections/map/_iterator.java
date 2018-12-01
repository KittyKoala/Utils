package collections.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class _iterator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Map<String,String> map=new HashMap<String,String>();
      map.put("1", "value1");
      map.put("2", "value2");
      map.put("3", "value3");
	//��һ�֣��ձ�ʹ�ã�����ȡֵ
      System.out.println("ͨ��Map.keySet����key��value");
      for(String key:map.keySet())
      {
    	  String value=map.get(key);
    	  System.out.println(key+":"+value);
      }
      System.out.println("-------------------------");
      //�ڶ��֣�
      System.out.println("ͨ��Map.entrySetʹ��iterator����key��value");
      Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
      while(it.hasNext()) {
    	  Map.Entry<String, String> entry=it.next();
    	  String key=entry.getKey();
    	  String value=entry.getValue();
    	  System.out.println(key+":"+value);
      }
      //�����֣��Ƽ���������������ʱ
      System.out.println("ͨ��Map.entrySet����key��value");
      for(Map.Entry<String, String> entry:map.entrySet()) {
    	  String key=entry.getKey();
    	  String value=entry.getValue();
    	  System.out.println(key+":"+value);
      }
      //������ 
      System.out.println("ͨ��map.values()�������е�value,�����ܱ���key");
      for(String value:map.values()) {
    	  System.out.println("value="+value);
      }
	}

}
