public class RobotLauncher {

    public static void main(String[] args) {
        RobotBuilder RobotBuilder1 = new FirstRobotBuilderImpl();
        RobotBuilder RobotBuilder2 = new SecondRobotBuilderImpl();
        RobotBuilder RobotBuilder3 = new ThirdRobotBuilderImpl();

        RobotEngineer robotEngineer1 = new RobotEngineer(RobotBuilder1);
        RobotEngineer robotEngineer2 = new RobotEngineer(RobotBuilder2);
        RobotEngineer robotEngineer3 = new RobotEngineer(RobotBuilder3);

        robotEngineer1.makeRobot();
        robotEngineer2.makeRobot();
        robotEngineer3.makeRobot();

        Robot firstRobot = robotEngineer1.getRobot();
        Robot secondRobot = robotEngineer2.getRobot();
        Robot thirdRobot = robotEngineer3.getRobot();


        System.out.println("\nA Robot is on its way. Built in splendid parts." +
                "\n-----------------------------------------------");
        System.out.println("Robot One's head :\t\t " + firstRobot.getRobotHead());
        System.out.println("One's torso :\t\t\t " + firstRobot.getRobotTorso());
        System.out.println("One's arms :\t\t\t " + firstRobot.getRobotArms());
        System.out.println("One's legs :\t\t\t " + firstRobot.getRobotLegs() + "\n");

        System.out.println("\nMore imaginary robots on their way." +
                "\n-----------------------------------");
        System.out.println("Robot Two's head :\t\t " + secondRobot.getRobotHead());
        System.out.println("Two's torso :\t\t\t " + secondRobot.getRobotTorso());
        System.out.println("Two's arms :\t\t\t " + secondRobot.getRobotArms());
        System.out.println("Two's legs :\t\t\t " + secondRobot.getRobotLegs() + "\n");

        System.out.println("Robot's Three's head :\t " + thirdRobot.getRobotHead());
        System.out.println("Three's torso :\t\t\t " + thirdRobot.getRobotTorso());
        System.out.println("Three's arms :\t\t\t " + thirdRobot.getRobotArms());
        System.out.println("Three's legs :\t\t\t " + thirdRobot.getRobotLegs() + "\n");



    }
}