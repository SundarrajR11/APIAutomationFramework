
import com.api.requestBodiesPOJOs.StudentsWithLomback;
import com.api.requestBodiesPOJOs.StudentsWithoutLombak;
import com.api.requestBuilders.RequestDetailsBuilder;
import com.api.utilities.RandomProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class PostTests {

    @Test
    public void postCall(){

        StudentsWithoutLombak reqBody = StudentsWithoutLombak.builder()
                .setId(RandomProvider.randomId())
                .setName(RandomProvider.randomFirstName())
                .and()
                .setCGPA(List.of(1,2,3))
                .with()
                .setPassed(RandomProvider.randomBoolean())
                .build();
        System.out.println(reqBody.toString());

        RequestDetailsBuilder.postCalls()
                .queryParam("StudentsWithoutLombak.builder().getId()")
                .body(reqBody)
                .post("/students{id}");
    }
    @Test
    public void postCallWithLombakReqBody(){

        StudentsWithLomback reqBody = StudentsWithLomback.builder()
                .setId(RandomProvider.randomId())
                .setName(RandomProvider.randomFirstName())
                .setCGPA(RandomProvider.randomNumberList())
                .setIsPassed(RandomProvider.randomBoolean())
                .build();

        RequestDetailsBuilder.postCalls()
                .body(reqBody)
                .post("/students");
    }
}
