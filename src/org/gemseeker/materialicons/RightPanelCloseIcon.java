package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RightPanelCloseIcon extends SVGIcon {

    public RightPanelCloseIcon() {
        super();
    }

    public RightPanelCloseIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M297 440v272l136-136-136-136ZM180 936q-24.75 0-42.375-17.625T120 876V276q0-24.75 " +
                "17.625-42.375T180 216h600q24.75 0 42.375 17.625T840 276v600q0 24.75-17.625 42.375T780 " +
                "936H180Zm393-60V276H180v600h393Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "right-panel-close-icon";
    }
}
