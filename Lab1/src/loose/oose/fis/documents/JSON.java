package loose.oose.fis.documents;

import java.util.ArrayList;
import java.util.List;

public class JSON extends Document{

    public JSON(List<String> secventa) {
        super(secventa);
    }

    public List<String> analizeaza() {
        List<String> aux = new ArrayList<>();
        for (String sir : getSecventaCaractere()) {
            if(!sir.contains(":")) {
                aux.add(sir);
            }
        }
        return aux;
    }

    public String toString() {
        return "JSON " + super.toString();
    }
}
