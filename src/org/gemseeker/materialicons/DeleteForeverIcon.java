package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DeleteForeverIcon extends SVGIcon {

    public DeleteForeverIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public DeleteForeverIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6 19c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V7H6zm2.46-7.12l1.41-1.41L12 " +
                "12.59l2.12-2.12l1.41 1.41L13.41 14l2.12 2.12l-1.41 1.41L12 15.41l-2.12 2." +
                "12l-1.41-1.41L10.59 14zM15.5 4l-1-1h-5l-1 1H5v2h14V4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "delete-forever-icon";
    }

}
