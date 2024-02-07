package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CompressIcon extends SVGIcon {

    public CompressIcon() {
        super(DEFAULT_SIZE * 0.75, DEFAULT_SIZE);
    }

    public CompressIcon(double size) {
        super(size * 0.75, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M8 19h3v3h2v-3h3l-4-4zm8-15h-3V1h-2v3H8l4 4zM4 9v2h16V9zm0 3h16v2H4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "compress-icon";
    }
}
