import com.api.enums.Econfig;
import com.api.utilities.ConfigReader;
import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetTests {

    @Test
    public void getTest(){
        Response response = given()
                .baseUri(ConfigReader.getValue(Econfig.BASE_URI))
                .get("/students");

       assertThat(response.statusCode())
                .isEqualTo(200);
       assertThat(response.jsonPath().getMap("$").size())
               .isPositive()
               .isGreaterThanOrEqualTo(7);
    }
}
