import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindContent {
	public String readFile(String filename,String searchWord) throws IOException, ContentNotFoundException {
		FileInputStream fileStream = new FileInputStream(filename);
		BufferedReader br = new BufferedReader(new InputStreamReader(fileStream));

		String readLine;
		String wordMatched = null; 
		
		while ((readLine = br.readLine()) != null)   { 
		  String[] words = readLine.split(" ");
		  for (String word : words) {
			  if (word.contentEquals(searchWord)) {
				  wordMatched = word;
			  } 
		  }
		}
		if (wordMatched == null) {
			throw new ContentNotFoundException("Content doesnt exist in file");
		} 
		
		fileStream.close();
		return wordMatched;
	}
}
