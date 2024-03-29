package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AllOutIcon extends SVGIcon {

    public AllOutIcon() {
        super();
    }

    public AllOutIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m16.21 4.16l4 4v-4zm4 12l-4 4h4zm-12 4l-4-4v4zm-4-12l4-4h-4zm12.95-.95c-" +
                "2.73-2.73-7.17-2.73-9.9 0s-2.73 7.17 0 9.9s7.17 2.73 9.9 0s2.73-7.16 0-9.9m-1.1 " +
                "8.8c-2.13 2.13-5.57 2.13-7.7 0s-2.13-5.57 0-7.7s5.57-2.13 7.7 0s2.13 5.57 0 7.7");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "all-out-icon";
    }
}
