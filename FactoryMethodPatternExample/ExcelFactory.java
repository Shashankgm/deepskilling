public class ExcelFactory extends DocumentFactory {
    @Override
    public Maindoc createMaindoc(){
        return new ExcelDocument();
    }
}
