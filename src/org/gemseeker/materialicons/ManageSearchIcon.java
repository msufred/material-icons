package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ManageSearchIcon extends SVGIcon {

    public ManageSearchIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.75);
    }

    public ManageSearchIcon(double size) {
        super(size * 1.125, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M80 856v-60h400v60H80Zm0-210v-60h200v60H80Zm0-210v-60h200v60H80Zm758 420L678 696q-26 20-56 " +
                "30t-62 10q-83 0-141.5-58.5T360 536q0-83 58.5-141.5T560 336q83 0 141.5 58.5T760 536q0 32-10 62t-30 " +
                "56l160 160-42 42ZM559.765 676Q618 676 659 635.235q41-40.764 41-99Q700 478 659.235 437q-40.764-41-99-41Q502 " +
                "396 461 436.765q-41 40.764-41 99Q420 594 460.765 635q40.764 41 99 41Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "manage-search-icon";
    }
}
