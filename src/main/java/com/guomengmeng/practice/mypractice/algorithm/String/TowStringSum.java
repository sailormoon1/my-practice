package com.guomengmeng.practice.mypractice.algorithm.String;

/**
 * 两个非常大的数字字符串做加
 */
public class TowStringSum {
    public static void main(String[] args) {
        String str = "456";
        String str1 = "45683";
        char[] strCharArray = str.toCharArray();
        char[] str1CharArray = str1.toCharArray();

        int index =str.length()-1;
        int index1 =str1.length()-1;
        boolean add=false;

        StringBuffer sb = new StringBuffer("");
        while(index1>=0 && index>=0){
            int item =0;
            item = strCharArray[index]-'0'+str1CharArray[index1]-'0';
            item = add?item+1:item;
            if(item>=10){
                add=true;
                item = item -10;
            }
            sb.append(item);

            index1 --;
            index--;
        }

        while(index>=0 || index1>=0){
            if(index>=0){
                int item = strCharArray[index]-'0'+ (add?1:0);
                if(item>=10){
                    add=true;
                    item=item%10;
                }else add=false;
                sb.append(item);
                index--;
            }
            if(index1>=0){
                int item1 = str1CharArray[index1]-'0'+ (add?1:0);
                if(item1>=10){
                    add=true;
                    item1=item1%10;
                }else add=false;
                sb.append(item1);
                index1--;
            }
        }

        System.out.println("sy:"+sb.reverse().toString());
    }
}
