package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DoneOutlineIcon extends SVGIcon {

    public DoneOutlineIcon() {
        super(DEFAULT_SIZE * 1.35, DEFAULT_SIZE);
    }

    public DoneOutlineIcon(double size) {
        super(size * 1.35, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m381 814 453-453-43-43-410 410-211-211-43 43 254 254Zm0 85L42 560l128-128 211 211 410-410 " +
                "128 128-538 538Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "done-outline-icon";
    }
}
