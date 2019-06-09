public class SecondRobotBuilderImpl implements RobotBuilder {

    private Robot robot;

    public SecondRobotBuilderImpl() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("with two yellow cameras, and a hair blue like the sky");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("in a jacket and scarf");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("sometimes four, with always a one hand glove");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("in ski trousers");
    }

    //@Override
    public Robot getRobot() {
        return this.robot;
    }
}
