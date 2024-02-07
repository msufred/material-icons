package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CardMembershipIcon extends SVGIcon {

    public CardMembershipIcon() {
        super();
    }

    public CardMembershipIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 2H4c-1.11 0-2 .89-2 2v11c0 1.11.89 2 2 2h4v5l4-2l4 2v-5h4c1.11 0 2-.89 " +
                "2-2V4c0-1.11-.89-2-2-2m0 13H4v-2h16zm0-5H4V4h16z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "card-membership-icon";
    }
}
