package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AssignmentLateIcon extends SVGIcon {

    public AssignmentLateIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public AssignmentLateIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3h-4.18C14.4 1.84 13.3 1 12 1c-1.3 0-2.4.84-2.82 2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 " +
                "2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2m-6 15h-2v-2h2zm0-4h-2V8h2zm-1-9c-.55 0-1-.45-1-1s.45-1 1-1s1" +
                " .45 1 1s-.45 1-1 1");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "assignment-late-icon";
    }
}
