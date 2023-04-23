package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class UnfoldLessIcon extends SVGIcon {

    public UnfoldLessIcon() {
        super(DEFAULT_SIZE * 0.5, DEFAULT_SIZE);
    }

    public UnfoldLessIcon(double size) {
        super(size * 0.5, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m343 896-43-43 180-180 180 180-43 43-137-137-137 137Zm137-417L300 299l43-43 137 137 137-137 43 43-180 180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "unfold-less-icon";
    }
}
