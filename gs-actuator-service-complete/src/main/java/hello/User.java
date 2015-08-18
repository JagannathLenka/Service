package hello;

public class User {
	
	private final long id;
	private final String userName;
	private final String userAddress;

	public User(long id, String userName, String userAddress) {
		this.id = id;
		this.userName = userName;
		this.userAddress = userAddress;
	}
	
	public long getId() {
		return this.id;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getUserAddress() {
		return this.userAddress;
	}
}
