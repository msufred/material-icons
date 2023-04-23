package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowOutwardIcon extends SVGIcon {

    public ArrowOutwardIcon() {
        super();
    }

    public ArrowOutwardIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m248 810-42-42 412-412H240v-60h480v480h-60V398L248 810Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-outward-icon";
    }
}
