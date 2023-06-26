package org.example;

public class SwitchStatement {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("value was 1");
//        } else if (value == 2){
//            System.out.println("value was 2");
//        } else {
//            System.out.println("value was not 1 or 2");
//        }

        //normal if else statement but now switch
        int switchValue = 3;
        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("value was not 1 or 2");
                break;
        }
        //break
    }
}
