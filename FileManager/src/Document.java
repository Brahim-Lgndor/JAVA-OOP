package fileManager;

public abstract class Document {
	private String fileId;
	private String fileName;
	private String owner;
	private double fileSize;
	private String uploadDate;
	
	public Document(String id,String name,String owner,double size,String date) {
		this.fileId = id;
		this.fileName = name;
		this.owner = owner;
		this.fileSize = size;
		this.uploadDate = date;
		}
	
	public void setFileId(String id) {
		this.fileId = id;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	public double getFileSize() {
		return fileSize;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	
	public abstract void generatePreview();
	
	
	
	

}
