import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.*;



public class JsonConverter {
	
	public static Map convert(String filePath) throws IOException
	{
		filePath = "C:/Users/Peyton/Desktop/jsonmap.json";
		
		Gson g = new Gson(); 
		
		String jsonText = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);

		Map newMap = g.fromJson(jsonText, Map.class);
		
		
		return newMap;

	}

}
