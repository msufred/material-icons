package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SystemUpdateAltIcon extends SVGIcon {

    public SystemUpdateAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public SystemUpdateAltIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M140 896q-24 0-42-18t-18-42V316q0-24 18-42t42-18h250v60H140v520h680V316H570v-60h250q24 0 42 " +
                "18t18 42v520q0 24-18 42t-42 18H140Zm340-185L280 511l43-43 127 127V256h60v339l127-127 43 43-200 200Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "system-update-alt-icon";
    }
}
