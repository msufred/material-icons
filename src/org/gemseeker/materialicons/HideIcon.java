package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class HideIcon extends SVGIcon {

    public HideIcon() {
        super();
    }

    public HideIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m162 936-42-42 214-214H216v-60h220v220h-60V722L162 936Zm363-405V311h60v118l213-213 42 42-213 213h118v60H525Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "hide-icon";
    }
}
