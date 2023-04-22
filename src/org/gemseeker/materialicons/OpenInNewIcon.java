package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OpenInNewIcon extends SVGIcon {

    public OpenInNewIcon() {
        super();
    }

    public OpenInNewIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h279v60H180v600h600V597h60v279q0 24-18 42t-42 " +
                "18H180Zm202-219-42-43 398-398H519v-60h321v321h-60V319L382 717Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-in-new-icon";
    }
}
