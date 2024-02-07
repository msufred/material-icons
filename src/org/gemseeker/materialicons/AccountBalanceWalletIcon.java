package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccountBalanceWalletIcon extends SVGIcon {

    public AccountBalanceWalletIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.95);
    }

    public AccountBalanceWalletIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21 18v1c0 1.1-.9 2-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h14c1.1 0 2 .9 2 2v1h-9a2 2 0 0 0-2 " +
                "2v8a2 2 0 0 0 2 2zm-9-2h10V8H12zm4-2.5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5s1.5.67 1.5 1.5s-.67 1" +
                ".5-1.5 1.5");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "account-balance-wallet-icon";
    }
}
