import org.json.simple.JSONObject;

import java.io.IOException;

public interface DataStore {
    void insert() throws IOException;
        JSONObject read(String key);
        void delete(String key);
}
