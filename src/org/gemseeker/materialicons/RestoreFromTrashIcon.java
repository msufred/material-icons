package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RestoreFromTrashIcon extends SVGIcon {

    public RestoreFromTrashIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public RestoreFromTrashIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 717h60V521l80 85 43-43-153-154-153 154 43 43 80-85v196ZM261 936q-24 0-42-18t-18-" +
                "42V306h-41v-60h188v-30h264v30h188v60h-41v570q0 24-18 42t-42 18H261Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "restore-from-trash-icon";
    }

}
