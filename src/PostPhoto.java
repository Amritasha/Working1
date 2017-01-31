import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.restfb.BinaryAttachment;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.types.FacebookType;

public class PostPhoto {
	public static void main(String args[]) throws FileNotFoundException{
		String accessToken = "";
		FacebookClient fbClient = new DefaultFacebookClient(accessToken);
		FileInputStream file = new FileInputStream(new File("#file_path"));
		
		FacebookType res = fbClient.publish("me/photos", FacebookType.class, BinaryAttachment.with("image.jpg", file), Parameter.with("message", "Done"));
		//same for video  me/videos
		System.out.println("fb.com/"+res.getId());
	}
}
