package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EditOffIcon extends SVGIcon {

    public EditOffIcon() {
        super(DEFAULT_SIZE * 1.05, DEFAULT_SIZE);
    }

    public EditOffIcon(double size) {
        super(size * 1.05, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m12.126 8.125l1.937-1.937l3.747 3.747l-1.937 1.938zM20.71 5.63l-2.34-2.34a1 1 0 0 " +
                "0-1.41 0l-1.83 1.83l3.75 3.75L20.71 7a1 1 0 0 0 0-1.37M2 5l6.63 6.63L3 17.25V21h3.75l5.63-" +
                "5.62L18 21l2-2L4 3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "edit-off-icon";
    }
}
