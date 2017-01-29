import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FbMain {

	public static void main(String[] args) {
		
		String accessToken = ""; //get access token from developers.facebook.com
		FacebookClient fbClient  = new DefaultFacebookClient(accessToken);
		
		User me = fbClient.fetchObject("me",User.class);
		System.out.println(me.getFirstName());
		System.out.println(me.getBirthday());
		
		for(int i=0;i<me.getLanguages().size();i++){
			System.out.println(me.getLanguages().get(i).getName());
		}
		
		
	}

}
