package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PictureInPictureAltIcon extends SVGIcon {

    public PictureInPictureAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public PictureInPictureAltIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 11h-8v6h8zm4 8V4.98C23 3.88 22.1 3 21 3H3c-1.1 0-2 .88-2 " +
                "1.98V19c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2m-2 .02H3V4.97h18z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "picture-in-picture-alt-icon";
    }
}
