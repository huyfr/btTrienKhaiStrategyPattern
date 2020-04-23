public class User {
    public static void main(String[] args) {
        XMLStorage xmlStorage = new XMLStorage();
        UserController userController1 = new UserController(xmlStorage);
        userController1.store();

        MySQLStorage mySQLStorage = new MySQLStorage();
        UserController userController2 = new UserController(mySQLStorage);
        userController2.store();
    }
}