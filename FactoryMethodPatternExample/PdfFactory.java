public class PdfFactory extends DocumentFactory {
    @Override
    public  Maindoc createMaindoc() {
        return new PdfDocument();
    }
}
