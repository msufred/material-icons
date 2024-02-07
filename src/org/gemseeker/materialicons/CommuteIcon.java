package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CommuteIcon extends SVGIcon {

    public CommuteIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public CommuteIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 4H5C3.34 4 2 5.34 2 7v8c0 1.66 1.34 3 3 3l-1 1v1h1l2-2.03L9 18v-5H4V5.98L13 " +
                "6v2h2V7c0-1.66-1.34-3-3-3M5 14c.55 0 1 .45 1 1s-.45 1-1 1s-1-.45-1-1s.45-1 1-1m15.57-4.3" +
                "4c-.14-.4-.52-.66-.97-.66h-7.19c-.46 0-.83.26-.98.66L10 13.77l.01 5.51c0 .38.31.72.69.72" +
                "h.62c.38 0 .68-.38.68-.76V18h8v1.24c0 .38.31.76.69.76h.61c.38 0 .69-.34.69-.72l.01-1.37v" +
                "-4.14zm-8.16.34h7.19l1.03 3h-9.25zM12 16c-.55 0-1-.45-1-1s.45-1 1-1s1 .45 1 1s-.45 1-1 1" +
                "m8 0c-.55 0-1-.45-1-1s.45-1 1-1s1 .45 1 1s-.45 1-1 1");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "commute-icon";
    }
}
