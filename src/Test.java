import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("请输入用户名：");

        Scanner sc=new Scanner(System.in);
        String username=sc.next();
        System.out.println("你输入的用户名："+username);

        System.out.println("请输入密码：");
        String password =sc.next();

        System.out.println("你输入的密码是："+password);

       // File file=new File("C:\\Users\\lenovo\\IdeaProjects\\ConsoleShop\\src\\uers.xlsx");
        InputStream in =Class.forName("Test").getResourceAsStream("/users.xlsx");
        ReadUserExcel readUserExcel=new ReadUserExcel();
        User users[]=readUserExcel.readExcel(in);
        for (int i=0;i<users.length;i++){
            if(username.equals(users[i].getUsername()) && password.equals(users[i].getPassword())){

                System.out.println("登录成功");
                break;
            }else{
                System.out.println("登录失败");
            }
        }
    }
}
