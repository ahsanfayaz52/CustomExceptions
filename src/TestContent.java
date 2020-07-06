import static org.junit.jupiter.api.Assertions.*; 
import java.io.IOException; 
import org.junit.jupiter.api.Test;

class TestContent {

	@Test
	void test1() {
		String word = "ahsan";
		FindContent f = new FindContent(); 
		
		try {
			assertEquals(word,f.readFile("sample.txt",word));
		} catch (IOException | ContentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("test case 1:"+e.getMessage());
		}
	}
	
	@Test
	void test2() {
		String word = "a";
		FindContent f = new FindContent(); 
		
		try {
			assertEquals(word,f.readFile("sample.txt",word));
		} catch (IOException | ContentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("test case 2:"+e.getMessage());
		}
	}
}
