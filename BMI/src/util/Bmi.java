package util;
import java.util.Scanner;
public class Bmi {
    public void run() {
        Scanner input = new Scanner(System.in);
    
            while (true) {
                System.out.println("Nhập vào chỉ số cân nặng và chiều cao của bạn HOẶC nhập phím 'q' để thoát chương trình");
               
                System.out.println("Số cân nặng được tính bằng Kilograms:");
                    String weight = input.nextLine();
                    String q1 = "q";
                       if (weight.equals(q1)) {
                           break;
                                              }
                System.out.println("Số chiều cao được đo bằng Meters:");
                    String height = input.nextLine();
                    String q2 = "q";
                       if (height.equals(q2)) {
                            break;
                                              }   
                    
                    double b = Double.valueOf(height);
                    double a = Double.valueOf(weight);
                       double c = (a / (b * b));

                       System.out.println("Chỉ số BMI của bạn là: " + c);
                          if ( c <= 24.6 ){
                           if( c > 18.6) {
                              System.out.println("Cơ thể bạn bị thiếu cân, cần bổ sung thêm dinh dưỡng");
                                         }
                            System.out.println("Cơ thể bạn hoàn toàn bình thường");          
                                          }
                           else if ( c >= 24.6){
                                    System.out.println("Cơ thể bạn thừa cân, cần ăn uống điều độ");
                                               }

                         }
                         input.close();
                      }
    
                  }
