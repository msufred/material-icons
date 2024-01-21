package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AddIcon extends SVGIcon {

    public AddIcon() {
        super();
    }

    public AddIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M440-440H200v-80h240v-240h80v240h240v80H520v240h-80v-240Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-icon";
    }
}
