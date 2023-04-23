package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SelectAllIcon extends SVGIcon {

    public SelectAllIcon() {
        super();
    }

    public SelectAllIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24 0-42-18t-18-42h60v60Zm-60-148v-83h60v83h-60Zm0-171v-83h60v83h-60Zm0-170v-" +
                "83h60v83h-60Zm0-171q0-24 18-42t42-18v60h-60Zm148 512V364h424v424H268Zm0 148v-60h83v60h-83Zm0-660v" +
                "-60h83v60h-83Zm60 452h304V424H328v304Zm111 208v-60h83v60h-83Zm0-660v-60h83v60h-83Zm170 660v-" +
                "60h83v60h-83Zm0-660v-60h83v60h-83Zm171 660v-60h60q0 24-18 42t-42 18Zm0-148v-83h60v83h-60Zm0-" +
                "171v-83h60v83h-60Zm0-170v-83h60v83h-60Zm0-171v-60q24 0 42 18t18 42h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "select-all-icon";
    }
}
