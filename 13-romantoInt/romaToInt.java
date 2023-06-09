package Java.romantoInt;

import java.util.ArrayList;
import java.util.Scanner;

class romaToInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        String check = "";
        String resultString = "";
        int result = 0;
        ArrayList<String> listChar = new ArrayList<String>();

        System.out.println("Roman to Integer");

        do {
            System.out.print("Enter Roman: ");
            chuoi = sc.nextLine();
            if (chuoi.length() > 15) {
                System.out.println("The string is too long, please re-enter");
            } else {
                for (int i = 0; i < chuoi.length(); i++) {
                    String checkChar = Character.toString(chuoi.charAt(i));
                    if (!checkChar.equalsIgnoreCase("i") && !checkChar.equalsIgnoreCase("v")
                            && !checkChar.equalsIgnoreCase("x")
                            && !checkChar.equalsIgnoreCase("l")
                            && !checkChar.equalsIgnoreCase("c")
                            && !checkChar.equalsIgnoreCase("d")
                            && !checkChar.equalsIgnoreCase("m")) {
                        System.out.println("Incorrect input, please re-enter");
                        check = "error";
                        resultString = "";
                        break;
                    } else {
                        resultString += checkChar;
                        check = "complete";
                    }
                }
            }
        } while (chuoi.length() > 15 || check.equals("error"));

        for (int i = 0; i < resultString.length(); i++) {
            listChar.add(Character.toString(resultString.charAt(i)));
        }

        int j = 0;
        int i = 1;
        while (listChar.size() > 0) {
            if (listChar.size() > 1) {
                if (listChar.get(j).equalsIgnoreCase("c")) {
                    if (listChar.get(i).equalsIgnoreCase("D")) {
                        result += 400;
                        listChar.remove(i);
                        listChar.remove(j);
                    } else if (listChar.get(i).equalsIgnoreCase("M")) {
                        result += 900;
                        listChar.remove(i);
                        listChar.remove(j);
                    } else {
                        result += 100;
                        listChar.remove(j);
                    }

                } else if (listChar.get(j).equalsIgnoreCase("x")) {
                    if (listChar.get(i).equalsIgnoreCase("L")) {
                        result += 40;
                        listChar.remove(i);
                        listChar.remove(j);
                    } else if (listChar.get(i).equalsIgnoreCase("C")) {
                        result += 90;
                        listChar.remove(i);
                        listChar.remove(j);
                    } else {
                        result += 10;
                        listChar.remove(j);
                    }

                } else if (listChar.get(j).equalsIgnoreCase("i")) {
                    if (listChar.get(i).equalsIgnoreCase("V")) {
                        result += 4;
                        listChar.remove(i);
                        listChar.remove(j);
                    } else if (listChar.get(i).equalsIgnoreCase("X")) {
                        result += 9;
                        listChar.remove(i);
                        listChar.remove(j);
                    } else {
                        result += 1;
                        listChar.remove(j);
                    }

                } else if (listChar.get(j).equalsIgnoreCase("M")) {
                    result += 1000;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("D")) {
                    result += 500;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("L")) {
                    result += 50;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("V")) {
                    result += 5;
                    listChar.remove(j);

                }
            } else {
                if (listChar.get(j).equalsIgnoreCase("m")) {
                    result += 1000;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("d")) {
                    result += 500;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("c")) {
                    result += 100;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("l")) {
                    result += 50;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("x")) {
                    result += 10;
                    listChar.remove(j);

                } else if (listChar.get(j).equalsIgnoreCase("v")) {
                    result += 5;
                    listChar.remove(j);

                } else {
                    result += 1;
                    listChar.remove(j);
                }
            }
        }
        
        System.out.println(resultString.toUpperCase() + " (Roma)" + " => " + result + " (Integer)");

    }
}