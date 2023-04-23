package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FirstPageIcon extends SVGIcon {

    public FirstPageIcon() {
        super();
    }

    public FirstPageIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M240 816V336h60v480h-60Zm447-3L453 579l234-234 43 43-191 191 191 191-43 43Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "first-page-icon";
    }
}
