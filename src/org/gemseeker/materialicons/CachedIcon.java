package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CachedIcon extends SVGIcon {

    public CachedIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.95);
    }

    public CachedIcon(double size) {
        super(size * 1.25, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m19 8l-4 4h3c0 3.31-2.69 6-6 6a5.87 5.87 0 0 1-2.8-.7l-1.46 1.46A7.93 7.93 0 0 0 " +
                "12 20c4.42 0 8-3.58 8-8h3zM6 12c0-3.31 2.69-6 6-6c1.01 0 1.97.25 2.8.7l1.46-1.46A7.93 7.93" +
                " 0 0 0 12 4c-4.42 0-8 3.58-8 8H1l4 4l4-4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "cached-icon";
    }
}
