package adapter.parser;

import adapter.entity.Message;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

// Assume: Not reachable class
public class XmlParser {

    private final XmlMapper xmlMapper = new XmlMapper();

    public List<Message> parseXml(File file) {
        try {
            return xmlMapper.readValue(file, new TypeReference<List<Message>>() {
            });
        } catch (IOException ioe) {
            throw new RuntimeException("File isn't reachable !", ioe);
        }
    }

}
