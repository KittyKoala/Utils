package json;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Sort {

	public static void main(String[] args) {
		 String jsonArrStr = "[ { \"ID\": \"432\", \"Name\": \"Fargo Chan\" },{ \"ID\": \"421\", \"Name\": \"Aaron Luke\" },{ \"ID\": \"252\", \"Name\": \"Dilip Singh\" }]";

		    JSONArray jsonArr = new JSONArray(jsonArrStr);
		    JSONArray sortedJsonArray = new JSONArray();

		    List<JSONObject> jsonValues = new ArrayList<JSONObject>();
		    for (int i = 0; i < jsonArr.length(); i++) {
		        jsonValues.add(jsonArr.getJSONObject(i));
		    }
		    Collections.sort( jsonValues, new Comparator<JSONObject>() {
		        //You can change "Name" with "ID" if you want to sort by ID
		        private static final String KEY_NAME = "ID";

		        @Override
		        public int compare(JSONObject a, JSONObject b) {
		            String valA = new String();
		            String valB = new String();

		            try {
		                valA = (String) a.get(KEY_NAME);
		                valB = (String) b.get(KEY_NAME);
		            } 
		            catch (JSONException e) {
		                //do something
		            }

		            return valA.compareTo(valB);
		            //if you want to change the sort order, simply use the following:
		            //return -valA.compareTo(valB);
		        }
		    });

		    for (int i = 0; i < jsonArr.length(); i++) {
		        sortedJsonArray.put(jsonValues.get(i));
		    }
		    System.out.println(sortedJsonArray.toString());
	}

}
