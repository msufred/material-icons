package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class OutputIcon extends SVGIcon {

    public OutputIcon() {
        super();
    }

    public OutputIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 42v90h-60v-90H180v600h600v-" +
                "90h60v90q0 24-18 42t-42 18H180Zm513-174-42-42 113-114H383v-60h381L651 432l42-42 186 186-186 186Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "output-icon";
    }
}
