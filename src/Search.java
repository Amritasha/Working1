import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.User;

public class Search {

	public static void main(String[] args) {
		String accessToken = "EAACEdEose0cBABJZCV76gipKgS8HeyDJqyG7pxe8DlYjiq7Al9BPUXTyLAAKyZCbNdlsM7bOrjtTBKBCMTZC1ALxGfEZAPhZBZA2pDzMCijzt15FMOFZC5pcMKsWjxwV2Wih3HRtrZBHToHm65O9dn1ew0HIUc4hvA8ClT813TRB5ZBoZARIYCre001ZBvcd2ZArbaoZD";
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		Connection<User> results = fbClient.fetchConnection("search", User.class, Parameter.with("q", "apple"), Parameter.with("type", "page"));
				
		System.out.println(results.getData().size());
		for(int i=0;i<results.getData().size();i++){
			System.out.println(results.getData().get(i).getName());
		}
		
	}

}
