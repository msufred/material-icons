package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HlsIcon extends SVGIcon {

    public HlsIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.35);
    }

    public HlsIcon(double size) {
        super(size, size * 0.35);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6.5 9H8v6H6.5v-2.5h-2V15H3V9h1.5v2h2zm10 6h3c.55 0 1-.45 1-1v-1.5c0-.55-." +
                "45-1-1-1H17v-1h2v.5h1.5v-1c0-.55-.45-1-1-1h-3c-.55 0-1 .45-1 1v1.5c0 .55.45 1 1 1H" +
                "19v1h-2V13h-1.5v1c0 .55.45 1 1 1M14 15v-1.5h-2.5V9H10v6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "hls-icon";
    }
}
