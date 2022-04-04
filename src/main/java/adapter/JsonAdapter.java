package adapter;

import adapter.entity.Message;
import adapter.parser.JsonParser;
import java.io.File;

import java.util.List;

public class JsonAdapter implements Portable {

    private final JsonParser jsonParser;

    public JsonAdapter(JsonParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    @Override
    public List<Message> getMessages(File file) {
        return jsonParser.parseJson(file);
    }

}
