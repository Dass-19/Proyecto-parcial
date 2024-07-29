import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class LecturaDelJson {
    public static void main(String[] args) {
        File archJson = new File("./src/Crypto.json");
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Cripto> crips = mapper.readValue(archJson, new TypeReference<List<Cripto>>() {});
            for (Cripto cripto : crips) {
                System.out.println(cripto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
