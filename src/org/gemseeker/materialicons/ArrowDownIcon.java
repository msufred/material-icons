package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowDownIcon extends SVGIcon {

    public ArrowDownIcon() {
        super();
    }

    public ArrowDownIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 896 160 576l42-42 248 248V256h60v526l248-248 42 42-320 320Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-down-icon";
    }
}
