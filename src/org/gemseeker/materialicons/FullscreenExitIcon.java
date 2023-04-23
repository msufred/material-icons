package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FullscreenExitIcon extends SVGIcon {

    public FullscreenExitIcon() {
        super(DEFAULT_SIZE * 0.9);
    }

    public FullscreenExitIcon(double size) {
        super(size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M333 856V723H200v-60h193v193h-60Zm234 0V663h193v60H627v133h-60ZM200 " +
                "489v-60h133V296h60v193H200Zm367 0V296h60v133h133v60H567Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "fullscreen-exit-icon";
    }
}
