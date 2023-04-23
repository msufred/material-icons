package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class BoltIcon extends SVGIcon {

    public BoltIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public BoltIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m320 976 40-280H160l360-520h80l-40 320h240L400 976h-80Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bolt-icon";
    }

}
