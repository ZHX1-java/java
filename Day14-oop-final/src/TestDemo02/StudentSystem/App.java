package TestDemo02.StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    static  ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("zhangsan","123qwe","111111111111111111","11111111111"));
    }
    public static void main(String[] args) {
        /*ArrayList<User> list = new ArrayList<>();
        User u = new User("zhx", "123", "411681200407214137", "15751460762");
        list.add(u);*/
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4遍历 5退出");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> login(list);
                case 2 -> register(list);
                case 3 -> forgerPassword(list);
                case 4 -> printList(list);
                case 5 -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                }
                default -> System.out.println("无该选项，请重新选择");
            }
        }
    }

    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("请输入账号");
        String userName = sc.next();
        boolean flag1 = contains(list, userName);
        if (flag1) {
            System.out.println("该账号未注册，请先注册");
            return;
        } else {
            user.setUserName(userName);
        }
        //判断验证码
        int count = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入密码");
            String password = sc.next();
            while (true) {
                String str = getCode();
                System.out.println(str);
                System.out.println("请输入验证码");
                String s = sc.next();
                if (str.equalsIgnoreCase(s)) {
                    int index = getIndex(list, userName);
                    if (index >= 0) {
                        if (list.get(index).getPassword().equals(password)) {
                            System.out.println("登录成功");
                            StudentSystem ss = new StudentSystem();
                            ss.startStudentSystem();
                            return;
                        } else {
                            count++;
                            if (count < 3) {
                                System.out.println("你还剩" + (3 - count) + "次机会");
                            }
                            if (count == 3) {
                                System.out.println("你已超过三次机会，请明天再来重试");
                            }
                        }
                    }
                    break;
                } else {
                    System.out.println("验证码错误");
                }
            }
        }
    }

    public static void register(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("请输入要注册的账号");
        String userName = sc.next();
        boolean flag1 = contains(list, userName);
        boolean flag2 = checkUserNameLength(list, userName);
        boolean flag3 = cherUserNameForm(list, userName);
        if (flag1) {
            if (flag2) {
                if (flag3) {
                    user.setUserName(userName);
                    System.out.println("请输入密码");
                    String passWord1 = sc.next();
                    System.out.println("请确认密码");
                    String password2 = sc.next();
                    if (passWord1.equals(password2)) {
                        user.setPassword(passWord1);
                    } else {
                        System.out.println("两次密码不相同");
                        return;
                    }
                    System.out.println("请输入身份证");
                    String personId = sc.next();
                    boolean flag4 = checkPersonId(list, personId);
                    if (flag4) {
                        user.setPersonId(personId);
                    } else {
                        System.out.println("身份证无效");
                        return;
                    }
                    System.out.println("请输入手机号");
                    String personNumber = sc.next();
                    boolean flag5 = phoneNumber(list, personNumber);
                    if (flag5) {
                        user.setPhone(personNumber);
                    } else {
                        System.out.println("手机号错误");
                        return;
                    }
                    list.add(user);
                    System.out.println("注册成功");
                } else System.out.println("格式不正确");
            } else System.out.println("长度不正确");
        } else System.out.println("该账号已存在");
    }


    public static void printList(ArrayList<User> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUserName() + "," + list.get(i).getPassword() + "," +
                    list.get(i).getPersonId() + "," + list.get(i).getPhone());
        }
    }

    public static void forgerPassword(ArrayList<User> list) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号");
        String userName = sc.next();
        boolean flag1 = contains(list, userName);
        if (flag1) {
            System.out.println("该账号未注册，请注册后使用");
        } else {
            int index = getIndex(list, userName);
            System.out.println("请输入身份证");
            String personId = sc.next();
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();
            if (personId.equals(list.get(index).getPersonId()) && phoneNumber.equals(list.get(index).getPhone())) {
                System.out.println("请输入修改后的密码");
                String newPassword = sc.next();
                user.setUserName(userName);
                user.setPassword(newPassword);
                user.setPhone(phoneNumber);
                user.setPersonId(personId);
                list.set(index, user);
                System.out.println("修改成功");
            } else System.out.println("账号信息不匹配，修改失败");
        }
    }

    public static boolean contains(ArrayList<User> list, String userName) {
        if (list.size() == 0) return true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().toString().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkUserNameLength(ArrayList<User> list, String userName) {
        if (userName.length() >= 3 && userName.length() <= 15) {
            return true;
        }
        return false;
    }

    public static boolean cherUserNameForm(ArrayList<User> list, String userName) {
        char[] userNameArr = userName.toCharArray();
        int numberCount = 0;
        int count = 0;
        for (int i = 0; i < userNameArr.length; i++) {
            if ((userNameArr[i] >= 'a' && userNameArr[i] <= 'z') || (userNameArr[i] >= 'A' && userNameArr[i] <= 'Z') || (userNameArr[i] >= '0' && userNameArr[i] <= '9')) {
                if ((userNameArr[i] >= 'a' && userNameArr[i] <= 'z') || (userNameArr[i] >= 'A' && userNameArr[i] <= 'Z')) {
                    count++;
                }
                if (userNameArr[i] >= '0' && userNameArr[i] <= '9') {
                    numberCount++;
                }
            }
        }
        if ((count + numberCount) == userName.length()) {
            return true;
        }
        return false;
    }

    public static boolean checkPersonId(ArrayList<User> list, String personId) {
        if (personId.length() != 18) {
            return false;
        }
        if (personId.charAt(0) == '0') {
            return false;
        }
        int count = 0;
        char arr[] = personId.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                count++;
            }
        }
        if (count == 17) {
            if ((arr[arr.length - 1] >= '0' && arr[arr.length - 1] <= '9') || (arr[arr.length - 1] == 'x') || (arr[arr.length - 1] == 'X')) {
            }
            return true;
        }
        return false;
    }

    public static boolean phoneNumber(ArrayList<User> list, String phoneNumber) {
        if (phoneNumber.length() != 11) {
            return false;
        }
        if (phoneNumber.charAt(0) == 0) {
            return false;
        }
        int count = 0;
        char arr[] = phoneNumber.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                count++;
            }
        }
        if (count == 11) {
            return true;
        }
        return false;
    }

    public static int getIndex(ArrayList<User> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(userName)) {
                return i;
            }
        }
        return -1;
    }

    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int num = r.nextInt(list.size());
            sb.append(list.get(num));
        }
        int number = r.nextInt(10);
        sb.append(number);
        char arr[] = sb.toString().toCharArray();
        char temp = 0;
        String str = "";
        int index = r.nextInt(arr.length);
        temp = arr[index];
        arr[index] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        /*for (int i = 0; i < arr.length; i++) {
            str = str + arr[i];
        }*/
        return new String(arr);
    }
}
