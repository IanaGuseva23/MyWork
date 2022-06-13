import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(calculator.calc(input));
    }
}
class Calculator {
    static int num1, num2, res;
    static String operand, res1;
    static String[] str;


    public static String calc(String input) throws Exception {
            str = input.split(" ");
        if (str.length==3) {
            boolean A;
            try {
                num1 = Integer.parseInt(str[0]);
                num2 = Integer.parseInt(str[2]);
                operand = str[1];
                A = false;
            } catch (Exception e) {
                try {
                    Roman num11 = Roman.valueOf(str[0]);
                    Roman num22 = Roman.valueOf(str[2]);
                num1 = num11.getArab();
                num2 = num22.getArab();
                operand = str[1];
                } catch (Exception g) {
                    System.out.println("������ ������� ���������");
                    throw new Exception();
                }
                A = true;
            }

            res = getRes(num1, num2, operand);
            res1 = String.valueOf(res);
            if (A) {
                if (res <= 0) {
                    System.out.println("��������� �� ����� ���� �������������");
                    throw new Exception();
                }
                res1 = getRomeNumber(res);
            }
        } else {
            System.out.println("�������� ������ ������");
            throw new Exception();
        }
        return res1;
    }

    public static int getRes(int num1, int num2, String operand) throws Exception {
        res = 0;
        if (num1 <= 10 && num2 <= 10 && num1 >= 1 && num2 >= 1) {
            switch (operand) {
                case "+":
                    res = (num1 + num2);
                    break;
                case "-":
                    res = (num1 - num2);
                    break;
                case "*":
                    res = (num1 * num2);
                    break;
                case "/":
                    res = (num1 / num2);
                    break;
                default:
                    throw new Exception("�������� �������");
            }
        } else {
            System.out.println("������� ����� �� 1 �� 10");
            throw new Exception();
        }
        return res;
    }

