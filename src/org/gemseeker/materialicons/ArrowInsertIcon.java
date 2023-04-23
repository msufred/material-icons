package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowInsertIcon extends SVGIcon {

    public ArrowInsertIcon() {
        super();
    }

    public ArrowInsertIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M718 810 306 398v378h-60V296h480v60H348l412 412-42 42Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-insert-icon";
    }
}
