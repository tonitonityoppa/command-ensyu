import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    for (int i=0; i < 2; i++){
    System.out.print("�E�g��(m)����͂��Ă��������F");
    double height = sc.nextDouble();
    System.out.print("�E�̏d(Kg)����͂��Ă��������F");
    double weight = sc.nextDouble();
    double bmi = weight / (height*height);
    String sv = String.format("%.2f",bmi);
    double bmi2 = Double.parseDouble(sv);
    System.out.println("BMI�l��"+bmi2+"�ł��B");
    }
  }
}
