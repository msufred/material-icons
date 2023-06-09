package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyOffIcon extends SVGIcon {

    public KeyOffIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.985);
    }

    public KeyOffIcon(double size) {
        super(size * 1.125, size * 0.985);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M815 996 494 676q-29 69-88.5 104.5T280 816q-100 0-170-70T40 576q0-66 34-124.5T177 " +
                "359L61 243l43-42 754 752-43 43Zm32-495 73 73-146 146-84-84-33 33-92-93-75-75h357ZM280 705q54 " +
                "0 88.5-35t39.5-79l-22-22.5q-22-22.5-49-49t-49-49L266 448q-44 4-79.5 39T151 576q0 54 37.5 91.5T280 705Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "key-off-icon";
    }
}
