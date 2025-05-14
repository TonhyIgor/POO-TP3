package oop2.tp3.gildedrose;

public class ItemConjured implements ManejoItems {
    public static final int CALIDAD_MAXIMA = 50;
    public static final int DIAS_MINIMOS_PARA_VENTA = 0;
    public static final int DECREMENTO_CALIDAD_NORMAL = 2;
    public static final int DECREMENTO_CALIDAD_EXTRA = 4;
    public static final int CALIDAD_MINIMA = 0;
    private Item[] items;

    public ItemConjured(Item[] items) {
        this.items = items;
    }

    @Override
    public void actualizarItems() {
        for (Item item : items) {
            if (item.sellIn > DIAS_MINIMOS_PARA_VENTA && item.quality <= CALIDAD_MAXIMA) {
                item.quality = item.quality - DECREMENTO_CALIDAD_NORMAL;
                item.sellIn--;
                if (item.quality < CALIDAD_MINIMA) {
                    item.quality = CALIDAD_MINIMA;
                }
            }
            if (item.sellIn <= DIAS_MINIMOS_PARA_VENTA) {
                item.quality = item.quality - DECREMENTO_CALIDAD_EXTRA;
            }
        }
    }
}
