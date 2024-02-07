package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HomeIcon extends SVGIcon {

    public HomeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public HomeIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M10 20v-6h4v6h5v-8h3L12 3L2 12h3v8z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "home-icon";
    }

}
