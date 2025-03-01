package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

import java.util.List;

public class ProcesorCompus extends Procesor{
    private List<Procesor> listaProcesoare;

    public ProcesorCompus(List<Procesor> listaProcesoare) {
        this.listaProcesoare = listaProcesoare;
    }

    public int proceseaza(List<Document> lista) {
        int count = 0;
        for(Procesor procesor: listaProcesoare) {
            count = count + procesor.proceseaza(lista);
        }
        return count;
    }
}
