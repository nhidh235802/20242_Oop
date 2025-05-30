package hust.soict.hedspi.aims.screen.customer.controller;
import javax.naming.LimitExceededException;
import javax.swing.JOptionPane;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ItemController {

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblTitle;

    @FXML
    private Label lblCost;
    private Cart cart;
    
    public ItemController(Cart cart) {
    	this.cart = cart;
    }
    

    @FXML
    void btnAddToCartClicked(ActionEvent event) throws LimitExceededException {	
    	cart.addMedia(media);
    }

    @FXML
    void btnPlayClicked(ActionEvent event) {
    	if (media instanceof Playable) {
            if (((Playable)media).getLength() > 0) {
                JOptionPane.showMessageDialog(null, "Now playing: " + media.getTitle(), "Playing ", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "This DVD has no content!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    
    private Media media;
    public void setData(Media media) {
    	this.media = media;
    	lblTitle.setText(media.getTitle());
    	lblCost.setText(media.getCost()+ "$");
    	if(media instanceof Playable) {
    		btnPlay.setVisible(true);
    	}else {
    		btnPlay.setVisible(false);
    		HBox.setMargin(btnAddToCart, new Insets(0, 0, 0, 60));
    	}
    }
}