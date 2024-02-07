package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DynamicFormIcon extends SVGIcon {

    public DynamicFormIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public DynamicFormIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 20v-9h-2V4h7l-2 5h2zm-2-7v7H4c-1.1 0-2-.9-2-2v-3c0-1.1.9-2 2-2zm-8.75 " +
                "2.75h-1.5v1.5h1.5zM13 4v7H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2zM6.25 6.75h-1.5v1.5h1.5z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dynamic-form-icon";
    }
}
