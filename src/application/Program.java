package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		
		String[] lines = new String[]{" Bom dia "  , " Boa Tarde " ," Boa Noite"};
		String path = "c:\\desc\\dx.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){  // path sozinho cria/recria| path,true rescreve
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
