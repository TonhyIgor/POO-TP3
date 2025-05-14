package oop2.tp3.gildedrose;

public class ItemsAgedBrie implements ManejoItems {
    public static final int DIAS_MINIMOS_PARA_VENTA = 0;
    public static final int CALIDAD_MAXIMA = 50;
    public static final int CALIDAD_MINIMA = 0;
    public static final int AUMENTO_CALIDAD_DOBLE = 2;
    private Item[] items;

    public ItemsAgedBrie(Item[] items) {
        this.items = items;
    }

    @Override
    public void actualizarItems() {
        for (Item item : items) {
            if (item.sellIn > DIAS_MINIMOS_PARA_VENTA && item.quality <= CALIDAD_MAXIMA) {
                item.quality++;
            }
            if (item.sellIn <= DIAS_MINIMOS_PARA_VENTA && item.quality <= CALIDAD_MAXIMA) {
                item.quality = item.quality + AUMENTO_CALIDAD_DOBLE;
            }
            if (item.quality < CALIDAD_MINIMA) {
                item.quality = CALIDAD_MINIMA;
            }
            item.sellIn--;
        }
    }
}
