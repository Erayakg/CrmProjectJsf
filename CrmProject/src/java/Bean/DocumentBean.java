/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Bean;

import Dao.DocumentDao;
import entity.Document;

import jakarta.ejb.EJB;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author gbara
 */
@Named
@SessionScoped
public class DocumentBean implements Serializable {

    private Document document;
    private List<Document> documentList;

    @EJB
    private DocumentDao documentDao;

    private Part doc;

    private final String uploadTo = "C:\\Users\\gbara\\upload\\";

    public String getUploadTo() {
        return uploadTo;
    }

    public DocumentBean() {
    }

    public Document upload() {
        
        try {

            InputStream input = doc.getInputStream();
            File file = new File(uploadTo + doc.getSubmittedFileName());
            Files.copy(input, file.toPath());
            
            Document document = new Document();
            document.setFilePath(file.getParent());
            document.setFileName(file.getName());
            document.setFileType(doc.getContentType());
            
            return getDocumentDao().insertDocument(document);


        } catch (Exception e) {
            System.out.println("Yükleme hatası: " + e.getMessage());
        }
        return null;

    }

    public Document getDocument() {
        if (this.document == null) {
            this.document = new Document();
        }
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<Document> getDocumentList() {
        if (this.documentList == null) {
            this.documentList = this.getDocumentDao().findAll();
        }
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public DocumentDao getDocumentDao() {
        
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
