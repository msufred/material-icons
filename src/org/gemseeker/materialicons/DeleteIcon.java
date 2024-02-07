package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DeleteIcon extends SVGIcon {

    public DeleteIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public DeleteIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6zM19 4h-3.5l-1-1h-5l-1 1H5v2h14z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "delete-icon";
    }

}
