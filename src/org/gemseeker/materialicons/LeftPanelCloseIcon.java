package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class LeftPanelCloseIcon extends SVGIcon {

    public LeftPanelCloseIcon() {
        super();
    }

    public LeftPanelCloseIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M663 712V440L527 576l136 136ZM180 936q-24.75 0-42.375-17.625T120 876V276q0-24.75 17.625-42.375T180 " +
                "216h600q24.75 0 42.375 17.625T840 276v600q0 24.75-17.625 42.375T780 936H180Zm207-60h393V276H387v600Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "left-panel-close-icon";
    }
}
