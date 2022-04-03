package adapter;

import adapter.model.Message;
import adapter.parser.XmlParser;

import java.io.File;
import java.util.List;

public class MessageXmlAdapter implements MessagesStorage {

    private final XmlParser xmlParser;

    public MessageXmlAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public List<Message> getMessages(File file) {
        return xmlParser.parseXml(file);
    }

}
