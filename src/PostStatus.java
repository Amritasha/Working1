import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;

public class PostStatus {

	public static void main(String[] args) {
		String accessToken = "";
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		FacebookType response = fbClient.publish("me/feed", FacebookType.class, Parameter.with("message","Working"));
		
		System.out.println("fb.com/"+response.getId());
	}

}
