package loose.oose.fis.documents;

import java.util.List;

public abstract class Document {
    private List<String>secventaCaractere;

    public Document(List<String>secventaCaractere) {
        this.secventaCaractere = secventaCaractere;
    }

    public String toString() {
        return secventaCaractere.toString();
    }

    public List<String> getSecventaCaractere() {
        return secventaCaractere;
    }

    public abstract List<String> analizeaza();
}
