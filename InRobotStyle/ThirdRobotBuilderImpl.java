public class ThirdRobotBuilderImpl implements RobotBuilder {

    private Robot robot;

    public ThirdRobotBuilderImpl() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("in an eXo Swim mask for scuba diving");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("tuxido dressed");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("with coated bronze ePIoVCyc");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("attached to plain white shoes");
    }

    //@Override
    public Robot getRobot() {
        return this.robot;
    }
}