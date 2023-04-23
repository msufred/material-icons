package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DeleteForeverIcon extends SVGIcon {

    public DeleteForeverIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public DeleteForeverIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m361 757 119-121 120 121 47-48-119-121 119-121-47-48-120 121-119-121-48 48 120 121-120 121 48 " +
                "48ZM261 936q-24 0-42-18t-18-42V306h-41v-60h188v-30h264v30h188v60h-41v570q0 24-18 42t-42 18H261Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "delete-forever-icon";
    }

}
