public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer(RobotBuilder robotBuilder) {   // in RobotEngineer is RobotBuilder defined,
        this.robotBuilder = robotBuilder;               // i OldRobotBuilder is Robot defined.
    }                                                   // = backtrack.

    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }
}