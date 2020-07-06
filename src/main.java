import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException, ContentNotFoundException {
		FindContent f = new FindContent();
		try {
			String result = f.readFile("sample.txt","asasa");
		       System.out.println("Word Found: "+result);     
		}
		catch(ContentNotFoundException e) {
			 System.out.println(e.getMessage());
		}
	}
}
