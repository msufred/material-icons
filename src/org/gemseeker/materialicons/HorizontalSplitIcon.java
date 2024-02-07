package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HorizontalSplitIcon extends SVGIcon {

    public HorizontalSplitIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public HorizontalSplitIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 19h18v-6H3zm0-8h18V9H3zm0-6v2h18V5z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "horizontal-split-icon";
    }
}
