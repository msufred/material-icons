package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class UndoIcon extends SVGIcon {

    public UndoIcon() {
        super();
    }

    public UndoIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M280 856v-60h289q70 0 120.5-46.5T740 634q0-69-50.5-115.5T569 472H274l114 114-42 42-186-186 " +
                "186-186 42 42-114 114h294q95 0 163.5 64T800 634q0 94-68.5 158T568 856H280Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "undo-icon";
    }
}
