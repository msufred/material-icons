package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ViewTimelineIcon extends SVGIcon {

    public ViewTimelineIcon() {
        super();
    }

    public ViewTimelineIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M250 777h220v-60H250v60Zm120-171h220v-60H370v60Zm120-171h220v-60H490v60ZM180 936q-24 " +
                "0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "view-timeline-icon";
    }
}
