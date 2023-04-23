package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DragPanIcon extends SVGIcon {

    public DragPanIcon() {
        super();
    }

    public DragPanIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 976 317 813l44-44 89 89V606H198l84 84-44 44L80 576l159-159 44 44-85 85h252V294l-84 84-44-44 " +
                "158-158 158 158-44 44-84-84v252h252l-84-84 44-44 158 158-158 158-44-44 84-84H510v252l89-89 44 44-163 163Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "drag-pan-icon";
    }
}
