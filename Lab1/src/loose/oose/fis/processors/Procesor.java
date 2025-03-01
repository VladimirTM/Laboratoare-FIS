package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

import java.util.List;

public abstract class Procesor {
    public abstract int proceseaza(List<Document> lista);
}
