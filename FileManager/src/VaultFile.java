package fileManager;

public class VaultFile extends Document implements Authenticatable {
    private int encryptionLevel;

    public VaultFile(String id, String name, String owner, double size, String date, int level) {
        super(id, name, owner, size, date);
        this.encryptionLevel = level;
    }

    @Override
    public void generatePreview() {
        System.out.println("ACCESS DENIED: File is encrypted at level " + encryptionLevel);
    }

    @Override
    public boolean verifyAccess(String securityToken) {
        return "ADMIN_123".equals(securityToken);
    }

    @Override
    public void logAccess(String user) {
        System.out.println("SECURITY ALERT: Vault access attempted by " + user);
    }
}    