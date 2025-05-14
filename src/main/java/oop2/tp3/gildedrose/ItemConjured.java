package oop2.tp3.gildedrose;

public class ItemConjured extends DefaultItem {
    public static final int DECREMENTO_CALIDAD_NORMAL = 2;
    public static final int DECREMENTO_CALIDAD_EXTRA = 4;

    public ItemConjured(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    void actualizarArticulo(DefaultItem item) {
        item.quality = item.quality - DECREMENTO_CALIDAD_NORMAL;
    }

    @Override
    void actualizarArticuloExpirado(DefaultItem item) {
        item.quality = item.quality - DECREMENTO_CALIDAD_EXTRA;
    }
}
