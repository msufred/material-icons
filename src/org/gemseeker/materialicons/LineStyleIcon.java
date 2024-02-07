package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LineStyleIcon extends SVGIcon {

    public LineStyleIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public LineStyleIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 16h5v-2H3zm6.5 0h5v-2h-5zm6.5 0h5v-2h-5zM3 20h2v-2H3zm4 0h2v-2H7zm4 0h2v-2h-2zm4 " +
                "0h2v-2h-2zm4 0h2v-2h-2zM3 12h8v-2H3zm10 0h8v-2h-8zM3 4v4h18V4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "line-style-icon";
    }
}
