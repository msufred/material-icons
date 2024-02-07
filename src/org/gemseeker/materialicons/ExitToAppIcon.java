package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ExitToAppIcon extends SVGIcon {

    public ExitToAppIcon() {
        super();
    }

    public ExitToAppIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M10.09 15.59L11.5 17l5-5l-5-5l-1.41 1.41L12.67 11H3v2h9.67zM19 3H5a2 2 0 0 0-2 " +
                "2v4h2V5h14v14H5v-4H3v4a2 2 0 0 0 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "exit-to-app-icon";
    }
}
