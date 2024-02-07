package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DangerousIcon extends SVGIcon {

    public DangerousIcon() {
        super();
    }

    public DangerousIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M15.73 3H8.27L3 8.27v7.46L8.27 21h7.46L21 15.73V8.27zM17 15.74L15.74 " +
                "17L12 13.26L8.26 17L7 15.74L10.74 12L7 8.26L8.26 7L12 10.74L15.74 7L17 8.26L13.26 12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dangerous-icon";
    }
}
