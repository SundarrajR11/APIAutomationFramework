import com.api.constants.FrameworkConstants;
import com.api.requestbuilders.RequestDetailsBuilder;
import com.api.utilities.ApiUtils;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class GetTests {

    @Test
    public void getTest(Method method){
        Response response = RequestDetailsBuilder.getCalls()
                .get("/students");
        ApiUtils.writeJsonStoreAsString(FrameworkConstants.getRES_STORE_FOLDER_PATH()+method.getName()+"response.json",response);
        response.prettyPrint();
        System.out.println(response.statusCode());
        System.out.println(response.jsonPath().getMap("Addresses[0]"));
        System.out.println(response.jsonPath().getString("Addresses[0].street"));
        System.out.println(response.jsonPath().getInt("marks[3]"));
        System.out.println(response.jsonPath().getBoolean("isPassed"));
        System.out.println("response = " +   response.jsonPath().getList("marks"));
    }
}
