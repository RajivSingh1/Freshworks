import org.json.simple.JSONObject;

public class StudentDataStore {
    Detail detail;

    public StudentDataStore(Detail detail) {
        this.detail = detail;
    }
    JSONObject obj = new JSONObject();
    public void insert() {

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

    }


}
