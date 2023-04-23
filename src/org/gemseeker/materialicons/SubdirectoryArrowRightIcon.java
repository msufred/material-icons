package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SubdirectoryArrowRightIcon extends SVGIcon {

    public SubdirectoryArrowRightIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public SubdirectoryArrowRightIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m566 936-43-43 162-162H200V256h60v415h426L524 509l43-43 233 233-234 237Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "subdirectory-arrow-right-icon";
    }
}
