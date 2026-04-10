package fileManager;

public class ImageFile extends Document implements Authenticatable {
	

	private String resolution;
	
	
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public String getResolution() {
		return resolution;
	}
	
	public ImageFile(String id, String name, String owner, double size, String date,String resolution) {
		super(id, name, owner, size, date);
		this.resolution = resolution;
	}
	
	public void generatePreview(){
		System.out.println( "Displaying thumbnail for:" + getFileName());
	}
	
	public boolean verifyAccess(String securityToken) {
		return securityToken != null && securityToken.length() > 5;
	}

	public void logAccess(String user) {
		System.out.println("User " + user + " accessed image " + getFileName());
	}
}
