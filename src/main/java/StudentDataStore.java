import org.json.simple.JSONObject;

import java.io.*;

public class StudentDataStore {
    Detail detail;

    public StudentDataStore(Detail detail) {
        this.detail = detail;
    }
    JSONObject obj = new JSONObject();
    public void insert() throws IOException {

        if (!obj.containsKey("country_name"))
            obj.put("country_name", detail.getCountryName());
        else
            System.out.println("key will not be same");
        if (!obj.containsKey("country_capital"))
            obj.put("country_capital", detail.getCountryCapital());
        else
            System.out.println("key will not be same");
        if (!obj.containsKey("region"))
            obj.put("region", detail.getRegion());
        else
            System.out.println("key will not be same");
        if (!obj.containsKey("language"))
            obj.put("language", detail.getLanguage());
        else
            System.out.println("key will not be same");
PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("res.txt",true)));
pw.print(obj);
        System.out.println("details added sucessfully");
        pw.close();
    }

    public JSONObject read(String key)
    {
        return (JSONObject) obj.get(key);
    }
    public void delete(String key)
    {
        obj.remove(key);
    }
}
