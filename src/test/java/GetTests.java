import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetTests {

    @Test
    public void getTest(){
        Response response = given()
                .baseUri("http://localhost:3000/")
                .get("/students");

       assertThat(response.statusCode())
                .isEqualTo(200);
    }
}
