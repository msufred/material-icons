package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DynamicFormIcon extends SVGIcon {

    public DynamicFormIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public DynamicFormIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M140 546q-24.75 0-42.375-17.625T80 486V316q0-24.75 17.625-42.375T140 256h400v290H140Zm0 " +
                "350q-24.75 0-42.375-17.625T80 836V666q0-24.75 17.625-42.375T140 606h480v290H140Zm540 0V546h-" +
                "80V256h280l-80 220h80L680 896ZM195 781h60v-60h-60v60Zm0-350h60v-60h-60v60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dynamic-form-icon";
    }
}
