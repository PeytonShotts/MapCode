import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		
		Map jsonMap = JsonConverter.convert("C:/Users/Peyton/Desktop/jsonmap.json");
		System.out.println(jsonMap.width);
		System.out.println(jsonMap.height);
		
		int x = 42; int y = 41;
		
		System.out.println(jsonMap.layers[0].data[(100*y) + x]);
		
		byte[] testArray = ByteArrayConverter.convert(jsonMap);
		
		System.out.println(testArray[5]);
		
	}

}
