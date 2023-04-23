package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RedoIcon extends SVGIcon {

    public RedoIcon() {
        super();
    }

    public RedoIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M392 856q-95 0-163.5-64T160 634q0-94 68.5-158T392 412h294L572 298l42-42 186 186-186 186-42-42 " +
                "114-114H391q-70 0-120.5 46.5T220 634q0 69 50.5 115.5T391 796h289v60H392Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "redo-icon";
    }
}
