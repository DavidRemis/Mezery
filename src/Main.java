import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		File f = new File("M:\\Programovani\\Mezery\\src\\lm.txt");
		String content = new String(Files.readAllBytes(Paths.get(f.getPath())));
		int whitespace = 0;
		for (int i = 0; i < content.length(); i++) {
			if (content.toCharArray()[i] + 0 == 32) {
				whitespace++;
			}
		}

		System.out.println(whitespace);
		
	}

}
