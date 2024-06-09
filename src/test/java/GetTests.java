import com.api.requestBuilders.RequestDetailsBuilder;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetTests {

    @Test
    public void getTest(){
        Response response = RequestDetailsBuilder.getCalls()
                .get("/students");
        response.prettyPrint();
        System.out.println(response.statusCode());
        System.out.println(response.jsonPath().getMap("Addresses[0]"));
        System.out.println(response.jsonPath().getString("Addresses[0].street"));
        System.out.println(response.jsonPath().getInt("marks[3]"));
        System.out.println(response.jsonPath().getBoolean("isPassed"));

        System.out.println("response = " +   response.jsonPath().getList("marks"));
    }
}
