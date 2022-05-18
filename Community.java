import java.util.ArrayList;
import java.util.Scanner;

public class Community implements Interface{
	private String creator;
	private String communityname;
	private String description;
	public ArrayList<String> communityusers = new ArrayList<String>();

	public Community() {

	}

	public Community(String creator, String communityname, String description, ArrayList<String> communityusers) {
		this.creator = creator;
		this.communityname = communityname;
		this.description = description;
		this.communityusers = communityusers;
	}

	public void CreateNewCommunity(String creatorcommunity) {
		
		Scanner scanner = new Scanner(System.in);
		
		creator = creatorcommunity;
		
		communityusers.add(creatorcommunity);
		
		System.out.println("Hi! Choose a name to your Community:");
		
		communityname = scanner.nextLine();
		
		System.out.println("Now, give a description to your community:");
		
		description = scanner.nextLine();
		
		System.out.println("\nNice! Community created!");
		
	}
	
	public void ShowCommunity() {
		
		int i;
		
		System.out.println("\n" + this.communityname.toUpperCase());
		System.out.println("--------------------------\n");
		System.out.println("Created by: " + this.creator);
		System.out.println("Description: " + this.description);
		System.out.println("Members:");
		for(i = 0; i < communityusers.size(); i++) {
			System.out.println("   " + communityusers.get(i));
		}
		
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCommunityname() {
		return communityname;
	}

	public void setCommunityname(String communityname) {
		this.communityname = communityname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getCommunityusers() {
		return communityusers;
	}

	public void setCommunityusers(ArrayList<String> communityusers) {
		this.communityusers = communityusers;
	}


	@Override
	public String getId() {
		return communityname;
	}
}