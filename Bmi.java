import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i=0; i < 2; i++){
    System.out.print("・身長(m)を入力してください：");
    double height = sc.nextDouble();
    System.out.print("・体重(Kg)を入力してください：");
    double weight = sc.nextDouble();
    double bmi = weight / (height*height);
    String sv = String.format("%.2f",bmi);
    double bmi2 = Double.parseDouble(sv);
    System.out.println("BMI値は"+bmi2+"です。");
    }
  }
}
