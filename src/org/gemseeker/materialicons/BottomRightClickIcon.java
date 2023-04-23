package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class BottomRightClickIcon extends SVGIcon {

    public BottomRightClickIcon() {
        super();
    }

    public BottomRightClickIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 936v-60h660V216h60v660q0 24.75-17.625 42.375T780 936H120Zm479.911-170Q571 766 550.5 " +
                "745.411q-20.5-20.588-20.5-49.5Q530 667 550.589 646.5q20.588-20.5 49.5-20.5Q629 626 649.5 646.589q20.5 " +
                "20.588 20.5 49.5Q670 725 649.411 745.5q-20.588 20.5-49.5 20.5ZM220 576v-60h158L119 257l42-42 259 " +
                "259V316h60v260H220Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "bottom-right-click-icon";
    }
}
