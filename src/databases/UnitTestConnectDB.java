package databases;

import com.mongodb.client.MongoDatabase;
import org.testng.Assert;

public class UnitTestConnectDB {
    public static void main(String[] args) {
       // ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

       MongoDatabase connection =  ConnectToMongoDB.connectToMongoDB();

        System.out.println(connection.getName());

       Assert.assertTrue(connection.getName().contains("students"));


    }
}
