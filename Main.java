import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creamos el grafo con distintos tipos de nodos
        List<Object> grafo = new ArrayList<>();
        grafo.add(new Ciudad("Medellín"));
        grafo.add(new Pais("Colombia"));
        grafo.add(new PuntoReferencia("Parque Tayrona"));

        // Creamos el visitante
        XmlExportVisitor exportador = new XmlExportVisitor();

        // Exportamos a XML
        StringBuilder xmlFinal = new StringBuilder("<grafo>\n");
        for (Object nodo : grafo) {
            xmlFinal.append("  ").append(exportador.export(nodo)).append("\n");
        }
        xmlFinal.append("</grafo>");

        // Mostramos el resultado
        System.out.println(xmlFinal.toString());
    }
}
