package oop2.tp3.gildedrose;

public class ItemBackstage extends DefaultItem {
    public static final int CALIDAD_MAXIMA = 50;
    public static final int CANTIDAD_DIAS_INCREMENTO_NORMAL = 10;
    public static final int CANTIDAD_DIAS_INCREMENTO_DOBLE = 5;
    public static final int INCREMENTO_CALIDAD_DOBLE = 2;
    public static final int DIAS_MINIMOS_PARA_VENTA = 0;
    public static final int INCREMENTO_CALIDAD_TRIPLE = 3;
    public static final int CALIDAD_MINIMA = 0;

    public ItemBackstage(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    private boolean quedanDiasDeIncrementoTriple(DefaultItem item) {
        return item.sellIn <= CANTIDAD_DIAS_INCREMENTO_DOBLE && item.sellIn > DIAS_MINIMOS_PARA_VENTA;
    }

    private boolean quedanDiasDeIncrementoDoble(DefaultItem item) {
        return item.sellIn > CANTIDAD_DIAS_INCREMENTO_DOBLE && item.sellIn <= CANTIDAD_DIAS_INCREMENTO_NORMAL;
    }

    private boolean quedanDiasDeIncrementoNormal(DefaultItem item) {
        return item.sellIn > CANTIDAD_DIAS_INCREMENTO_NORMAL;
    }

    @Override
    void actualizarArticulo(DefaultItem item) {
        if (quedanDiasDeIncrementoNormal(item)) {
            item.quality++;
        }
        if (quedanDiasDeIncrementoDoble(item)) {
            item.quality = item.quality + INCREMENTO_CALIDAD_DOBLE;
        }
        if (quedanDiasDeIncrementoTriple(item)) {
            item.quality = item.quality + INCREMENTO_CALIDAD_TRIPLE;
        }
    }

    @Override
    void actualizarArticuloExpirado(DefaultItem item) {
        item.quality = CALIDAD_MINIMA;
    }
}
