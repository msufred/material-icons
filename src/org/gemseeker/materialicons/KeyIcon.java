package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyIcon extends SVGIcon {

    public KeyIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.7);
    }

    public KeyIcon(double size) {
        super(size * 1.25, size * 0.7);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M280 705q54 0 91.5-37.5T409 576q0-54-37.5-91.5T280 447q-54 0-91.5 37.5T151 576q0 54 37.5 " +
                "91.5T280 705Zm0 111q-100 0-170-70T40 576q0-100 70-170t170-70q85 0 142.5 46.5T503 501h344l73 73-127 " +
                "146-103-84-84 84-71-71h-32q-19 75-80.5 121T280 816Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "key-icon";
    }
}
