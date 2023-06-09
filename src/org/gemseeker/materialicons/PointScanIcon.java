package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PointScanIcon extends SVGIcon {

    public PointScanIcon() {
        super();
    }

    public PointScanIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M479.911 646Q451 646 430.5 625.411q-20.5-20.588-20.5-49.5Q410 547 430.589 526.5q20.588-20.5 " +
                "49.5-20.5Q509 506 529.5 526.589q20.5 20.588 20.5 49.5Q550 605 529.411 625.5q-20.588 20.5-49.5 " +
                "20.5ZM450 416V216h60v200h-60Zm0 520V736h60v200h-60Zm190-330v-60h200v60H640Zm-520 0v-60h200v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "point-scan-icon";
    }
}
