package com.scope;

public class Exceptions {
    public static void main(String[] args) throws Exception {
        // System.out.println(29/0); // will give error
        
        int denominator = 0;
        int[] integerArray = {1,2,3};

        try {

            if (denominator == 0) {
                // throw new Error("Denominator is Zero");
                throw new Exception("Denominator is Zero");
                // throw new RuntimeException("Denominator is Zero");
            }

            System.out.println(29/denominator);
            // System.out.println(integerArray[4]);
        } catch (ArithmeticException arthm) {
            System.out.println("Printing any kind of Arithmetic Exception --> " + arthm.getMessage());
        } catch (NullPointerException npe) {
            System.out.println("Printing any kind of NullPointer Exception --> " + npe.getMessage());
        } catch (ArrayIndexOutOfBoundsException arroutof) {
            System.out.println("Printing any kind of ArrayIndex OutOf BoundsException --> " + arroutof.getMessage());
        } catch (Exception execp) {
            System.out.println("Printing any kind of Exception --> " + execp.getMessage());
        } finally {
            System.out.println("Finally : " + denominator);
        }
    }
}
