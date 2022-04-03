package adapter.parser;

import adapter.model.Message;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

// Assume: Not reachable class
public class JsonParser {

    ObjectMapper objectMapper = new ObjectMapper();

    public List<Message> parseJson(File file) {
        try {
            return objectMapper.readValue(file, new TypeReference<List<Message>>() {
            });
        } catch (IOException ioe) {
            throw new RuntimeException("File isn't reachable !", ioe);
        }
    }

}
