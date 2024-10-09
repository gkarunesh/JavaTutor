import bean.UserBean;

public class TestJava {
    public static void main(String[] args) {
        UserBean uBean = new UserBean();
        uBean.setUserId("user1");
        uBean.setPassword("password");
        uBean.setAccountNo("123456");
        uBean.setBalance(5000);
        uBean.setUsername("USerName");

        System.out.println(uBean);
    }
}
