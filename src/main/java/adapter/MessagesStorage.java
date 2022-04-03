package adapter;

import adapter.model.Message;

import java.io.File;
import java.util.List;

public interface MessagesStorage {

    List<Message> getMessages(File file);

    // TODO: implement saveMessages(File file) method for more functionality

}
