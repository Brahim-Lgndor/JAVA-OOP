package fileManager;

//Management Class
import java.util.ArrayList;

public class FileManager {
 private ArrayList<Document> fileList = new ArrayList<>();

 public void addFile(Document d) {
     fileList.add(d);
 }

 public void openFile(String id, String token) throws UnauthorizedAccessException {
     for (Document doc : fileList) {
         if (doc.getFileId().equals(id)) {
             // Check if the document implements security
             if (doc instanceof Authenticatable) {
                 Authenticatable secureDoc = (Authenticatable) doc;
                 if (secureDoc.verifyAccess(token)) {
                     secureDoc.logAccess(doc.getOwner());
                     doc.generatePreview();
                     return;
                 } else {
                     throw new UnauthorizedAccessException("Invalid security token for file: " + id);
                 }
             }
         }
     }
     System.out.println("File not found.");
 }
}