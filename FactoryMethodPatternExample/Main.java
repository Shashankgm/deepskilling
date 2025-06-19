public class Main {
    public static void main(String[] args) {
DocumentFactory factory1 = new WordFactory();
        Maindoc wordDoc = factory1.createMaindoc();
        wordDoc.open();
         DocumentFactory factory2 = new  PdfFactory();
        Maindoc pdfDoc = factory2.createMaindoc();
        pdfDoc.open();
   DocumentFactory factory3 = new ExcelFactory();
        Maindoc exceldoc = factory3.createMaindoc();
        exceldoc.open();
    }
}
