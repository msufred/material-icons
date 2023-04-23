package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ViewKanbanIcon extends SVGIcon {

    public ViewKanbanIcon() {
        super();
    }

    public ViewKanbanIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M279 779h60V373h-60v406Zm171-200h60V373h-60v206Zm171 120h60V373h-60v326ZM180 936q-24 " +
                "0-42-18t-18-42V276q0-24 18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "view-kanban-icon";
    }
}
