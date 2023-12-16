package at.technikum.simpleclasses.library;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Library {

    private String name;

    private Item[] items;

    private int itemsCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getItems() {
        return items;
    }

    public int getBookCount() {
        return itemsCount;
    }

    public Library(String name) {
        this.name = name;
        items = new Item[100];
    }

    public Library(String name, int maxNumberOfItems) {
        this.name = name;
        items = new Item[maxNumberOfItems];
    }

    public boolean addItem(Item item) {
        if (itemsCount == items.length) { // songsCount == songs.length
            System.out.println("Your Playlist is full!!");
            return false;
        }
        items[itemsCount] = item;
        itemsCount++;
        return true;
    }

    public void addItems(Item ...items) {
        for (Item item: items) addItem(item);
    }

    public Item findItem(String id) {
        for (int i = 0; i < itemsCount; i++)
            if (items[i].getId().equals(id))
                return items[i];
        return null;
    }

    public boolean rent(Item item, Member member) {
        if (item.getStatus().equals("rented")) {
            System.out.printf("the Item(%s) is already been rented\n", item);
            return false;
        }
        item.setRentedBy(member);
        return true;
    }

    public void returnItem(Item item) {
        item.setRentedBy(null);
    }

    public String getAllItems() {
        StringBuilder itemsOutput = new StringBuilder();
        for (int i = 0; i < itemsCount; i++)
            itemsOutput.append(items[i]);
        return itemsOutput.toString();
    }
    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", items=" + getAllItems() +
                '}';
    }
}
