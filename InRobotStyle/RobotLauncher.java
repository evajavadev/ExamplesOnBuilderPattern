public class RobotLauncher {

    public static void main(String[] args) {
        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();
        System.out.println("\nA Robot is on its way. Built in splendid parts." +
                "\n-----------------------------------------------");
        System.out.println("the robot's head :\t " + firstRobot.getRobotHead());
        System.out.println("the torso :\t\t\t " + firstRobot.getRobotTorso());
        System.out.println("its arms :\t\t\t " + firstRobot.getRobotArms());
        System.out.println("and legs :\t\t\t " + firstRobot.getRobotLegs() + "\n");
    }
}