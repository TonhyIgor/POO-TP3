package oop2.tp3.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    void testAgredBrie() {
        Item agedBrie = new Item("Aged Brie", 2, 10);
        Item agedBrie2 = new Item("Aged Brie", 0, 10);

        Item[] items = new Item[]{agedBrie, agedBrie2};
        var manejoItems = new ItemsAgedBrie(items);
        var manejos = new ManejoItems[]{manejoItems};

        GildedRose app = new GildedRose(manejos);
        app.updateQuality();
        assertEquals(11, agedBrie.quality);
        assertEquals(12, agedBrie2.quality);
    }

    @Test
    void testBackstage() {
        Item backstage15 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 12);
        Item backstage9 = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 12);
        Item backstage4 = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 12);
        Item backstage0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 12);

        Item[] items = new Item[]{backstage15, backstage9, backstage4, backstage0};
        var manejoItems = new ItemBackstage(items);
        var manejos = new ManejoItems[]{manejoItems};

        GildedRose app = new GildedRose(manejos);
        app.updateQuality();

        assertEquals(13, backstage15.quality);
        assertEquals(14, backstage9.quality);
        assertEquals(15, backstage4.quality);
        assertEquals(0, backstage0.quality);
    }

    @Test
    void testSulfuras() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 20);

        Item[] items = new Item[]{sulfuras};
        var manejoItems = new ItemSulfura(items);
        var manejos = new ManejoItems[]{manejoItems};

        GildedRose app = new GildedRose(manejos);
        app.updateQuality();
        assertEquals(0, sulfuras.sellIn);
        assertEquals(20, sulfuras.quality);
    }

    @Test
    void testConjured() {
        Item conjured = new Item("Conjured", 3, 30);

        Item[] items = new Item[]{conjured};
        var manejoItems = new ItemConjured(items);

        var manejos = new ManejoItems[]{manejoItems};

        GildedRose app = new GildedRose(manejos);
        app.updateQuality();

        assertEquals(2, conjured.sellIn);
        assertEquals(28, conjured.quality);
    }

    @Test
    void testTotal() {
        //items aged
        Item agedBrie = new Item("Aged Brie", 2, 10);
        Item agedBrie2 = new Item("Aged Brie", 0, 10);

        //items backstage
        Item backstage15 = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 12);
        Item backstage9 = new Item("Backstage passes to a TAFKAL80ETC concert", 9, 12);
        Item backstage4 = new Item("Backstage passes to a TAFKAL80ETC concert", 4, 12);
        Item backstage0 = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 12);

        //items sulfura
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 20);

        //items conjured
        Item conjured = new Item("Conjured", 3, 30);

        //listas de items
        Item[] itemsAgedBrie = new Item[]{agedBrie, agedBrie2};
        var manejoAgedBrie = new ItemsAgedBrie(itemsAgedBrie);

        Item[] itemsBackstage = new Item[]{backstage15, backstage9, backstage4, backstage0};
        var manejoBackstage = new ItemBackstage(itemsBackstage);

        Item[] itemsSulfura = new Item[]{sulfuras};
        var manejoSulfura = new ItemSulfura(itemsSulfura);

        Item[] itemsConjured = new Item[]{conjured};
        var manejoConjured = new ItemConjured(itemsConjured);

        var manejos = new ManejoItems[]{manejoAgedBrie, manejoBackstage, manejoSulfura, manejoConjured};

        GildedRose app = new GildedRose(manejos);
        app.updateQuality();

        assertEquals(11, agedBrie.quality);
        assertEquals(12, agedBrie2.quality);
        assertEquals(13, backstage15.quality);
        assertEquals(14, backstage9.quality);
        assertEquals(15, backstage4.quality);
        assertEquals(0, backstage0.quality);
        assertEquals(0, sulfuras.sellIn);
        assertEquals(20, sulfuras.quality);
        assertEquals(2, conjured.sellIn);
        assertEquals(28, conjured.quality);
    }
}
