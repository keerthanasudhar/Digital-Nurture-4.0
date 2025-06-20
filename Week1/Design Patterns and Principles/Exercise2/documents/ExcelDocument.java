package design_principle;

//ExcelDocument.java
public class ExcelDocument implements Doc {
 @Override
 public void open() {
     System.out.println("Opening Excel Document");
 }
}