import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class FbMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accessToken = "EAACEdEose0cBAJuf5dBOyegrpM7RofiK5HZCvJQ5q8Utw4ThZAyfQZAzahisgrwHDHOqXWpZAIYo6FBfZABiREDydi36mvpBJtxlQmRkDgBtQ7ZBnZASA9ZCAHahKUVZA8hVMJGNZCoZArTHGejdlmrFoRTZChBZCUnwwsnyPBHwZCTAJ0Nr2GaKlUSIbR7XaOa3BH7ooZD";
		FacebookClient fbClient  = new DefaultFacebookClient(accessToken);
		
		User me = fbClient.fetchObject("me",User.class);
		System.out.println(me.getFirstName());
		System.out.println(me.getBirthday());
		
		for(int i=0;i<me.getLanguages().size();i++){
			System.out.println(me.getLanguages().get(i).getName());
		}
		
		
	}

}
