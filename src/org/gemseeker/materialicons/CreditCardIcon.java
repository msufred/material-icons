package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CreditCardIcon extends SVGIcon {

    public CreditCardIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public CreditCardIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h16c1.11 0 2-.89 " +
                "2-2V6c0-1.11-.89-2-2-2m0 14H4v-6h16zm0-10H4V6h16z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "credit-card-icon";
    }
}
