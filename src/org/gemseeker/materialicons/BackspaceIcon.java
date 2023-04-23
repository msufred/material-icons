package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class BackspaceIcon extends SVGIcon {

    public BackspaceIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.85);
    }

    public BackspaceIcon(double size) {
        super(size * 1.125, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m448 730 112-112 112 112 43-43-113-111 111-111-43-43-110 112-112-112-43 43 113 111-113 111 43 " +
                "43ZM120 576l169-239q13-18 31-29.5t40-11.5h420q25 0 42.5 17.5T840 356v440q0 25-17.5 42.5T780 " +
                "856H360q-22 0-40-11.5T289 815L120 576Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "backspace-icon";
    }
}
