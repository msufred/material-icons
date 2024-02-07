package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class BuildCircleIcon extends SVGIcon {

    public BuildCircleIcon() {
        super();
    }

    public BuildCircleIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m4.9 13.49l-1.4 " +
                "1.4c-.2.2-.51.2-.71 0l-3.41-3.41c-1.22.43-2.64.17-3.62-.81a3.468 3.468 0 0 1-.59-4.1l2.35 " +
                "2.35l1.41-1.41l-2.35-2.34c1.32-.71 2.99-.52 4.1.59c.98.98 1.24 2.4.81 3.62l3.41 3.41c.19.19" +
                ".19.51 0 .7");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "build-circle-icon";
    }
}
