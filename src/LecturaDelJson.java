import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class LecturaDelJson {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Criptomoneda cripto =
                    mapper.readValue(new File("./src/Crypto.json"), Criptomoneda.class);
            System.out.println(cripto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
