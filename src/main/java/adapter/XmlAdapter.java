package adapter;

import adapter.entity.Message;
import adapter.parser.XmlParser;

import java.io.File;
import java.util.List;

public class XmlAdapter implements Portable {

    private final XmlParser xmlParser;

    public XmlAdapter(XmlParser xmlParser) {
        this.xmlParser = xmlParser;
    }

    @Override
    public List<Message> getMessages(File file) {
        return xmlParser.parseXml(file);
    }

}
