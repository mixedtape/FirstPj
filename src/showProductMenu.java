import java.util.ArrayList;
import java.util.Scanner;

public class showProductMenu {
    public void showproduct(ArrayList<Menu> menuList,int menuNum){
        if (menuNum==1){
            System.out.println("김밥천국에 오신걸 환영합니다.");
            System.out.println("아래 상품 보시고 골라 입력해주세요.\n");
            System.out.printf(menuList.get(0).getName()+"  ");
            System.out.printf(menuList.get(0).getDescription()+"\n");
            System.out.println("1. 원조김밥   | 3000원| 모두가 아는 그 김밥");
            System.out.println("2. 치즈김밥   | 3500원| 고소한 치즈김밥");
            System.out.println("3. 참치김밥   | 4000원| 맛있는 참치김밥");
            System.out.println("4. 고추김밥   | 4600원| 매운 김밥");
            System.out.print("주문하실 상품번호를 선택해주세요: ");
        }
        else if (menuNum==2){
            System.out.println("김밥천국에 오신걸 환영합니다.");
            System.out.println("아래 상품 보시고 골라 입력해주세요.\n");
            System.out.printf(menuList.get(1).getName()+"  ");
            System.out.printf(menuList.get(1).getDescription()+"\n");
            System.out.println("1. 떡볶이        | 4000원| 엽떡 뺨치는맛");
            System.out.println("2. 오뎅          | 500원|  부산오뎅");
            System.out.println("3. 순대          | 300원|  내장 없습니다");
            System.out.println("4. 피카츄돈까스   | 1500원|  피카츄야 미안해ㅠㅠ");
            System.out.print("주문하실 상품번호를 선택해주세요: ");
        }
        else if (menuNum==3){
            System.out.println("김밥천국에 오신걸 환영합니다.");
            System.out.println("아래 상품 보시고 골라 입력해주세요.\n");
            System.out.printf(menuList.get(2).getName()+"  ");
            System.out.printf(menuList.get(2).getDescription()+"\n");
            System.out.println("1. 오므라이스   | 6000원| 맛있어져라~");
            System.out.println("2. 김치볶음밥   | 7000원| 계란후라이 기본제공");
            System.out.println("3. 만두국      | 7000원| 새해복 많이 받으세요");
            System.out.println("4. 육개장      | 6000원| 죽겠다");
            System.out.print("주문하실 상품번호를 선택해주세요: ");
        }
        else if (menuNum==4){
            System.out.println("김밥천국에 오신걸 환영합니다.");
            System.out.println("아래 상품 보시고 골라 입력해주세요.\n");
            System.out.printf(menuList.get(3).getName()+"  ");
            System.out.printf(menuList.get(3).getDescription()+"\n");
            System.out.println("1. 물       | 1000원| 영어로 warter");
            System.out.println("2. 사이다   | 3500원| 고구마 먹을때");
            System.out.println("3. 콜라     | 4000원| 펩시아닙니다");
            System.out.println("4. 솔의눈   | 1000000원| 사지마세요");
            System.out.print("주문하실 상품번호를 선택해주세요: ");
        }



    }

}
