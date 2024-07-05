/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;

import jakarta.inject.Named;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import Dao.DocumentDao;
import entity.Document;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author gbara
 */
@Named
@SessionScoped
public class DocumentBean implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private Document document;
    private List<Document> documentList;
    private DocumentDao documentDao;
    
    private Part doc;
    
    private final String uploadTo="C:\\Users\\gbara\\upload\\";

    public String getUploadTo() {
        return uploadTo;
    }
    
    
    
    public DocumentBean() {
    }

    public void upload(){
         try {
            if (doc != null) {
                InputStream input = doc.getInputStream();
                File file = new File(uploadTo + doc.getSubmittedFileName());
                Files.copy(input, file.toPath());
                // Save file details to database
                Document document = new Document();
                document.setFilePath(file.getParent());
                document.setFileName(file.getName());
                document.setFileType(doc.getContentType());
                this.getDocumentDao().insert(document);
            } else {
                System.out.println("Dosya seçilmedi.");
            }
        } catch (Exception e) {
            System.out.println("Yükleme hatası: " + e.getMessage());
        }
        
    }
    public Document getDocument() {
        if(this.document==null)
            this.document=new Document();
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<Document> getDocumentList() {
        if(this.documentList==null)
            this.documentList=this.getDocumentDao().findAll();
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public DocumentDao getDocumentDao() {
        if(this.documentDao==null)
            this.documentDao=new DocumentDao();
        return documentDao;
    }

    public void setDocumentDao(DocumentDao documentDao) {
        this.documentDao = documentDao;
    }

    public Part getDoc() {
        return doc;
    }

    public void setDoc(Part doc) {
        this.doc = doc;
    }
    
    
    
    
    
}
