package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PictureInPictureIcon extends SVGIcon {

    public PictureInPictureIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public PictureInPictureIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 7h-8v6h8zm2-4H3c-1.1 0-2 .9-2 2v14c0 1.1.9 1.98 2 1.98h18c1.1 0 " +
                "2-.88 2-1.98V5c0-1.1-.9-2-2-2m0 16.01H3V4.98h18z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "picture-in-picture-icon";
    }
}
