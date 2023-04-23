package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ViewCozyIcon extends SVGIcon {

    public ViewCozyIcon() {
        super();
    }

    public ViewCozyIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 516V216h300v300H120Zm0 420V636h300v300H120Zm420-420V216h300v300H540Zm0 420V636h300v300H540Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "view-cozy-icon";
    }
}
