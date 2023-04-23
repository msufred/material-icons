package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RebaseEditIcon extends SVGIcon {

    public RebaseEditIcon() {
        super();
    }

    public RebaseEditIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m430 451-42-42 83-83H316q-8 32-31 55t-55 31v328q39 10 64.5 42t25.5 74q0 50-35 85t-85 35q-50 " +
                "0-85-35t-35-85q0-42 25.5-74t64.5-42V412q-39-10-64.5-42T80 296q0-50 35-85t85-35q42 0 74 25.5t42 " +
                "64.5h155l-83-83 42-42 156 155-156 155Zm330-275q50 0 85 35t35 85q0 50-35 85t-85 35q-50 " +
                "0-85-35t-35-85q0-50 35-85t85-35ZM630 575l171 168-231 233H400V806l230-231Zm200 139L659 " +
                "546l43-42q17-17 42.5-17t42.5 18l84 85q17 18 17 42.5T870 674l-40 40Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "rebase-edit-icon";
    }
}
