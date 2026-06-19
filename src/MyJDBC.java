import java.sql.*;
class MyJDBC {
    public static void main(String[] args){
        Connection con;
        Statement stmt;
        ResultSet rs;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException exc){ }
        try {
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studaT",
                    "root",
                    "NewPassword123!"
            );
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from mystudent ; ");
            while(rs.next()){
                System.out.println(rs.getString(1) + ", " +
                        rs.getString(2) + ", " +
                        rs.getString(3) + ", " +
                        rs.getString(4) );
            }
            rs.close();
            stmt.close();
            con.close();
        } catch(SQLException exc){ }

    }
}