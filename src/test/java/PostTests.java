import com.api.constants.FrameworkConstants;
import com.api.requestbodiespojos.StudentsWithLombok;
import com.api.requestbodiespojos.StudentsWithoutLombok;
import com.api.requestbuilders.RequestDetailsBuilder;
import static com.api.utilities.RandomProvider.*;

import com.api.utilities.ApiUtils;
import org.testng.annotations.Test;

public class PostTests {

    @Test
    public void postCall(){

        StudentsWithoutLombok reqBody = StudentsWithoutLombok.builder()
                .setId(randomId())
                .setName(randomFirstName())
                .and()
                .setCGPA(randomNumberList(Integer.class))
                .with()
                .setPassed(randomBoolean())
                .build();
        System.out.println(reqBody.toString());

        RequestDetailsBuilder.postCalls()
                .body(reqBody)
                .post("/students");
    }

    @Test
    public void postCallWithLombokReqBody(){

        StudentsWithLombok reqBody = StudentsWithLombok.builder()
                .setId(randomId())
                .setName(randomFirstName())
                .setCGPA((randomNumberList(Double.class)))
                .setIsPassed(randomBoolean())
                .build();

        RequestDetailsBuilder.postCalls()
                .body(reqBody)
                .post("/students");

    }
    @Test
    public void postCallWithExternalFile() {

        RequestDetailsBuilder.postCalls()
                .body(ApiUtils.readJsonReturnAsString(FrameworkConstants.getEXT_REQ_FILE_PATH()))
                .post("/students");

    }



}
