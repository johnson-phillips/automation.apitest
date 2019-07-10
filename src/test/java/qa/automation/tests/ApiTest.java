package qa.automation.tests;

import org.testng.annotations.Test;
import qa.automation.core.Api;
import qa.automation.report.TestData;
import java.util.UUID;

import static io.restassured.RestAssured.given;
import static qa.automation.core.Api.readResponse;

public class ApiTest {

    @Test
    public void Test1() throws Exception
    {
        TestData.startTest("first test",1);
        Api.printconsole = true;
        readResponse(given().body("{\"name\":\""+ UUID.randomUUID().toString() +"\",\"salary\":\"123\",\"age\":\"23\"}").post("http://dummy.restapiexample.com/api/v1/create"));
        TestData.endTest();
    }
}
