package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermCameraMicIcon extends SVGIcon {

    public PermCameraMicIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public PermCameraMicIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 5h-3.17L15 3H9L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 " +
                "2h7v-2.09c-2.83-.48-5-2.94-5-5.91h2c0 2.21 1.79 4 4 4s4-1.79 4-4h2c" +
                "0 2.97-2.17 5.43-5 5.91V21h7c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2m-6 8c0" +
                " 1.1-.9 2-2 2s-2-.9-2-2V9c0-1.1.9-2 2-2s2 .9 2 2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-camera-mic-icon";
    }
}
