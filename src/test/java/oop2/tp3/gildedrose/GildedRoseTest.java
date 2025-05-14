package oop2.tp3.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @Test
    void testAgedBrie() {
        var agedBrie = new ItemsAgedBrie("Aged Brie", 2, 10);
        var agedBrie2 = new ItemsAgedBrie("Aged Brie", 0, 10);

        var items = new DefaultItem[]{agedBrie, agedBrie2};

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, agedBrie.quality);
        assertEquals(12, agedBrie2.quality);
    }

    @Test
    void testBackstage() {
        var backstage15 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 15, 12);
        var backstage9 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 9, 12);
        var backstage4 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 4, 12);
        var backstage0 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 0, 12);

        var items = new DefaultItem[]{backstage15, backstage9, backstage4, backstage0};

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(13, backstage15.quality);
        assertEquals(14, backstage9.quality);
        assertEquals(15, backstage4.quality);
        assertEquals(0, backstage0.quality);
    }

    @Test
    void testSulfuras() {
        var sulfuras = new ItemSulfura("Sulfuras, Hand of Ragnaros", 0, 20);

        var items = new DefaultItem[]{sulfuras};

        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, sulfuras.sellIn);
        assertEquals(20, sulfuras.quality);
    }

    @Test
    void testConjured() {
        var conjured = new ItemConjured("Conjured", 3, 30);

        var items = new DefaultItem[]{conjured};

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals(2, conjured.sellIn);
        assertEquals(28, conjured.quality);
    }

    @Test
    void testTotal() {
        //items aged
        var agedBrie = new ItemsAgedBrie("Aged Brie", 2, 10);
        var agedBrie2 = new ItemsAgedBrie("Aged Brie", 0, 10);

        //items backstage
        var backstage15 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 15, 12);
        var backstage9 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 9, 12);
        var backstage4 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 4, 12);
        var backstage0 = new ItemBackstage("Backstage passes to a TAFKAL80ETC concert", 0, 12);

        //items sulfura
        var sulfuras = new ItemSulfura("Sulfuras, Hand of Ragnaros", 0, 20);

        //items conjured
        var conjured = new ItemConjured("Conjured", 3, 30);

        var itemsTotales = new DefaultItem[]{agedBrie, agedBrie2, backstage15, backstage9, backstage4, backstage0, sulfuras, conjured};

        GildedRose app = new GildedRose(itemsTotales);
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
