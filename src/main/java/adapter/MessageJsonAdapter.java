package adapter;

import adapter.model.Message;
import adapter.parser.JsonParser;
import java.io.File;

import java.util.List;

public class MessageJsonAdapter implements MessagesStorage {

    private final JsonParser jsonParser;

    public MessageJsonAdapter(JsonParser jsonParser) {
        this.jsonParser = jsonParser;
    }

    @Override
    public List<Message> getMessages(File file) {
        return jsonParser.parseJson(file);
    }

}
