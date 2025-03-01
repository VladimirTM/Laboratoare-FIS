package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

import java.util.List;

public class ProcesorCautare extends Procesor{
    private String text;

    public ProcesorCautare(String text) {
        this.text = text;
    }

    public int proceseaza(List<Document>lista) {
        int count = 0;
        for(Document document: lista) {
            List<String>secventa = document.analizeaza();
            for(String string: secventa) {
                if(text.equals(string)) {
                    count++;
                }
            }
        }
        return count;
    }
}
