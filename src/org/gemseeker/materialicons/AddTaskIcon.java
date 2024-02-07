package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AddTaskIcon extends SVGIcon {

    public AddTaskIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public AddTaskIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M22 5.18L10.59 16.6l-4.24-4.24l1.41-1.41l2.83 2.83l10-10zM12 20c-4.41 " +
                "0-8-3.59-8-8s3.59-8 8-8c1.57 0 3.04.46 4.28 1.25l1.45-1.45A10.02 10.02 0 0 0 1" +
                "2 2C6.48 2 2 6.48 2 12s4.48 10 10 10c1.73 0 3.36-.44 4.78-1.22l-1.5-1.5c-1 .46" +
                "-2.11.72-3.28.72m7-5h-3v2h3v3h2v-3h3v-2h-3v-3h-2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "add-task-icon";
    }
}
