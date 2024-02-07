package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GetAppIcon extends SVGIcon {

    public GetAppIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public GetAppIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 9h-4V3H9v6H5l7 7zM5 18v2h14v-2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "get-app-icon";
    }
}
