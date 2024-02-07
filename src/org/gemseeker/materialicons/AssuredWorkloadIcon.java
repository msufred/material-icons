package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AssuredWorkloadIcon extends SVGIcon {

    public AssuredWorkloadIcon() {
        super();
    }

    public AssuredWorkloadIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M5 10h2v7H5zm6 0h2v7h-2zm11-4L12 1L2 6v2h20zM2 19v2h12.4c-.21-.64-.32-1.31-.36-2zm17-6." +
                "74V10h-2v3.26zM20 14l-4 2v2.55c0 2.52 1.71 4.88 4 5.45c2.29-.57 4-2.93 4-5.45V16zm-.72 7l-2.03-" +
                "2.03l1.06-1.06l.97.97l2.41-2.38l1.06 1.06z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "assured-workload-icon";
    }
}
