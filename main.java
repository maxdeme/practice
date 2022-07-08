package ru.ac.uniyar.mf.summer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] parts_1 = str.split(" ");
        String left = parts_1[0];
        String right = parts_1[2];
        String sign = parts_1[1];

        String[] parts_left = left.split("/");
        String[] parts_right = right.split("/");

        fraction left_num = string_to_fraction(parts_left);
        fraction right_num = string_to_fraction(parts_right);

        List<Integer> nums = new ArrayList<Integer>();

        if (left_num.getN() != 1)
            nums.add(left_num.getN());
        nums.add(left_num.getM());
        nums.add(right_num.getM());
        if (right_num.getN() != 1)
            nums.add(right_num.getN());

        int most_common_num = find_most_common_num(nums);
        System.out.println("Ответ:");
        String result = calculate(left, sign, right);
        System.out.println(result);
        System.out.println("Самое часто встречающееся число из введенных:");
        System.out.println(most_common_num);
    }

    public static String calculate(String left, String sign, String right)
    {
        String[] parts_left = left.split("/");
        String[] parts_right = right.split("/");

        fraction left_num = string_to_fraction(parts_left);
        fraction right_num = string_to_fraction(parts_right);

        fraction res = new fraction();
        switch (sign)
        {
            case "+":
                res = res.addition(left_num, right_num);
                break;
            case "-":
                res = res.subtraction(left_num, right_num);
                break;
            case "*":
                res = res.multiplication(left_num, right_num);
                break;
            case "/":
                res = res.division(left_num, right_num);
                break;
        }
        res.negative_fraction(res);

        String ans;
        if (res.getN()  == 0)
            ans = "Division by zero";
        else if (res.getM()  == 0)
            ans = "0";
        else if (res.getN()  == 1)
            ans = String.valueOf(res.getM());
        else
            ans = (String.valueOf(res.getM()) + "/" + String.valueOf(res.getN()));
        return ans;
    }

    public static fraction string_to_fraction(String[] str)
    {
        int n;
        if (str.length == 1)
            n = 1;
        else
            n = Integer.parseInt(str[1]);
        fraction num = new fraction(Integer.parseInt(str[0]), n);
        return num;
    }

    public static int find_most_common_num(List<Integer>nums)
    {
        int ans = nums.get(0), count = 0, max_count = 0;
        for (int i = 0; i < nums.size(); i++)
        {
            count = 0;
            for (int j = 0; j < nums.size(); j++)
            {
                if (nums.get(i) == nums.get(j))
                    count++;
            }
            if (count > max_count || (count == max_count && nums.get(i) > ans))
                ans = nums.get(i);
        }
        return ans;
    }
}




/*===========================================================*/

