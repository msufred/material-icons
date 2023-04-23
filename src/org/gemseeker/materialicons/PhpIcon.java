package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PhpIcon extends SVGIcon {

    public PhpIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.45);
    }

    public PhpIcon(double size) {
        super(size * 1.25, size * 0.45);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 696V456h152q20 0 34 14t14 34v64q0 20-14 34t-34 14H168v80h-48Zm258 " +
                "0V456h48v89h108v-89h48v240h-48V593H426v103h-48Zm282 0V456h152q20 0 34 14t14 34v64q0 " +
                "20-14 34t-34 14H708v80h-48ZM168 568h104v-64H168v64Zm540 0h104v-64H708v64Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "php-icon";
    }
}
