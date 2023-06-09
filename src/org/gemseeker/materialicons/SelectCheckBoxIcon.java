package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SelectCheckBoxIcon extends SVGIcon {

    public SelectCheckBoxIcon() {
        super();
    }

    public SelectCheckBoxIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24.75 0-42.375-17.625T120 876V276q0-24.75 17.625-42.375T180 216h600q14 0 25.5 " +
                "6t18.5 14l-44 44v-4H180v600h600V533l60-60v403q0 24.75-17.625 42.375T780 936H180Zm281-168L239 " +
                "546l42-42 180 180 382-382 42 42-424 424Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "select-check-box-icon";
    }
}
