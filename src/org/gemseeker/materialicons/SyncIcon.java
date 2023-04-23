package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SyncIcon extends SVGIcon {

    public SyncIcon() {
        super();
    }

    public SyncIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M167 896v-60h130l-15-12q-64-51-93-111t-29-134q0-106 62.5-190.5T387 272v62q-75 29-121 96.5T220 " +
                "579q0 63 23.5 109.5T307 769l30 21V666h60v230H167Zm407-15v-63q76-29 121-96.5T740 573q0-48-23.5-97.5T655 " +
                "388l-29-26v124h-61V256h230v60H665l15 14q60 56 90 120t30 123q0 106-62 191T574 881Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sync-icon";
    }
}
