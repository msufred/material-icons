package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ShoppingCartCheckoutIcon extends SVGIcon {

    public ShoppingCartCheckoutIcon() {
        super();
    }

    public ShoppingCartCheckoutIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m480 482-42-42 74-74H330v-60h182l-74-74 42-42 146 146-146 146ZM289.788 976Q260 976 239 " +
                "954.788q-21-21.213-21-51Q218 874 239.212 853q21.213-21 51-21Q320 832 341 853.212q21 21.213 21 " +
                "51Q362 934 340.788 955q-21.213 21-51 21Zm404 0Q664 976 643 954.788q-21-21.213-21-51Q622 874 " +
                "643.212 853q21.213-21 51-21Q724 832 745 853.212q21 21.213 21 51Q766 934 744.788 955q-21.213 " +
                "21-51 21ZM62 236v-60h116l170 364h287.706L796 260h67L701 563q-11 19-28.559 30.5Q654.881 605 " +
                "634 605H331l-56 104h491v60H284q-37.663 0-57.332-30Q207 709 224 678l64-118-148-324H62Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "shopping-cart-checkout-icon";
    }
}
