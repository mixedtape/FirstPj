import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Menu> menuList = new ArrayList<>();
        ArrayList<Product> productList= new ArrayList<>();
        ArrayList<Product> productList1= new ArrayList<>();
        ArrayList<Product> productList2= new ArrayList<>();
        ArrayList<Product> productList3= new ArrayList<>();
        menuList.add(new Menu("김밥류", "김밥천국 대표 메뉴 김밥"));
        menuList.add(new Menu("분식류", "학교앞 분식집 그맛"));
        menuList.add(new Menu("식사류", "백반집보다 맛있는 식사류"));
        menuList.add(new Menu("음료류", "음료류"));
        productList.add(new Product("원조김밥","모두가 아는 그 김밥", 3000));
        productList.add(new Product("치즈김밥","고소한 치즈김밥", 3500));
        productList.add(new Product("참치김밥","맛있는 참치김밥", 4000));
        productList.add(new Product("고추김밥","매운 김밥", 3600));
        productList1.add(new Product("떡볶이","엽떡 뺨치는맛", 4000));
        productList1.add(new Product("오뎅","부산오뎅", 500));
        productList1.add(new Product("순대","내장 없습니다", 3000));
        productList1.add(new Product("피카츄돈까스","피카츄야 미안해ㅠㅠ", 1500));
        productList2.add(new Product("오므라이스","맛있어져라~", 6000));
        productList2.add(new Product("김치볶음밥","계란후라이 기본제공", 7000));
        productList2.add(new Product("만두국","새해복 많이 받으세요", 7000));
        productList2.add(new Product("육개장","죽겠다", 6000));
        productList3.add(new Product("물","영어로 warter", 1000));
        productList3.add(new Product("사이다","고구마 먹을때", 1500));
        productList3.add(new Product("콜라","펩시 아닙니다", 1500));
        productList3.add(new Product("솔의눈","사지마세요", 1000000));





        Order order=new Order();

        ShowMenu menu=new ShowMenu();
        int choiceCheck=0;
        int watingNum=0;

        boolean out=true;
        while(out==true){
            menu.showMenu();
            int choiceMenu = scanner.nextInt();
            showProductMenu product=new showProductMenu();
            if(choiceMenu>0&&choiceMenu<5){
                product.Showproduct(menuList,choiceMenu);

                int choiceProduct=0;
                choiceProduct = scanner.nextInt();
                choiceProduct--;

                switch (choiceMenu){
                    case 1:
                        System.out.println(productList.get(choiceProduct).getName()+" "+productList.get(choiceProduct).getDescription()+" "+productList.get(choiceProduct).getPrice());
                        break;
                    case 2:
                        System.out.println(productList1.get(choiceProduct).getName()+" "+productList1.get(choiceProduct).getDescription()+" "+productList1.get(choiceProduct).getPrice());
                        break;
                    case 3:
                        System.out.println(productList2.get(choiceProduct).getName()+" "+productList2.get(choiceProduct).getDescription()+" "+productList2.get(choiceProduct).getPrice());
                        break;
                    case 4:
                        System.out.println(productList3.get(choiceProduct).getName()+" "+productList3.get(choiceProduct).getDescription()+" "+productList3.get(choiceProduct).getPrice());
                        break;
                }

                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1.확인               2.취소");
                choiceCheck=scanner.nextInt();
                if (choiceCheck==1) {


                    if (choiceMenu == 1) {
                        order.ProductAdd(productList.get(choiceProduct));
                        System.out.println(productList.get(choiceProduct).getName() + "이 장바구니에 추가되었습니다");
                        try {
                            TimeUnit.SECONDS.sleep(3);

                        } catch (InterruptedException e) {

                        }
                    }
                    if (choiceMenu == 2) {
                        order.ProductAdd(productList1.get(choiceProduct));
                        System.out.println(productList1.get(choiceProduct).getName() + "이 장바구니에 추가되었습니다");
                        try {
                            TimeUnit.SECONDS.sleep(3);

                        } catch (InterruptedException e) {

                        }
                    }
                    if (choiceMenu == 3) {
                        order.ProductAdd(productList2.get(choiceProduct));
                        System.out.println(productList2.get(choiceProduct).getName() + "이 장바구니에 추가되었습니다");
                        try {
                            TimeUnit.SECONDS.sleep(3);

                        } catch (InterruptedException e) {

                        }
                    }
                    if (choiceMenu == 4) {
                        order.ProductAdd(productList3.get(choiceProduct));
                        System.out.println(productList3.get(choiceProduct).getName() + "이 장바구니에 추가되었습니다");
                        try {
                            TimeUnit.SECONDS.sleep(3);

                        } catch (InterruptedException e) {

                        }
                    } else {
                        System.out.println("취소 되었습니다.");
                    }
                }
            } else if (choiceMenu==5) {

                ArrayList<Product> Cart= order.getCart();
                int total=order.calculateTotal();
                if(total>0) {


                    System.out.println("아래와 같이 주문하시겠습니까?");


                    for (int i = 0; i < Cart.size(); i++) {
                        System.out.println(Cart.get(i).getName() + " " + Cart.get(i).getDescription() + " " + Cart.get(i).getPrice() + "원");
                    }
                    System.out.println("총합: " + total + " 원");
                    System.out.println("1.확인               2.취소");
                    choiceCheck = scanner.nextInt();
                    if (choiceCheck == 1) {
                        watingNum++;
                        System.out.println("주문이 완료되었습니다. 대기번호는 " + watingNum + " 입니다.");
                        order.clear();
                        try {
                            TimeUnit.SECONDS.sleep(3);

                        } catch (InterruptedException e) {

                        }
                    }
                }
                else {
                    System.out.println("상품을 먼저 담아주십시요\n3초후 메인메뉴로 돌아갑니다.");
                    try {
                        TimeUnit.SECONDS.sleep(3);

                    } catch (InterruptedException e) {

                    }
                }


            }
            else if(choiceMenu==6) {
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1.확인               2.취소");

                choiceCheck=scanner.nextInt();
                if (choiceCheck==1){
                    order.clear();
                    System.out.println("진행하던 주문이 취소되었습니다");
                    try {
                        TimeUnit.SECONDS.sleep(3);

                    }catch (InterruptedException e){

                    }
                }


            }


        }




    }


}
