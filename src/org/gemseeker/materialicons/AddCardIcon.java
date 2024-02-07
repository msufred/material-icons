package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AddCardIcon extends SVGIcon {

    public AddCardIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public AddCardIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 4H4c-1.11 0-1.99.89-1.99 2L2 18c0 1.11.89 2 2 2h10v-2H4v-6h18V6c0-1.11-.89-2-2-2m0 " +
                "4H4V6h16zm4 9v2h-3v3h-2v-3h-3v-2h3v-3h2v3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-card-icon";
    }
}
