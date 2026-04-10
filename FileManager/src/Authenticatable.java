package fileManager;

public interface Authenticatable {
	boolean verifyAccess(String securityToken);
	void logAccess(String user);
}