    public static String getRomeNumber(int number)  {
        String romeNumber = null;
        switch (number) {
            case 1:
                romeNumber = "I";
                break;
            case 2:
                romeNumber = "II";
                break;
            case 3:
                romeNumber = "III";
                break;
            case 4:
                romeNumber = "IV";
                break;
            case 5:
                romeNumber = "V";
                break;
            case 6:
                romeNumber = "VI";
                break;
            case 7:
                romeNumber = "VII";
                break;
            case 8:
                romeNumber = "VIII";
                break;
            case 9:
                romeNumber = "IX";
                break;
            case 10:
                romeNumber = "X";
                break;
            case 11:
                romeNumber = "XI";
                break;
            case 12:
                romeNumber = "XII";
                break;
            case 13:
                romeNumber = "XIII";
                break;
            case 14:
                romeNumber = "XIV";
                break;
            case 15:
                romeNumber = "XV";
                break;
            case 16:
                romeNumber = "XVI";
                break;
            case 17:
                romeNumber = "XVII";
                break;
            case 18:
                romeNumber = "XVIII";
                break;
            case 19:
                romeNumber = "XIX";
                break;
            case 20:
                romeNumber = "XX";
                break;
            case 21:
                romeNumber = "XXI";
                break;
            case 22:
                romeNumber = "XXII";
                break;
            case 23:
                romeNumber = "XXIII";
                break;
            case 24:
                romeNumber = "XXIV";
                break;
            case 25:
                romeNumber = "XXV";
                break;
            case 26:
                romeNumber = "XXVI";
                break;
            case 27:
                romeNumber = "XXVII";
                break;
            case 28:
                romeNumber = "XXVIII";
                break;
            case 29:
                romeNumber = "XXIX";
                break;
            case 30:
                romeNumber = "XXX";
                break;
            case 31:
                romeNumber = "XXXI";
                break;
            case 32:
                romeNumber = "XXXII";
                break;
            case 33:
                romeNumber = "XXXIII";
                break;
            case 34:
                romeNumber = "XXXIV";
                break;
            case 35:
                romeNumber = "XXXV";
                break;
            case 36:
                romeNumber = "XXXVI";
                break;
            case 37:
                romeNumber = "XXXVII";
                break;
            case 38:
                romeNumber = "XXXVIII";
                break;
            case 39:
                romeNumber = "XXXIX";
                break;
            case 40:
                romeNumber = "XL";
                break;
            case 41:
                romeNumber = "XLI";
                break;
            case 42:
                romeNumber = "XLII";
                break;
            case 43:
                romeNumber = "XLIII";
                break;
            case 44:
                romeNumber = "XLIV";
                break;
            case 45:
                romeNumber = "XLV";
                break;
            case 46:
                romeNumber = "XLVI";
                break;
            case 47:
                romeNumber = "XLVII";
                break;
            case 48:
                romeNumber = "XLVIII";
                break;
            case 49:
                romeNumber = "XLIX";
                break;
            case 50:
                romeNumber = "L";
                break;
            case 51:
                romeNumber = "LI";
                break;
            case 52:
                romeNumber = "LII";
                break;
            case 53:
                romeNumber = "LIII";
                break;
            case 54:
                romeNumber = "LIV";
                break;
            case 55:
                romeNumber = "LV";
                break;
            case 56:
                romeNumber = "LVI";
                break;
            case 57:
                romeNumber = "LVII";
                break;
            case 58:
                romeNumber = "LVIII";
                break;
            case 59:
                romeNumber = "LIX";
                break;
            case 60:
                romeNumber = "LX";
                break;
            case 61:
                romeNumber = "LXI";
                break;
            case 62:
                romeNumber = "LXII";
                break;
            case 63:
                romeNumber = "LXIII";
                break;
            case 64:
                romeNumber = "LXIV";
                break;
            case 65:
                romeNumber = "LXV";
                break;
            case 66:
                romeNumber = "LXVI";
                break;
            case 67:
                romeNumber = "LXVII";
                break;
            case 68:
                romeNumber = "LXVIII";
                break;
            case 69:
                romeNumber = "LXIX";
                break;
            case 70:
                romeNumber = "LXX";
                break;
            case 71:
                romeNumber = "LXXI";
                break;
            case 72:
                romeNumber = "LXXII";
                break;
            case 73:
                romeNumber = "LXXIII";
                break;
            case 74:
                romeNumber = "LXXIV";
                break;
            case 75:
                romeNumber = "LXXV";
                break;
            case 76:
                romeNumber = "LXXVI";
                break;
            case 77:
                romeNumber = "LXXVII";
                break;
            case 78:
                romeNumber = "LXXVIII";
                break;
            case 79:
                romeNumber = "LXXIX";
                break;
            case 80:
                romeNumber = "LXXX";
                break;
            case 81:
                romeNumber = "LXXXI";
                break;
            case 82:
                romeNumber = "LXXXII";
                break;
            case 83:
                romeNumber = "LXXXIII";
                break;
            case 84:
                romeNumber = "LXXXIV";
                break;
            case 85:
                romeNumber = "LXXXV";
                break;
            case 86:
                romeNumber = "LXXXVI";
                break;
            case 87:
                romeNumber = "LXXXVII";
                break;
            case 88:
                romeNumber = "LXXXVIII";
                break;
            case 89:
                romeNumber = "LXXXIX";
                break;
            case 90:
                romeNumber = "XC";
                break;
            case 91:
                romeNumber = "XCI";
                break;
            case 92:
                romeNumber = "XCII";
                break;
            case 93:
                romeNumber = "XCIII";
                break;
            case 94:
                romeNumber = "XCIV";
                break;
            case 95:
                romeNumber = "XCV";
                break;
            case 96:
                romeNumber = "XCVI";
                break;
            case 97:
                romeNumber = "XCVII";
                break;
            case 98:
                romeNumber = "XCVIII";
                break;
            case 99:
                romeNumber = "XCIX";
                break;
            case 100:
                romeNumber = "C";
                break;
        }
        return romeNumber;
    }
}