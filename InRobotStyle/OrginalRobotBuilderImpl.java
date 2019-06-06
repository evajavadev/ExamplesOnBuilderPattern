public class OrginalRobotBuilderImpl implements RobotBuilder {

    private Robot robot;

    public OrginalRobotBuilderImpl() {
        this.robot = new Robot();       // it's here the robot'll be created, whenever this constructor is invoked.
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("rotating 90DG APuF001, 2 cameras eMOTion, " +
                "voice reco D2XL synth A, laugh and humour");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Linux, embedded cpu AXF 100, " +
                "LiPoFZ battery, and a good heart");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("swinging arms with prehensive hands XTo");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("on roller skates with 25-361 degrees freedom");
    }

    //@Override
    public Robot getRobot() {
        return this.robot;
    }
}