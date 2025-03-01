package loose.oose.fis;

import loose.oose.fis.documents.Document;
import loose.oose.fis.documents.JSON;
import loose.oose.fis.documents.XML;
import loose.oose.fis.processors.Procesor;
import loose.oose.fis.processors.ProcesorCautare;
import loose.oose.fis.processors.ProcesorCompus;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Document xml = new XML(
                List.of("<tag1>", "value1", "</tag1>", "<tag2>", "value2", "</tag2>")
        );
        Document json = new JSON(
                List.of("key1:", "value1", ",", "key2:", "value2", ",", "key3:", "value3")
        );

        Procesor sp1 = new ProcesorCautare("value1");
        Procesor sp2 = new ProcesorCautare("value2");
        Procesor sp3 = new ProcesorCautare("value3");
        Procesor cp1 = new ProcesorCompus(List.of(sp1, sp2));
        Procesor cp2 = new ProcesorCompus(List.of(sp3, cp1));

        int result = cp2.proceseaza(List.of(xml, json));

        System.out.println(result);
    }
}
