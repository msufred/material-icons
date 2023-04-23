package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SyncDisabledIcon extends SVGIcon {

    public SyncDisabledIcon() {
        super(DEFAULT_SIZE * 1.25);
    }

    public SyncDisabledIcon(double size) {
        super(size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M809 1000 653 844q-20 13-39 21.5T574 881v-63q9-3 18-7.5t18-9.5L256 447q-19 31-27.5 65.5T220 " +
                "579q0 58 21.5 105.5T307 769l30 21V666h60v230H167v-60h130l-15-12q-68-54-95.5-115T160 579q1-54 " +
                "15-97t38-78L57 248l41-41 752 752-41 41Zm-72-236-42-42q21-33 33-70t12-79q0-46-22.5-95.5T655 " +
                "388l-29-26v124h-60V256h230v60H665l15 14q64 60 92 124t28 119q0 54-15.5 101T737 764ZM334 " +
                "361l-41-41q22-17 45.5-28.5T387 272v62q-13 5-26.5 12T334 361Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sync-disabled-icon";
    }
}
