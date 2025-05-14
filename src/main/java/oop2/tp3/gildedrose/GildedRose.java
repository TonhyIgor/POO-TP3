package oop2.tp3.gildedrose;

class GildedRose {
    private ManejoItems[] manejadorItems;

    public GildedRose(ManejoItems[] manejadorItems) {
        this.manejadorItems = manejadorItems;
    }

    public void updateQuality() {
        for (ManejoItems manejador : manejadorItems) {
            manejador.actualizarItems();
        }
    }
}