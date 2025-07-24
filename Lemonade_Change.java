public class Lemonade_Change {
    public static boolean lemonadeChange(int[] bills) {
        int count1 = 0; 
        int count2 = 0; 
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                count1++;
            } else if (bills[i] == 10) {
                if (count1 > 0) {
                    count1--;
                    count2++;
                } 
                else {
                    return false;
                }
            }
            else {
                if (count2 > 0 && count1 > 0) {
                    count2--;
                    count1--;
                }
                else if (count1 >= 3) {
                    count1 -= 3;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 5, 5, 10, 20};
        int[] arr2 = {5, 5, 10, 10, 20};

        boolean ans1 = lemonadeChange(arr1);
        if (ans1) {
            System.out.println("Change can be given");
        } else {
            System.out.println("Change can't be given");
        }

        boolean ans2 = lemonadeChange(arr2);
        if (ans2) {
            System.out.println("Change can be given");
        } else {
            System.out.println("Change can't be given");
        }
    }
}
