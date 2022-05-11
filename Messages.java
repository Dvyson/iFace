import java.util.ArrayList;

public class Messages{
	
	private String messagename;
	public ArrayList<String> messages = new ArrayList<String>();

	public Messages() {

	}

	public Messages(String messagename, ArrayList<String> messages) {
		this.messagename = messagename;
		this.messages = messages;
	}

	public void ShowMessages() {
		int i;
		if(messages.size() > 0) {
			System.out.println("\nYour messages with " + messagename);
			for(i = 0; i < messages.size(); i++) {
				System.out.println(messages.get(i));
			}
		}
		else {
			System.out.println("Sorry! You haven't any message from " + this.messagename);
		}
	}

	public String getMessagename() {
		return messagename;
	}

	public void setMessagename(String messagename) {
		this.messagename = messagename;
	}

	public ArrayList<String> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<String> messages) {
		this.messages = messages;
	}
}