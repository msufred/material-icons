package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ListIcon extends SVGIcon {

    public ListIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.55);
    }

    public ListIcon(double size) {
        super(size, size * 0.55);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 13h2v-2H3zm0 4h2v-2H3zm0-8h2V7H3zm4 4h14v-2H7zm0 4h14v-2H7zM7 7v2h14V7z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "list-icon";
    }
}
