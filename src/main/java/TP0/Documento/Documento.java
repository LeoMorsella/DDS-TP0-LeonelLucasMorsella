package TP0.Documento;

import TP0.Documento.TipoDocumento;
import TP0.Item.Item;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private static  ArrayList<Item> items;
    private static  TipoDocumento tipo;
    private static int importeTotal;

    public Documento(ArrayList<Item> items, TipoDocumento tipo, int importeTotal) {
        this.items = items;
        this.tipo = tipo;
        this.importeTotal = importeTotal;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }
    public ArrayList<Item> getItems() {return items;}
    public int getImporteTotal() {return importeTotal;}



}
