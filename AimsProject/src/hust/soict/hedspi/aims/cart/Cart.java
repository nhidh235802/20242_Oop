package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		} else {
			System.out.println("The cart is almost full.");
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (DigitalVideoDisc dvd : dvdList) {
			addDigitalVideoDisc(dvd);
		}
	}

	/*
	public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
		for (DigitalVideoDisc dvd : dvds) {
			addDigitalVideoDisc(dvd); 
		}
	}
	IDE báo lỗi do không thể biên dịch cùng lúc addDigitalVideoDisc(DigitalVideoDisc...) và addDigitalVideoDisc(DigitalVideoDisc[]) */
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                found = true;
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("The disc is not found in the cart.");
        }
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}

	public void displayCart() {
	    System.out.println("***********************CART***********************");
	    System.out.println("Ordered Items:");
	    float totalCost = 0;

	    for (int i = 0; i < qtyOrdered; i++) {
	        DigitalVideoDisc disc = itemsOrdered[i];
	        System.out.printf("%d. %s%n", (i + 1), disc.toString());
	        totalCost += disc.getCost();
	    }

	    System.out.printf("Total cost: %.2f $\n", totalCost);
	    System.out.println("***************************************************");
	}

	public void searchById(int id) {
	    boolean found = false;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].getId() == id) {
	            System.out.println("Found: " + itemsOrdered[i].toString());
	            found = true;
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("No DVD with ID " + id + " found in the cart.");
	    }
	}

	public void searchByTitle(String title) {
	    boolean found = false;
	    for (int i = 0; i < qtyOrdered; i++) {
	        if (itemsOrdered[i].isMatch(title)) {
	            System.out.println("Found: " + itemsOrdered[i].toString());
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No DVD with title matching \"" + title + "\" found in the cart.");
	    }
	}

}
