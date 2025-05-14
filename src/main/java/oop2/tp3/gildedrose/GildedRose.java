package oop2.tp3.gildedrose;

class GildedRose {
    private DefaultItem[] items;

    public GildedRose(DefaultItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (DefaultItem item : items) {
            item.actualizar(item);
        }
    }
}