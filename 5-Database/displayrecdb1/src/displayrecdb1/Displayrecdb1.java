package displayrecdb1;
import java.sql.*;
class displayrecdb1 {
    public static void main(String args[]) {
        try {
            Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/stud","Meet","Meet");
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            System.out.print(" Name " + "  Roll no ");
            while (rs.next()) {
                System.out.println(" ");
                System.out.print("  "+rs.getString(1));
                System.out.print(" " + rs.getInt(2));
                }
            } catch (Exception ee) {
                System.out.println(ee);
            }
        }
    }