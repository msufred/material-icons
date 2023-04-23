package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ResizeIcon extends SVGIcon {

    public ResizeIcon() {
        super();
    }

    public ResizeIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 617v-83h60v83h-60Zm0-170v-83h60v83h-60Zm0-171v-60h60v60h-60Zm148 0v-60h83v60h-83Zm171 " +
                "660v-60h83v60h-83Zm0-660v-60h83v60h-83Zm170 660v-60h83v60h-83Zm171 0v-60h60v60h-60Zm0-148v-83h60v83h-" +
                "60Zm0-171v-83h60v83h-60Zm0-170V276H609v-60h231v231h-60ZM120 936V705h60v171h171v60H120Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "resize-icon";
    }
}
