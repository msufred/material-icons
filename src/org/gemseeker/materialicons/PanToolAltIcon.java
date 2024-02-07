package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PanToolAltIcon extends SVGIcon {

    public PanToolAltIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public PanToolAltIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m19.98 14.82l-.63 4.46c-.14.99-.99 1.72-1.98 1.72h-6.16c-.53 0-1.29-.21-1.66-" +
                ".59L5 15.62l.83-.84c.24-.24.58-.35.92-.28l3.25.74V4.5c0-.83.67-1.5 1.5-1.5s1.5.67 1.5" +
                " 1.5v6h.91c.31 0 .62.07.89.21l4.09 2.04c.77.39 1.21 1.22 1.09 2.07");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pan-tool-alt-icon";
    }
}
