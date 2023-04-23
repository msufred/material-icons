package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class UnfoldMoreIcon extends SVGIcon {

    public UnfoldMoreIcon() {
        super(DEFAULT_SIZE * 0.5, DEFAULT_SIZE);
    }

    public UnfoldMoreIcon(double size) {
        super(size * 0.5, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 936 300 756l44-44 136 136 136-136 44 44-180 180ZM344 444l-44-44 180-180 180 180-44 44-136-136-136 136Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "unfold-more-icon";
    }
}
