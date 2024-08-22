package adaptor.samples;

public class Main {
    
}
public interface TextReader {
    String readText();
}

public class Book implements TextReader {
    private String text;

    public Book(String text) {
        this.text = text;
    }

    @Override
    public String readText() {
        return text;
    }
}

public class TextReaderAdapter {
    private TextReader textReader;

    public TextReaderAdapter(TextReader textReader) {
        this.textReader = textReader;
    }

    public String readTextFromFile() {
        return "Reading from file: " + textReader.readText();
    }
}