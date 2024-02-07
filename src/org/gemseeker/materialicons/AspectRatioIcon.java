package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AspectRatioIcon extends SVGIcon {

    public AspectRatioIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public AspectRatioIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 12h-2v3h-3v2h5zM7 9h3V7H5v5h2zm14-6H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 " +
                "2h18c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2m0 16.01H3V4.99h18z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "aspect-ratio-icon";
    }
}
