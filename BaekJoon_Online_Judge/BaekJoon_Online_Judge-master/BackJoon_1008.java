/*
A/B

臾몄젣
�몢 �젙�닔 A�� B瑜� �엯�젰諛쏆� �떎�쓬, A/B瑜� 異쒕젰�븯�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�븯�떆�삤.


�엯�젰
泥レ㎏ 以꾩뿉 A�� B媛� 二쇱뼱吏꾨떎. (0 < A, B < 10)


異쒕젰
泥レ㎏ 以꾩뿉 A/B瑜� 異쒕젰�븳�떎. �떎�젣 �젙�떟怨� 異쒕젰媛믪쓽 �젅���삤李� �삉�뒗 �긽���삤李④� 10-9 �씠�븯�씠硫� �젙�떟�씠�떎.


�삁�젣 �엯�젰 1
1 3


�삁�젣 異쒕젰 1
0.33333333333333333333333333333333


�삁�젣 �엯�젰 1
4 5


�삁�젣 異쒕젰 2
0.8

*/

import java.util.Scanner;
 
public class BackJoon_1008 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
         
        System.out.println(a / b);
    }
}