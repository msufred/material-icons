package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FavoriteIcon extends SVGIcon {

    public FavoriteIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public FavoriteIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m12 21.35l-1.45-1.32C5.4 15.36 2 12.28 2 8.5C2 5.42 4.42 3 7.5 3c1.74 0 3.41.81 4.5 " +
                "2.09C13.09 3.81 14.76 3 16.5 3C19.58 3 22 5.42 22 8.5c0 3.78-3.4 6.86-8.55 11.54z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "favorite-icon";
    }
}
