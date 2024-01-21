package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DeleteIcon extends SVGIcon {

    public DeleteIcon() {
        super(DEFAULT_SIZE * 0.875, DEFAULT_SIZE);
    }

    public DeleteIcon(double size) {
        super(size * 0.875, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M261 936q-24 0-42-18t-18-42V306h-41v-60h188v-30h264v30h188v60h-41v570q0 24-18 42t-42 " +
                "18H261Zm106-146h60V391h-60v399Zm166 0h60V391h-60v399Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "delete-icon";
    }

}
