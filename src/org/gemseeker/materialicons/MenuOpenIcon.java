package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MenuOpenIcon extends SVGIcon {

    public MenuOpenIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.75);
    }

    public MenuOpenIcon(double size) {
        super(size * 1.125, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 816v-60h520v60H120Zm678-52L609 575l188-188 43 43-145 145 146 146-43 43ZM120 " +
                "604v-60h400v60H120Zm0-208v-60h520v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "menu-open-icon";
    }
}
