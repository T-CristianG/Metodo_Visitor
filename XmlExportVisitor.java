public class XmlExportVisitor {

    public String export(Object nodo) {
        if (nodo instanceof Ciudad) {
            return exportCiudad((Ciudad) nodo);
        } else if (nodo instanceof Pais) {
            return exportPais((Pais) nodo);
        } else if (nodo instanceof PuntoReferencia) {
            return exportPunto((PuntoReferencia) nodo);
        }
        throw new IllegalArgumentException("Tipo de nodo no soportado: " + nodo.getClass());
    }

    private String exportCiudad(Ciudad ciudad) {
        return "<ciudad>" + ciudad.getNombre() + "</ciudad>";
    }

    private String exportPais(Pais pais) {
        return "<pais>" + pais.getNombre() + "</pais>";
    }

    private String exportPunto(PuntoReferencia punto) {
        return "<punto>" + punto.getDescripcion() + "</punto>";
    }
}
