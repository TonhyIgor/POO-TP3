package oop2.tp3.gildedrose;

public class ItemBackstage implements ManejoItems {
    public static final int CALIDAD_MAXIMA = 50;
    public static final int CANTIDAD_DIAS_INCREMENTO_NORMAL = 10;
    public static final int CANTIDAD_DIAS_INCREMENTO_DOBLE = 5;
    public static final int INCREMENTO_CALIDAD_DOBLE = 2;
    public static final int DIAS_MINIMOS_PARA_VENTA = 0;
    public static final int INCREMENTO_CALIDAD_TRIPLE = 3;
    public static final int CALIDAD_MINIMA = 0;
    private Item[] items;

    public ItemBackstage(Item[] items) {
        this.items = items;
    }

    @Override
    public void actualizarItems() {
        for (Item item : items) {
            if (item.quality <= CALIDAD_MAXIMA) {
                if (item.sellIn > CANTIDAD_DIAS_INCREMENTO_NORMAL) {
                    item.quality++;
                }
                if (item.sellIn > CANTIDAD_DIAS_INCREMENTO_DOBLE && item.sellIn <= CANTIDAD_DIAS_INCREMENTO_NORMAL) {
                    item.quality = item.quality + INCREMENTO_CALIDAD_DOBLE;
                }
                if (item.sellIn <= CANTIDAD_DIAS_INCREMENTO_DOBLE && item.sellIn > DIAS_MINIMOS_PARA_VENTA) {
                    item.quality = item.quality + INCREMENTO_CALIDAD_TRIPLE;
                }
                if (item.sellIn == DIAS_MINIMOS_PARA_VENTA) {
                    item.quality = CALIDAD_MINIMA;
                }
                item.sellIn--;
                if (item.quality < CALIDAD_MINIMA) {
                    item.quality = CALIDAD_MINIMA;
                }
            }
        }
    }
}
