package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CachedIcon extends SVGIcon {

    public CachedIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE * 0.95);
    }

    public CachedIcon(double size) {
        super(size * 1.25, size * 0.95);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M481 898q-131 0-225.5-94.5T161 578v-45l-80 80-39-39 149-149 149 149-39 39-80-80v45q0 107 " +
                "76.5 183.5T481 838q29 0 55-5t49-15l43 43q-36 20-72.5 28.5T481 898Zm289-169L621 580l40-40 79 " +
                "79v-41q0-107-76.5-183.5T480 318q-29 0-55 5.5T376 337l-43-43q36-20 72.5-28t74.5-8q131 0 225.5 " +
                "94.5T800 578v43l80-80 39 39-149 149Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "cached-icon";
    }
}
