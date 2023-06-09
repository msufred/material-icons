package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SyncProblemIcon extends SVGIcon {

    public SyncProblemIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE);
    }

    public SyncProblemIcon(double size) {
        super(size * 1.125, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M132 896v-60h123l-14-14q-60-60-86.5-121.5T128 580q0-109 62.5-195T355 266v62q-76 30-121.5 " +
                "99T188 580q0 52 17.5 98.5T265 763l30 27V673h60v223H132Zm348-122q-12 0-21-9t-9-21q0-12 9-21t21-9q12 " +
                "0 21 9t9 21q0 12-9 21t-21 9Zm-28-148V377h60v249h-60Zm153 261v-63q76-29 121.5-98T772 573q0-54-18-100." +
                "5T695 389l-30-27v117h-60V256h223v60H704l15 14q62 57 87.5 120T832 573q0 108-63 194.5T605 887Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "sync-problem-icon";
    }
}
