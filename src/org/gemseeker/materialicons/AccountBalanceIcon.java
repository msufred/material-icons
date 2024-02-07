package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccountBalanceIcon extends SVGIcon {

    public AccountBalanceIcon() {
        super(DEFAULT_SIZE * 0.95, DEFAULT_SIZE);
    }

    public AccountBalanceIcon(double size) {
        super(size * 0.95, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4 10h3v7H4zm6.5 0h3v7h-3zM2 19h20v3H2zm15-9h3v7h-3zm-5-9L2 6v2h20V6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "account-balance-icon";
    }
}
