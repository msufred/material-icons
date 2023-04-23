package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class DeployedCodeIcon extends SVGIcon {

    public DeployedCodeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public DeployedCodeIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 971 150 798q-14-8-22-22t-8-30V406q0-16 8-30t22-22l300-173q14-8 30-8t30 8l300 173q14 8 22 " +
                "22t8 30v340q0 16-8 30t-22 22L510 971q-14 8-30 8t-30-8Zm30-52 30-17V593l270-157v-30l-34-19-266 " +
                "155-267-155-33 19v31l270 156v309l30 17Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "deployed-code-icon";
    }
}
