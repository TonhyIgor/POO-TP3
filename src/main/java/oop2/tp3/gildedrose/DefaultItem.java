package oop2.tp3.gildedrose;

public abstract class DefaultItem extends Item {
    public static final int CALIDAD_MAXIMA = 50;
    public static final int DIAS_MINIMOS_PARA_VENTA = 0;
    public static final int CALIDAD_MINIMA = 0;

    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    void actualizar(DefaultItem item) {
        if (quedanDiasParaLaVenta(item) && tieneCalidad(item)) {
            actualizarArticulo(item);
            if (laCalidadLlegoAlMinimo(item)) {
                item.quality = CALIDAD_MINIMA;
            }
        }
        if (!quedanDiasParaLaVenta(item)) {
            actualizarArticuloExpirado(item);
        }
        item.sellIn--;
    }

    abstract void actualizarArticulo(DefaultItem item);

    abstract void actualizarArticuloExpirado(DefaultItem item);

    private boolean tieneCalidad(DefaultItem item) {
        return item.quality <= CALIDAD_MAXIMA;
    }

    private boolean quedanDiasParaLaVenta(DefaultItem item) {
        return item.sellIn > DIAS_MINIMOS_PARA_VENTA;
    }

    private boolean laCalidadLlegoAlMinimo(DefaultItem item) {
        return item.quality < CALIDAD_MINIMA;
    }
}
