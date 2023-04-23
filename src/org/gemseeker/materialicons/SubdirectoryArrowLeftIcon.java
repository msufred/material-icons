package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SubdirectoryArrowLeftIcon extends SVGIcon {

    public SubdirectoryArrowLeftIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public SubdirectoryArrowLeftIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M394 936 160 699l233-233 43 43-162 162h426V256h60v475H275l162 162-43 43Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "subdirectory-arrow-left-icon";
    }
}
