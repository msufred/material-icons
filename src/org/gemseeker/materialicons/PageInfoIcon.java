package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PageInfoIcon extends SVGIcon {

    public PageInfoIcon() {
        super();
    }

    public PageInfoIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M700 926q-58 0-99-41t-41-99q0-58 41-99t99-41q58 0 99 41t41 99q0 58-41 99t-99 41Zm-.235-60Q733 " +
                "866 756.5 842.735q23.5-23.264 23.5-56.5Q780 753 756.735 729.5q-23.264-23.5-56.5-23.5Q667 706 643.5 " +
                "729.265q-23.5 23.264-23.5 56.5Q620 819 643.265 842.5q23.264 23.5 56.5 23.5ZM120 " +
                "816v-60h360v60H120Zm140-310q-58 0-99-41t-41-99q0-58 41-99t99-41q58 0 99 41t41 99q0 58-41 99t-99 " +
                "41Zm-.235-60Q293 446 316.5 422.735q23.5-23.264 23.5-56.5Q340 333 316.735 309.5q-23.264-23.5-56.5-23.5Q227 " +
                "286 203.5 309.265q-23.5 23.264-23.5 56.5Q180 399 203.265 422.5q23.264 23.5 56.5 23.5ZM480 " +
                "396v-60h360v60H480Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "page-info-icon";
    }
}
