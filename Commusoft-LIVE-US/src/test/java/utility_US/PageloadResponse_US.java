package utility_US;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import action.Baseclass;
import action_US.Baseclass_US;
import io.restassured.RestAssured;

public class PageloadResponse_US extends Baseclass_US {
	
	public static boolean pageresponse(WebDriver driver,String URLName )
	{
		    try {
		      HttpURLConnection.setFollowRedirects(false);
		      HttpURLConnection con =
		         (HttpURLConnection) new URL(URLName).openConnection();
		      con.setRequestMethod("HEAD");
		      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
		    }
		    catch (Exception e) {
		       e.printStackTrace();
		       return false;
		    }
		  }
	public int httpResponseCodeViaGet(String url) {
        return RestAssured.get(url).statusCode();
}	
//
//public int httpResponseCodeViaPost(String url) {
//    return RestAssured.post(url).statusCode();
//}
//
//public static void main(String args[]) {
//    new HttpResponseCode().httpResponseCodeViaGet("http://www.google.com");
//}

}
