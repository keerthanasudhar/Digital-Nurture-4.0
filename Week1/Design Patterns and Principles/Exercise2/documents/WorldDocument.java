package design_principle;

//WordDocument.java
public class WordDocument implements Doc {
 @Override
 public void open() {
     System.out.println("Opening Word Document");
 }
}