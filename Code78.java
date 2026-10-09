import java.util.Scanner;

public class Code78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*

        double add = 0;
        double sub = 0;
        double mul = 1;
        double div = 0;
        int number = 0;

        while (true) { 
            System.out.println("==== 계산기 ====");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            if(sc.hasNextInt()){
                int menu = sc.nextInt();

                if(menu == 0){
                    System.out.println("계산기를 종료합니다");
                    break;
                }else{
                
                    switch(menu){
                        case 1:
                            number = 1;
                            System.out.println("== [+] 계산기 ( -1 입력 시 종료 ) ==");
                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                int num = sc.nextInt();

                                if(num == -1){
                                    break;
                                }

                                add += num;
                                number++;
                            }
                            System.out.println("결과: " + (int)add);
                            break;
                    
                        case 2:
                            number = 1;
                            System.out.println("== [-] 계산기 ( -1 입력 시 종료 ) ==");

                            System.out.print("기준이 될 첫번째 숫자를 입력해주세요: ");
                            sub = sc.nextInt();

                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                int num = sc.nextInt();

                                if(num == -1){
                                    break;
                                }
                                
                                sub -= num;
                                number++;
                            }
                            System.out.println("결과: " + (int)sub);
                            break;

                        case 3:
                            number = 1;
                            System.out.println("== [*] 계산기 ( -1 입력 시 종료 ) ==");
                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                int num = sc.nextInt();

                                if(num == -1){
                                    break;
                                }

                                mul *= num;
                                number++;
                            }
                            System.out.println("결과: " + (int)mul);
                            break;

                        case 4:
                            number = 1;
                            System.out.println("== [/] 계산기 ( -1 입력 시 종료 ) ==");

                            System.out.print("기준이 될 첫번째 숫자를 입력해주세요: ");
                            div = sc.nextDouble();

                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                int num = sc.nextInt();

                                if(num == -1){
                                    break;
                                }
                                
                                if(num == 0){
                                    System.out.println("0으로는 나눌 수 없습니다");
                                }else{
                                    div /= num;
                                    number++;
                                }
                                
                            }

                            if (div == (int)div) {
                                System.out.println("결과: " + (int)div);
                                break;
                            }else{
                                System.out.println("결과: " + (double)div);
                                break;
                            }
                    
                        default:    
                            System.out.println("메뉴의 있는 숫자들 중에서 골라주세요 (0~4)");
                    }

                }
            }else{
                System.out.println("숫자를 입력해주세요");
                sc.next();
            }
        }
        sc.close();

---------------------------------------------------------------------------------------------------------------*/

// ai 활용 피드백 수용 후 다시 쓴 코드

        double add;
        double sub;
        double mul;
        double div;
        int number;

        while (true) { 
            System.out.println("==== 계산기 ====");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");

            if(sc.hasNextInt()){
                int menu = sc.nextInt();

                if(menu == 0){
                    System.out.println("계산기를 종료합니다");
                    break;
                }else{
                
                    switch(menu){
                        case 1:
                            add = 0;
                            number = 1;
                            System.out.println("== [+] 계산기 ( -1 입력 시 종료 ) ==");
                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                if(sc.hasNextDouble()){
                                    double num = sc.nextDouble();

                                    if(num == -1){
                                     break;
                                    }

                                    add += num;
                                    number++;
                                }else{
                                    System.out.println("숫자를 입력해주세요");
                                    sc.next();
                                }
                            }
                            if(add == (int)add){
                                System.out.println("결과: " + (int)add);
                                break;
                            }else{
                                System.out.println("결과: " + (double)add);
                                break;
                            }
                            
                    
                        case 2:
                            sub = 0;
                            number = 1;
                            System.out.println("== [-] 계산기 ( -1 입력 시 종료 ) ==");

                            while (true) {
                                System.out.print("기준이 될 첫번째 숫자를 입력해주세요: ");
                                if (sc.hasNextInt()) {
                                    sub = sc.nextDouble();
                                    break;
                                }else{
                                    System.out.println("숫자를 입력해주세요!");
                                    sc.next();
                                }
                            }

                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                if(sc.hasNextDouble()){
                                    double num = sc.nextDouble();

                                    if(num == -1){
                                        break;
                                    }
                                
                                    sub -= num;
                                    number++;
                                }else{
                                    System.out.println("숫자를 입력해주세요");
                                    sc.next();
                                }
                            }
                            if(sub == (int)sub){
                                System.out.println("결과: " + (int)sub);
                                break;
                            }else{
                                System.out.println("결과: " + (double)sub);
                                break;
                            }

                        case 3:
                            mul = 1;
                            number = 1;
                            System.out.println("== [*] 계산기 ( -1 입력 시 종료 ) ==");
                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                if(sc.hasNextDouble()){
                                    double num = sc.nextDouble();

                                    if(num == -1){
                                        break;
                                    }

                                    mul *= num;
                                    number++;
                                }else{
                                    System.out.println("숫자를 입력해주세요");
                                    sc.next();
                                }
                            }
                            if(mul == (int)mul){
                                System.out.println("결과: " + (int)mul);
                                break;
                            }else{
                                System.out.println("결과: " + (double)mul);
                                break;
                            }

                        case 4:
                            div = 0;
                            number = 1;
                            System.out.println("== [/] 계산기 ( -1 입력 시 종료 ) ==");

                            while(true){
                                System.out.print("기준이 될 첫번째 숫자를 입력해주세요: ");
                                if(sc.hasNextDouble()){
                                    div = sc.nextDouble();
                                    break;
                                }else{
                                    System.out.println("숫자를 입력해주세요");
                                    sc.next();
                                }
                            }

                            while(true){
                                System.out.print(number + "번째 숫자: ");
                                if(sc.hasNextInt()){
                                    double num = sc.nextDouble();

                                    if(num == -1){
                                        break;
                                    }
                                
                                    if(num == 0){
                                        System.out.println("0으로는 나눌 수 없습니다");
                                    }else{
                                        div /= num;
                                        number++;
                                    }
                                }else{
                                    System.out.println("숫자를 입력해주세요");
                                    sc.next();
                                }
                                
                            }
                            if (div == (int)div) {
                                System.out.println("결과: " + (int)div);
                                break;
                            }else{
                                System.out.println("결과: " + div);
                                break;
                            }
                            
                    
                        default:    
                            System.out.println("메뉴의 있는 숫자들 중에서 골라주세요 (0~4)");
                    }

                }
            }else{
                System.out.println("숫자를 입력해주세요");
                sc.next();
            }
        }
        sc.close();
    }
}