package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RebaseIcon extends SVGIcon {

    public RebaseIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public RebaseIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m430 1011-42-42 83-83H316q-10 39-42 64.5T200 976q-50 0-85-35t-35-85q0-42 " +
                "25.5-74t64.5-42V412q-39-10-64.5-42T80 296q0-50 35-85t85-35q42 0 74 25.5t42 64.5h155l-83-83 " +
                "42-42 156 155-156 155-42-42 83-83H316q-8 32-31 55t-55 31v328q32 8 55 31t31 55h155l-83-83 " +
                "42-42 156 155-156 155Zm330-35q-50 0-85-35t-35-85q0-42 25.5-74t64.5-42V412q-39-10-64.5-42T640 " +
                "296q0-50 35-85t85-35q50 0 85 35t35 85q0 42-25.5 74T790 412v328q39 10 64.5 42t25.5 74q0 50-35 " +
                "85t-85 35Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "rebase-icon";
    }
}
