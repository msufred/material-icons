package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GifIcon extends SVGIcon {

    public GifIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.45);
    }

    public GifIcon(double size) {
        super(size, size * 0.45);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M11.5 9H13v6h-1.5zM9 9H6c-.6 0-1 .5-1 1v4c0 .5.4 1 1 1h3c.6 0 1-.5 " +
                "1-1v-2H8.5v1.5h-2v-3H10V10c0-.5-.4-1-1-1m10 1.5V9h-4.5v6H16v-2h2v-1.5h-2v-1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "gif-icon";
    }
}
