package ex_021_Oops_Encapsulation;

public class Lab_150_REAL_ex_Encaps {
    public static void main(String[] args) {
        QuiklyzLogin Qlogin=new QuiklyzLogin("User01", "pass123");
        System.out.println(Qlogin.user_name);
        System.out.println(Qlogin.password);

        GoodQuiklyzLogin GQlogin=new GoodQuiklyzLogin("User02","Passw0rd");
       // System.out.println(GQlogin.user_name); user_name is private
        System.out.println(GQlogin.getUser_name());
        System.out.println(GQlogin.getPassword());

        //provided the condition to set the password (Admin javax.management.MalformedObjectNameException can change the password)
        GQlogin.setUser_name("Admin");
        System.out.println(GQlogin.getUser_name());
        GQlogin.setPassword("passw0rd123", false); // Cannot change the password. Admin has authorize on this
        System.out.println(GQlogin.getPassword());// OUTPUT- Passw0rd
       // GQlogin.setPassword("passw0rd123", true);
        // System.out.println(GQlogin.getPassword()); OUTPUT- passw0rd123
    }
}

class QuiklyzLogin {
    String user_name;
    String password;

    //PC
    QuiklyzLogin(String usr, String pwd) {
        this.user_name = usr;
        this.password = pwd;

    }
}
    class GoodQuiklyzLogin {
        private String user_name;
        private String password;

        GoodQuiklyzLogin(String usr, String pwd) {
            this.user_name = usr;
            this.password = pwd;

        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password, boolean is_admin) {
            if(is_admin)
            {
                this.password=password;
            }
            else
                System.out.println("Cannot change the password. Admin has authorize on this");
        }
    }