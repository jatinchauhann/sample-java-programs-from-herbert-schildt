import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = new String[100];
		System.out.println("Enter Lines of Text");
		System.out.print("Enter \"stop\" to Quit\n");
		for (int i = 0; i < 100; i++) {
			str[i] = br.readLine();
			if (str[i].equals("stop"))
				break;
		}

		System.out.println("\nFile:");
		for (int i = 0; i < 100; i++) {
			if (str[i].equals("stop"))
				break;
			System.out.println(str[i]);
		}
	}
}
