package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.util.ArrayList;

public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc disc) {
        if (!itemsInStore.contains(disc)) {
            itemsInStore.add(disc);
            System.out.println("The disc has been added to the store.");
        } else {
            System.out.println("The disc already exists in the store.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (itemsInStore.remove(disc)) {
            System.out.println("The disc has been removed from the store.");
        } else {
            System.out.println("The disc was not found in the store.");
        }
    }

    public void displayStore() {
        System.out.println("**********STORE**********");
        for (int i = 0; i < itemsInStore.size(); i++) {
            DigitalVideoDisc disc = itemsInStore.get(i);
            System.out.printf("%d. %s - $%.2f%n", i + 1, disc.getTitle(), disc.getCost());
        }
        System.out.println("*************************");
    }
}
