package adapter;

import adapter.entity.Message;

import java.io.File;
import java.util.List;

public interface Portable {

    List<Message> getMessages(File file);

    // TODO: implement saveMessages(File file) method for more functionality

}
