package bao0711;
import java.util.Scanner;
public class Xmdd {
    public static void main(String[] args) {
        System.out.println("*************订单结算*************");
        System.out.println("1、交通类\t2、住宿类\t3、门票类");
        String jt="机票：北京——丽江";
        String zs="古城酒店三人间";
        String mp="玉龙雪山 套票";
        Scanner input=new Scanner(System.in);
        String answer="";
        double zk=0.8;
        int money=0;
        do{
            System.out.println("请选择结算分类编号：");
            int fl=input.nextInt();
            System.out.println("请输入数量：");
            int num=input.nextInt();

            switch (fl){
                case 1:
                    int money1=1100;
                    System.out.println(jt+(money1*num)+"元");
                    money+=money1*num;//交通总金额
                    break;
                case 2:
                    int money2=200;
                    System.out.println(zs+(money2*num)+"元");
                    money+=money2*num;//交通总金额
                    break;
                case 3:
                    int money3=445;
                    System.out.println(mp+(money3*num)+"元");
                    money+=money3*num;//交通总金额
                    break;
                default:
                    System.out.println("只能在1、2、3中选择！");
            }
            System.out.println("是否继续？");
            answer=input.next();
            System.out.println("*************");
        }while (answer.equals("y"));
        System.out.println("使用打折券，折扣："+zk);
        System.out.println("应缴金额（元）："+money);
        System.out.println("请输入账户充值金额（元）：");
        int chongzhi=input.nextInt();
        while (chongzhi<money) {
            System.out.println("您的充值金额（元）不足，请重新输入：");
            chongzhi=input.nextInt();
        }
        System.out.println("结算完毕，账户剩余金额"+(chongzhi-money)+"元");
            System.out.println("祝您旅途愉快！");

    }
}
