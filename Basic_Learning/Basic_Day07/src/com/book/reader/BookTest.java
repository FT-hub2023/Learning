package com.book.reader;

public class BookTest {
    public static void main(String[] args) {
        Book sanguo = new Book();
        sanguo.id = "001";
        sanguo.name = "三国";
        sanguo.price = 88.88;
        sanguo.show();
        Book suihu = new Book();
        suihu.id = "002";
        suihu.name = "水浒";
        suihu.price = 88.88;
        suihu.show();
    }
}
