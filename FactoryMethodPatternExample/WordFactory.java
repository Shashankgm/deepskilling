public class WordFactory extends DocumentFactory {
    @Override
    public Maindoc createMaindoc(){
        return new WordDocument();
    }
}
