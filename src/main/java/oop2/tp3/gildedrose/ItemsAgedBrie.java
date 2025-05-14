package oop2.tp3.gildedrose;

public class ItemsAgedBrie extends DefaultItem {
    public static final int DIAS_MINIMOS_PARA_VENTA = 0;
    public static final int CALIDAD_MAXIMA = 50;
    public static final int CALIDAD_MINIMA = 0;
    public static final int AUMENTO_CALIDAD_DOBLE = 2;

    public ItemsAgedBrie(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    private static boolean leFaltaCalidad(DefaultItem item) {
        return item.quality < CALIDAD_MAXIMA;
    }

    private static boolean seQuedoSinDias(DefaultItem item) {
        return item.sellIn <= DIAS_MINIMOS_PARA_VENTA;
    }

    @Override
    void actualizarArticulo(DefaultItem item) {
        item.quality++;
    }

    @Override
    void actualizarArticuloExpirado(DefaultItem item) {
        if (leFaltaCalidad(item)) {
            item.quality = item.quality + AUMENTO_CALIDAD_DOBLE;
        }
    }
}
