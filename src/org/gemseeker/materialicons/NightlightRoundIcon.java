package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NightlightRoundIcon extends SVGIcon {

    public NightlightRoundIcon() {
        super(DEFAULT_SIZE * 0.7, DEFAULT_SIZE);
    }

    public NightlightRoundIcon(double size) {
        super(size * 0.7, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12.01 12c0-3.57 2.2-6.62 5.31-7.87c.89-.36.75-1.69-.19-1.9c-1.1-.24-2.27-." +
                "3-3.48-.14c-4.51.6-8.12 4.31-8.59 8.83C4.44 16.93 9.13 22 15.01 22c.73 0 1.43-.08 2" +
                ".12-.23c.95-.21 1.1-1.53.2-1.9A8.46 8.46 0 0 1 12.01 12");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "nightlight-round-icon";
    }
}
