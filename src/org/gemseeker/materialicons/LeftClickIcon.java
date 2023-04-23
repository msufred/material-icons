package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class LeftClickIcon extends SVGIcon {

    public LeftClickIcon() {
        super();
    }

    public LeftClickIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M468 816q-96-5-162-74t-66-166q0-100 70-170t170-70q97 0 166 66t74 163l-63-20q-11-64-60-106.5T480 " +
                "396q-75 0-127.5 52.5T300 576q0 67 42.5 116.5T449 753l19 63Zm353 180L650 825l-50 151-120-400 400 " +
                "120-151 50 171 171-79 79Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "left-click-icon";
    }
}
