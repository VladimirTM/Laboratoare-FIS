package loose.oose.fis.documents;

import java.util.ArrayList;
import java.util.List;

public class XML extends Document{

    public XML(List<String>secventa) {
        super(secventa);
    }

    public List<String> analizeaza() {
        List<String> aux = new ArrayList<>();
        for (String sir : getSecventaCaractere()) {
            if(!sir.contains("<")) {
                aux.add(sir);
            }
        }
        return aux;
    }

    public String toString() {
        return "XML " + super.toString();
    }
}
