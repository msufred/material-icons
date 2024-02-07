package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NetworkPingIcon extends SVGIcon {

    public NetworkPingIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.6);
    }

    public NetworkPingIcon(double size) {
        super(size, size * 0.6);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 14.67L3.41 6.09L2 7.5l8.5 8.5H4v2h16v-2h-6.5l5.15-5.15A2.5 " +
                "2.5 0 1 0 19.5 6A2.5 2.5 0 0 0 17 8.5c0 .35.07.67.2.97z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "network-ping-icon";
    }
}
