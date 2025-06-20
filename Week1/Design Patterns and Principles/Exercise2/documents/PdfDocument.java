package design_principle;

//PdfDocument.java
public class PdfDocument implements Doc {
 @Override
 public void open() {
     System.out.println("Opening PDF Document");
 }
}